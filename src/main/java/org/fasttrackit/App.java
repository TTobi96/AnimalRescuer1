package org.fasttrackit;

import java.time.LocalDate;

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
        animalReference.healthLevel = 4;
        animalReference.hungryLevel = 8;
        animalReference.happinesLevel = 6;
        animalReference.favoriteFood = "Steak";
        animalReference.favoriteGame = "Green ball";

        Rescuer rescuerNew = new Rescuer();
        rescuerNew.profession = "Engineer";
        rescuerNew.money=600;

        Doctor veterinarian = new Doctor();
        veterinarian.name="Dr. Mircea";
        veterinarian.major = "medic veterinar";

        Food food1= new Food();
        food1.stockAvailability=true;

        PlayingTime play = new PlayingTime();
        play.name = "4";

                System.out.println("The rescued animal name is " + animalReference.name);
        System.out.println("The rescued animal is " + animalReference.age + " years old" );
        System.out.println("The rescued animal health condition is " + animalReference.healthLevel);
        System.out.println("The rescued animal hunger level is " + animalReference.hungryLevel);
        System.out.println("The rescued animal happines level is " + animalReference.happinesLevel);
        System.out.println("The rescued animal's favorite food is " + animalReference.favoriteFood);
        System.out.println("The rescued animal favorite game " + animalReference.favoriteGame);
        System.out.println();
        System.out.println("The new owners profession is " + rescuerNew.profession);
        System.out.println("The new owners budget is " + rescuerNew.money + " lei");
        System.out.println();
        System.out.println("The doctors name is " + veterinarian.name);
        System.out.println("the doctors major is " + veterinarian.major);
        System.out.println();
        if(food1.stockAvailability==true)
            System.out.println("They still have animal food in stock so thats"+ food1.stockAvailability);
        System.out.println();
        System.out.println("You have to play minimun of " + play.name + " hours with the animal");

    }
}
