package com.github.michelb1.jwator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Fish implements Entity {

    private int breedAge;
    private int energy;
    private int age = 0;

    @Autowired
    public Fish(Config config) {
        breedAge = config.getFishBreed();
        energy = config.getFishEnergy();
    }

    @Override
    public WatorType getType() {
        return WatorType.FISH;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getBreedAge() {
        return this.breedAge;
    }

    public void setBreedAge(int breedAge) {
        this.breedAge = breedAge;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
