package com.github.michelb1.jwator;

import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;
import java.awt.event.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App
{
    @Autowired
    private MainFrame mainFrame;

    @Autowired
    private WatorService wator;

    private void startGui(){
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                mainFrame.initUI();
                mainFrame.setVisible(true);
            }
        });
    }

    private void startUpdateTask(){

        ActionListener task = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                long startTime = System.nanoTime();
                updateGui();       
                updateData();
                long elapsedTime = TimeUnit.MILLISECONDS.convert(System.nanoTime() - startTime, TimeUnit.NANOSECONDS);
                mainFrame.updateBenchmark(elapsedTime);
            }
        };
        Timer timer = new Timer(Config.REFRESHRATE ,task);
        timer.setRepeats(true);
        timer.start();
    }

    private void initData(){
        wator.initData();
    }

    private void updateData(){
        wator.updateData();    
    }

    private void updateGui(){
        mainFrame.update();
    }

    public void init(){
        startGui();
        initData();
        startUpdateTask();
    }

    public static void main(String[] args) {

        try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);)
        {
            applicationContext.getBean(App.class).init();
        }
    }
}
