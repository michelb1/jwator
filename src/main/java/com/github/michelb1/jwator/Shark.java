package com.github.michelb1.jwator;

public class Shark implements Entity{

    private int energy;
    private int breedEnergy;

    public Shark() {
        energy=Config.SHARK_ENERGY;
        breedEnergy=Config.SHARK_BREED_ENERGY;
    }

	@Override
	public WatorType getType() {
		return WatorType.SHARK;
	}

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getBreedEnergy() {
        return this.breedEnergy;
    }

    public void setBreedEnergy(int breedEnergy) {
        this.breedEnergy = breedEnergy;
    }
    
}