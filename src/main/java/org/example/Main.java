package org.example;


import src.Dog;

public class Main {
        public static void main(String[] args) {
            String [] comands = {"Shelter","Lejat"};
            Shelter shelter = new Shelter("Pease",
                    "Lenina 1 ");

            Object Color = null;
            Dog dog = new Dog( "Rex ","Ovcharka",comands,
                    Color.BROWN, shelter );
            System.out.println(dog.getInfo());
            dog.makeVoice();
            dog.makeVoice("Гав Гав");
        }
    }