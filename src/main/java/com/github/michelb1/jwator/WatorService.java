package com.github.michelb1.jwator;

import java.util.HashMap;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class WatorService {

    private HashMap<Integer,Entity> fishPositions;
    private HashMap<Integer,Entity> sharkPositions;
    private HashMap<Integer,Entity> watorMap;

    private int scale = Config.SCALE;
    private int fieldCount = Config.HEIGHT*Config.WIDTH/(scale*scale);

    public void initData(){
        
        watorMap = new HashMap<Integer,Entity>();
        fishPositions = new HashMap<Integer,Entity>();
        sharkPositions = new HashMap<Integer,Entity>();

        initFishFields();
        initSharkFields();
    }

    private void initFishFields() {
        int count = 0;
        while(count < Config.CNT_FISH){
            Integer pos = randNumber(0,fieldCount);
            Fish fish = new Fish();

            if(fishPositions.put(pos, fish)==null){
                watorMap.put(pos, fish);
                count++;
            }
        }
    }

    private void initSharkFields() {
        int count = 0;
        while(count < Config.CNT_SHARK){
            Integer pos = randNumber(0,fieldCount);
            Shark shark = new Shark();
            
            if(fishPositions.get(pos)== null && sharkPositions.put(pos, shark)==null){
                watorMap.put(pos, shark);
                count++;
            }
        }
    }

    private void calculateFishActions(){
        HashMap<Integer,Entity> fishPositionsTemp = new HashMap<Integer,Entity>();

        for(Integer pos : fishPositions.keySet()){
            Fish fish = (Fish)fishPositions.get(pos);
            fish.setAge(fish.getAge()+1);

            //moving
            Integer newPos = calculatePosition(randNumber(1, 5), pos);
            if(watorMap.get(newPos) == null){
                fishPositionsTemp.put(newPos, fish);
                watorMap.put(newPos, fish);

                //breeding
                if(fish.getAge()>=fish.getBreedAge()){
                    Fish newFish = new Fish();
                    fishPositionsTemp.put(pos, newFish);
                    watorMap.replace(pos, newFish);
                    fish.setAge(0);
                } else {
                    watorMap.remove(pos);
                }
            } else {
                fishPositionsTemp.put(pos, fish);
            }


        }
        fishPositions = fishPositionsTemp;
    }

    public Integer calculatePosition(Integer index, Integer pos){
        //left
        if(Integer.valueOf(1).equals(index)){
            var postmp = pos -1;
            if(pos % (Config.WIDTH/Config.SCALE)==0){
                return pos+(Config.WIDTH/Config.SCALE)-1;
            } else {
                return postmp;
            }
        }
        //right
        if(Integer.valueOf(2).equals(index)){
            var postmp = pos +1;
            if((pos+1) % ((Config.WIDTH/Config.SCALE))==0){
                return pos-(Config.WIDTH/Config.SCALE)+1;
            } else {
                return postmp;
            }
        }
        //up
        if(Integer.valueOf(3).equals(index)){
            var postmp = pos - (Config.WIDTH/Config.SCALE);
            if(pos>(Config.WIDTH/Config.SCALE)-1){
                return postmp;
            } else {
                return postmp + fieldCount;
            }
        }
        //down
        if(Integer.valueOf(4).equals(index)){
            var postmp = pos + (Config.WIDTH/Config.SCALE);
            if(pos>=fieldCount-(Config.WIDTH/Config.SCALE)){
                return pos-(((Config.HEIGHT/Config.SCALE)-1)*(Config.WIDTH/Config.SCALE));
            } else {
                return postmp;
            }
        }
        return null;
    }

    private void calculateSharkActions(){
        HashMap<Integer,Entity> sharkPositionsTemp = new HashMap<Integer,Entity>();

        for(Integer pos : sharkPositions.keySet()){
            Shark shark = (Shark)sharkPositions.get(pos);

            //-1 Energy per tick
            shark.setEnergy(shark.getEnergy()-1);
            
            //Dieing
            if(shark.getEnergy()<=0){
                watorMap.remove(pos);
                continue;
            }

            //moving/eating
            Integer newPos = calculatePosition(randNumber(1, 5), pos);
            if(watorMap.get(newPos) == null){
                //move
                watorMap.remove(pos);
                sharkPositionsTemp.put(newPos, shark);
                watorMap.put(newPos, shark);
            } else if(watorMap.get(newPos).getType().equals(WatorType.FISH)){
                //eat
                shark.setEnergy(shark.getEnergy()+watorMap.get(newPos).getEnergy());
                fishPositions.remove(newPos);
                //move
                watorMap.remove(pos);
                sharkPositionsTemp.put(newPos, shark);
                watorMap.put(newPos, shark);
            } else {
                sharkPositionsTemp.put(pos, shark);
            }

            //breeding
            if(shark.getEnergy()>=shark.getBreedEnergy()){
                Integer newSharkPos = calculatePosition(randNumber(1, 5), pos);

                if(watorMap.get(newSharkPos) == null){
                    int newEnergy = shark.getEnergy()/2;
                    Shark newShark = new Shark();
                    newShark.setEnergy(newEnergy);
                    shark.setEnergy(newEnergy);
                    sharkPositionsTemp.put(newSharkPos, newShark);
                    watorMap.put(newSharkPos, newShark);
                }

            }
        }
        sharkPositions = sharkPositionsTemp;
    }

    public void updateData() {
        calculateFishActions();
        calculateSharkActions();
    }

    private Integer randNumber(int low, int high){
        Random r = new Random();
        int result = r.nextInt(high-low) + low;

        return Integer.valueOf(result);
    }

    public HashMap<Integer,Entity> getWatorMap() {
        return this.watorMap;
    }

    public void setWatorMap(HashMap<Integer,Entity> watorMap) {
        this.watorMap = watorMap;
    }
    
    public int getScale() {
        return this.scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getFieldCount() {
        return this.fieldCount;
    }

    public void setFieldCount(int fieldCount) {
        this.fieldCount = fieldCount;
    }
}