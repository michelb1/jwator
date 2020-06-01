package com.github.michelb1.jwator;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class WatorPanel extends JPanel {

    private static final long serialVersionUID = 9047013513961068030L;

    @Autowired
    private WatorRenderer renderer;

    public WatorPanel() {
        setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        renderer.draw(g);
    }

    @Override
    public boolean isOpaque() {
        return false;
    }
}
