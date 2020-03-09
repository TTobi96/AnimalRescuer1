package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Animal Rescuer game" );

        Animal animalReference = new Animal();
        animalReference.name = "Hera";
        animalReference.age = 5;
        animalReference.healthCondition = 4;
        animalReference.hungryLevel = 8;
        animalReference.happines = 6;
        animalReference.favoriteFood = "Steak";
        animalReference.favoriteGame = "Green ball";

        System.out.println("The rescued animal name is" + animalReference.name);


    }
}
