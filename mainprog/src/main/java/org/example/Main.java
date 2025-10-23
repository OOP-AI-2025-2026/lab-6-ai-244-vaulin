package org.example;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dog1");

        Cat myCat = new Cat("Cat1");

        System.out.println(myDog.getName() + " says: " + myDog.makeSound());
        System.out.println(myCat.getName() + " says: " + myCat.makeSound());
    }
}
