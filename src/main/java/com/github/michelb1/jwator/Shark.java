package com.github.michelb1.jwator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Shark implements Entity {

    private int energy;
    private int breedEnergy;

    @Autowired
    public Shark(Config config) {
        energy=config.getSharkEnergy();
        breedEnergy=config.getSharkBreedEnergy();
    }

	@Override
	public WatorType getType() {
		return WatorType.SHARK;
	}

    @Override
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