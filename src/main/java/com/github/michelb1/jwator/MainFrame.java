package com.github.michelb1.jwator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainFrame extends JFrame{

    private static final long serialVersionUID = -2694902946667053313L;

    @Autowired
    private WatorPanel panel;

    public MainFrame() {
    }

    public void initUI() {

        add(panel);

        setTitle("JWator");
        setSize(Config.WIDTH, Config.HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    }

    public void update(){
        panel.repaint();
    }

	public void updateBenchmark(long elapsedTime) {
        setTitle("JWator (Processing: " + elapsedTime + " ms)");
    }
    

    
}