package com.OOPS.abstractClass;

import com.sun.jdi.PathSearchingVirtualMachine;

abstract class Animal {

    public abstract void makeSound();

    public void eat() {
        System.out.println("Eating...");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
    }
}


class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Barking...");
    }
    public void eat() {
        System.out.println("Dog is Eating Bone...");
    }

    // each class can have its own main
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.makeSound();
    }


}




