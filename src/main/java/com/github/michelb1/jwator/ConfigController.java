package com.github.michelb1.jwator;

import java.awt.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigController {

    private final WatorService wator;
    private final Config config;

    @Autowired
    public ConfigController(ConfigPanel panel, Config config, WatorService wator) {

        this.config = config;
        this.wator = wator;

        initValues(panel);
        initListener(panel);

    }

    private void initListener(ConfigPanel panel) {

        panel.getReset().addActionListener((ActionEvent arg0) -> {
            reset(panel);
        });

    }

    private void initValues(ConfigPanel panel) {

        panel.getFishCountValue().setText("" + config.getCntFish());
        panel.getSharkCountValue().setText("" + config.getCntShark());
        panel.getSharkBreedEnergyValue().setText("" + config.getSharkBreedEnergy());
        panel.getSharkEnergyValue().setText("" + config.getSharkEnergy());
        panel.getFishBreedTimeValue().setText("" + config.getFishBreed());
        panel.getFishEnergyValue().setText("" + config.getFishEnergy());

    }

    private void reset(ConfigPanel panel) {

        config.setCntFish(Integer.valueOf(panel.getFishCountValue().getText()));
        config.setCntShark(Integer.valueOf(panel.getSharkCountValue().getText()));
        config.setFishBreed(Integer.valueOf(panel.getFishBreedTimeValue().getText()));
        config.setFishEnergy(Integer.valueOf(panel.getFishEnergyValue().getText()));
        config.setSharkBreedEnergy(Integer.valueOf(panel.getSharkBreedEnergyValue().getText()));
        config.setSharkEnergy(Integer.valueOf(panel.getSharkEnergyValue().getText()));
        wator.initData();
    }

}
