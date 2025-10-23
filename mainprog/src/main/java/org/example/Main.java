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

        Car carA = new Car(15000, 2020, 150);
        Car carB = new Car(10000, 2018, 200);
        Car carC = new Car(15000, 2020, 100);
        Car carD = new Car(15000, 2022, 150);
        Car carE = new Car(10000, 2022, 250);

        System.out.println("A vs B (Ціна 15k vs 10k): " + carA.compareTo(carB));
        System.out.println("A vs D (Рік 2020 vs 2022): " + carA.compareTo(carD));
        System.out.println("A vs C (HP 150 vs 100): " + carA.compareTo(carC));
        System.out.println("B vs E (Рік 2018 vs 2022): " + carB.compareTo(carE));
    }
}
