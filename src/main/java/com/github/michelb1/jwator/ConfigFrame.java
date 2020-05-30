package com.github.michelb1.jwator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class ConfigFrame extends JFrame{

    private static final long serialVersionUID = 5035257696322490482L;

    @Autowired
    private ConfigPanel panel;
    
    @Autowired
    private MainFrame frame;
    
    public ConfigFrame() {
    }

    public void initUI() {
        setTitle("JWatorConfig");
        add(panel);
        setLocation(frame.getX() + frame.getWidth(), frame.getY());
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
        setResizable(false);
        pack();
    }
    
}