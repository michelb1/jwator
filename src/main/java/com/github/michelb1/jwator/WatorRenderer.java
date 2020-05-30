package com.github.michelb1.jwator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WatorRenderer {

    @Autowired
    private WatorService wator;

    public void draw(Graphics g) {

        HashMap<Integer,Entity> map = wator.getWatorMap();

        Graphics2D g2d = (Graphics2D) g.create();

        int x = 0;
        int y = 0;
        int fieldnr = 0;
        while(y < Config.HEIGHT){
            while(x < Config.WIDTH){
                Entity entity = map.get(fieldnr);
                g2d.setColor(getColor(entity));
                g2d.fillRect(x, y, Config.SCALE, Config.SCALE);
                x+=Config.SCALE;
                fieldnr++;
            }
            x=0;
            y+=Config.SCALE;            
        }
        g.dispose();
    }

    private Color getColor(Entity entity){
        if(entity==null){
            return Color.BLUE;
        }
        if(WatorType.FISH.equals(entity.getType())){
            return Color.GREEN;
        } else {
            return Color.RED;
        }        
    }
    
}