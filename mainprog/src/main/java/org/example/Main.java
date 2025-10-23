package org.example;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dog1");

        Cat myCat = new Cat("Cat1");

        System.out.println(myDog.getName() + " says: " + myDog.makeSound());
        System.out.println(myCat.getName() + " says: " + myCat.makeSound());

        // Одеса
        Smartphone myPhone = new Smartphone("Pixel 8", 46.4775, 30.7323);

        System.out.println("--- Функціонал GPS ---");
        myPhone.displayLocation();

        double[] coords = myPhone.getCoordinates();
        System.out.printf("Трекер показує: (%.2f, %.2f)%n", coords[0], coords[1]);

        System.out.println("--- Функціонал Cellular ---");
        myPhone.makeCall();
        myPhone.receiveCall();
    }
}
