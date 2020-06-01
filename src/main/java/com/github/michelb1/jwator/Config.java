package com.github.michelb1.jwator;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Config {

    public static final int WIDTH = 1024;
    public static final int HEIGHT = 768;
    public static final int REFRESHRATE = 50;
    public static final int SCALE = 4;

    public static final int CNT_SHARK = 100;
    public static final int CNT_FISH = 200;

    public static final int FISH_BREED = 3;
    public static final int FISH_ENERGY = 10;

    public static final int SHARK_BREED_ENERGY = 30;
    public static final int SHARK_ENERGY = 10;

    private ConfigurableApplicationContext context;

    private int cntShark = CNT_SHARK;
    private int cntFish = CNT_FISH;
    private int fishBreed = FISH_BREED;
    private int fishEnergy = FISH_ENERGY;
    private int sharkBreedEnergy = SHARK_BREED_ENERGY;
    private int sharkEnergy = SHARK_ENERGY;

    public ConfigurableApplicationContext getContext() {
        return this.context;
    }

    public void setContext(ConfigurableApplicationContext context) {
        this.context = context;
    }

    public int getCntShark() {
        return this.cntShark;
    }

    public void setCntShark(int cntShark) {
        this.cntShark = cntShark;
    }

    public int getCntFish() {
        return this.cntFish;
    }

    public void setCntFish(int cntFish) {
        this.cntFish = cntFish;
    }

    public int getFishBreed() {
        return this.fishBreed;
    }

    public void setFishBreed(int fishBreed) {
        this.fishBreed = fishBreed;
    }

    public int getFishEnergy() {
        return this.fishEnergy;
    }

    public void setFishEnergy(int fishEnergy) {
        this.fishEnergy = fishEnergy;
    }

    public int getSharkBreedEnergy() {
        return this.sharkBreedEnergy;
    }

    public void setSharkBreedEnergy(int sharkBreedEnergy) {
        this.sharkBreedEnergy = sharkBreedEnergy;
    }

    public int getSharkEnergy() {
        return this.sharkEnergy;
    }

    public void setSharkEnergy(int sharkEnergy) {
        this.sharkEnergy = sharkEnergy;
    }

}
