package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal fido = new Dog();
        Animal fluffy = new Cat();

        Animal[] theAnimals = new Animals[10];

        theAnimals[0] = fido;
        theAnimals[1] = fluffy;

        System.out.println(" FIdo says " + theAnimals[0].makeSound());
        System.out.println("Fluffy says " + theAnimals[1].makeSound());

        int[] favoriteNumbers = new int[20];
        favoriteNumbers[0] = 100;

        String[] stringArray = {"Random", "Words", "Here"};

        for(String word: stringArray){
            System.out.println(word);
        }
    }
}
