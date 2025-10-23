package org.example;

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}


public class Smartphone implements GPS, Cellular {
    private final String model;
    private final double currentLatitude;
    private final double currentLongitude;

    public Smartphone(String model, double lat, double lon) {
        this.model = model;
        this.currentLatitude = lat;
        this.currentLongitude = lon;
    }


    @Override
    public double[] getCoordinates() {
        return new double[]{currentLatitude, currentLongitude};
    }

    @Override
    public void makeCall() {
        System.out.println(model + ": Ініціюється вихідний голосовий дзвінок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + ": Прийнято вхідний дзвінок. Розмова почалася.");
    }

    public void displayLocation() {
        double[] coords = getCoordinates();
        System.out.printf("%s: Поточні координати: Широта %.4f, Довгота %.4f%n",
                model, coords[0], coords[1]);
    }
}