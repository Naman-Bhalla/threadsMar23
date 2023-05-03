package com.scaler.lld.designpatterns.practicalfactory;

import com.scaler.lld.designpatterns.practicalfactory.birds.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public void haveRaceOfBirds(List<BirdType> birdType) {
        List<Bird> birds = new ArrayList<>();

        for (BirdType type: birdType) {
            birds.add(BirdFactory.createBirdOfType(type));
        }


    }

    public static void main(String[] args) {
        BirdType birdType;
        Bird bird;

//        if (birdType.equals(BirdType.HEN)) {
//            bird = new Hen();
//        } else if (birdType.equals(BirdType.CROW)) {
//            bird = new Crow();
//        }

        bird = BirdFactory.createBirdOfType(birdType);
    }
}
