package com.github.michelb1.jwator;

import java.awt.EventQueue;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
import javax.swing.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {

    @Autowired
    private MainFrame mainFrame;

    @Autowired
    private ConfigFrame configFrame;

    @Autowired
    private WatorService wator;

    @Autowired
    private Config config;

    private void startConfigGui() {
        EventQueue.invokeLater(() -> {
            configFrame.initUI();
            configFrame.setVisible(true);
        });
    }

    private void startGui() {
        EventQueue.invokeLater(() -> {
            mainFrame.initUI();
            mainFrame.setVisible(true);
        });
    }

    private void startUpdateTask() {

        ActionListener task = (ActionEvent evt) -> {
            long startTime = System.nanoTime();
            updateGui();
            updateData();
            long elapsedTime = TimeUnit.MILLISECONDS.convert(System.nanoTime() - startTime, TimeUnit.NANOSECONDS);
            mainFrame.updateBenchmark(elapsedTime);
        };
        Timer timer = new Timer(Config.REFRESHRATE, task);
        timer.setRepeats(true);
        timer.start();
    }

    private void initData() {
        wator.initData();
    }

    private void updateData() {
        wator.updateData();
    }

    private void updateGui() {
        mainFrame.update();
    }

    public void init(ConfigurableApplicationContext context) {

        config.setContext(context);

        startGui();
        startConfigGui();

        initData();
        startUpdateTask();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        applicationContext.getBean(App.class).init(applicationContext);
    }
}
