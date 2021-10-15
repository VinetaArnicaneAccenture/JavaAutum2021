package sef.module17.activity;

/**
 * @author = Vineta Arnicane
 *
 */


import junit.framework.TestCase;
/*
2.1) Create a new MyAnimalTest class
2.2) Add private attribute animals
        2.3) Create a setUp method which will initialize Animals
        2.4) Create 3 tests which will validate excat text of "getColorAndSpecies"
        method returned is as expected. Colors used can be of your choice.
        2.5) Create a test where you add a species to List and validate that the species has been added
        to the list
*/

public class AnimalsTest extends TestCase {

    private Animals theAnimals;
    private String expectedText = "Animals species is: %s and its color is: %s";

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theAnimals = new Animals();
    }

    public void testSetAndGetColor() {
        String myColor = "red";
        assertNull(theAnimals.getColor());
        theAnimals.setColor(myColor);
        assertEquals(myColor, theAnimals.getColor());
    }

    public void testGetColorAndSpecies() {
        String myColor = "red";
        theAnimals.setColor(myColor);
        assertEquals(myColor, theAnimals.getColor());
        String mySpecies;
        mySpecies= "Animals species is: Dog Cat Mouse and its color is: " + myColor;
        assertEquals(mySpecies,(theAnimals.getColorAndSpecies()));
    }

    //Create test which will validate that Dog text is returned
    public void testBlueDogAnimal() {
        theAnimals.setColor("blue");
        assertEquals(String.format(expectedText, "Dog", "blue"), theAnimals.getColorAndSpecies("blue", 0));
    }

    //Create test which will validate that Cat text is returned
    public void testBlueCatAnimal() {
        theAnimals.setColor("blue");
        assertEquals(String.format(expectedText, "Cat", "blue"), theAnimals.getColorAndSpecies("blue", 1));
    }

    //Create test which will validate that Mouse text is returned
    public void testBlueMouseAnimal() {
        theAnimals.setColor("blue");
        assertEquals(String.format(expectedText, "Mouse", "blue"), theAnimals.getColorAndSpecies("blue", 2));
    }
    //Create a test were you need to add new species and validate
//that the entry in array has been made
    public void testAddSpecies() {
        theAnimals.setSpecie("babby shark");
        int sizeOfAnimals = theAnimals.getSpecies().size();
        assertEquals("babby shark", theAnimals.getSpecie(sizeOfAnimals - 1));
    }

    public void testBlueMouseAnimalNew() {
        String testColor="blue";
        String testAnimal="Mouse";
        int testIndex=2;

        theAnimals.setColor(testColor);
        assertEquals(String.format(expectedText, testAnimal, testColor), theAnimals.getColorAndSpecies(testColor, testIndex));
    }


}


