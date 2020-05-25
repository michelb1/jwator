package com.github.michelb1.jwator;

public class Fish implements Entity{

    private int breedAge;
    private int energy;
    private int age = 0;

    public Fish() {
        breedAge = Config.FISH_BREED;
        energy = Config.FISH_ENERGY;
    }

    @Override
    public WatorType getType() {
        return WatorType.FISH;
    }

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