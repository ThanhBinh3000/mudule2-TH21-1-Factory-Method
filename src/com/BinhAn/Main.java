package com.BinhAn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal a1 = factoryAnimal.getAnimal("faline");
        System.out.println("a1 sound: "+ a1.makeSound());
        Animal a2 = factoryAnimal.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
