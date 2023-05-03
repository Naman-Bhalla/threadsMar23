package com.scaler.lld.designpatterns.practicalfactory.birds;

public class BirdFactory {

    public static Bird createBirdOfType(BirdType birdType) {
        return switch (birdType) {
            case HEN -> new Hen();
            case PEACOCK -> new Peacock();
            case CROW -> new Crow();
            case SPARROW -> new Sparrow();
            default -> new Bird();
        };
    }

    public static Bird createObjectFromStringType(String str) {
        if (str.equalsIgnoreCase("HEN")) {
            return new Hen();
        } else if (str.equalsIgnoreCase("CROW")) {
            return new Crow();
        } else if (str.equalsIgnoreCase("PEACOCK")) {
            return new Peacock();
        }

        return null;
    }

    public static Bird createBirdOfSeason(Season season) {
        return null;
    }
}
