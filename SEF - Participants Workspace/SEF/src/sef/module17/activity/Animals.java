package sef.module17.activity;

/**
 * @author = Vineta Arnicane
 *
 */

/*
1) In file Animals
        1.1) Create file Animals from scratch
        1.2) Implement private attributes :
        ArrayList<String> species = new ArrayList<>();
        String color

        1.3) Create setters and getters for color
        1.4) Create constructor for class Animals in which 3 animals are added to array list,
        animals added to list should be "Dog", "Cat", "Mouse"
        1.5) Create a method with name "getColorAndSpecies" which will return text like:
        "Animals species is: " + species + " and its color is: " + color;
        1.6) Create a setter and getter for species
        2) MyAnimalTest class
/
 */

import java.util.ArrayList;

public class Animals {
    private ArrayList<String> species = new ArrayList<>();
    private String color;


    // Default constructor
    public Animals() {
        this.species.add("Dog");
        this.species.add("Cat");
        this.species.add("Mouse");
    }

    // Setter for Color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for Color
    public String getColor() {
        return color;
    }

    // Setter for species
    public void setSpecie(String specie) {
        this.species.add(specie);
    }

    // Getter for Color
    public String getSpecie(int index) {
        return this.species.get(index);
    }

    public String getColorAndSpecies() {
        String toReturn = "";

        int sizeOfAnimals = species.size();

        for (int i = 0; i < sizeOfAnimals; i++) {
            if (i > 0) {
                toReturn = toReturn + " ";
            }
            toReturn = toReturn + species.get(i);
        }

        return "Animals species is: " + toReturn + " and its color is: " + color;
    }

    public String getColorAndSpecies(int index) {
        return "Animals species is: " + this.species.get(index) + " and its color is: " + color;
    }

    public String getColorAndSpecies(String color, int index) {
        return "Animals species is: " + this.species.get(index) + " and its color is: " + color;
    }

    public ArrayList<String> getSpecies() {
        return species;
    }

}

