package main;

import animal_qualities.Flying;
import animal_qualities.Swimming;
import animal_qualities.Walking;
import animals.*;
import main.Animal;
import retail.Concessions;
import retail.Gift_Shop;
import retail.Wallet;
import types.Primate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
/**
 * Test
 * 
 * @author APCSA2014-15 
 * @version 2015-03-06
 */
public class Zoo
{
    public static  void main(String[] args) throws InterruptedException 
    {
        List<Animal> animals = new ArrayList<Animal>();

        System.out.println("Welcome to the main.Zoo!\n");
        System.out.print("Building the cages");
        delayDots();
        System.out.print("Populating the animals");
        populateAnimals(animals);
        delayDots();
        System.out.print("Hiring zookeepers");
        delayDots();

        Scanner in = new Scanner(System.in);
        System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?");
        System.out.println("Type help to find out what you can do.\n");
        String text = in.nextLine();
        String msg = "";
        while(!text.equals("leave"))
        {
            switch(text)
            {
                case "help" : 
                msg = "So far we can visit cages, listen, add money to wallet, check balance, leave \n"+
                "and ask for help.";
                break;
                case "add money to wallet" :
                Wallet.setWallet();
                msg = "Wallet balance updated.";
                break;
                case "check balance" :
                msg = "Your current balance is " + Wallet.getWallet() + "$";
                break;
                case "visit cages" :
                msg = visitCages(animals);
                break;
                case "look up" :
                msg = lookUp(animals);
                break;
                case "look around" :
                msg = lookAround(animals);
                break;
                case "listen" :
                msg = listen(animals);
                break;
                case "look down":
                msg = lookDown(animals);
                break;
                case "concessions" :
                Concessions.ConcessionStands();
                msg = "Your balance after concessions is " + Wallet.getWallet() + "$.";
                break;
                case "giftshop" :
                Gift_Shop.GiftShop();
                msg = "Your balance after visiting the Gift Shop is " + Wallet.getWallet() + "$.";
                break;
                default : msg = "You flail helplessly with indecision.";
            }
            System.out.println("\n" + msg);
            delayDots(3);
            System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?\n");
            text = in.nextLine();
        }
        if (Wallet.getWallet() < 0)
        {
            System.out.println("Hey punk! You owe us " + Math.abs(Wallet.getWallet()) + "$!");
        }
        else
        {
            System.out.println(Math.random() < .8 ? "\nHave a nice day!  Hope you come back!" : "\nAn escaped lion eats you on your way out.  Sorry!");
        }
    }

    public static String visitCages(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       " + a.getDesc() + "\n";
        }
        return msg;
    }

    public static String listen(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       " 
            + a.makeNoise() + "\n" + "\n";
        }
        return msg;

    }

    public static String lookDown(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Swimming)
            {
                Swimming f = (Swimming) a;
                msg += a.getName() + ": \n       "
                + f.swim() + "\n";
            }
        }
        return msg;

    }

    public static String lookAround(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Walking) 
            {
                Walking w = (Walking) a;
                msg += a.getName() + ": \n       " 
                + w.walk() + "\n";
            }
        }
        return msg;

    }

    public static String lookUp(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Flying)
            {
                Flying f = (Flying) a;
                msg += a.getName() + ": \n       "
                + f.fly() + "\n";
            }
        }
        return msg;

    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots(int dotAmount) throws InterruptedException 
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots() throws InterruptedException 
    {
        delayDots(0);
    }

    /**
     * This is where we will all collaborate.
     * Construct your animal and add it to the List
     * @param animals the list containing all the zoo animals
     */
    public static void populateAnimals(List<Animal> animals)
    {
        Chimpanzee chip = new Chimpanzee("Chip the Chimpanzee");
        Parrot peter = new Parrot("Peter the Parrot");
        Orangutan louie = new Orangutan("King Louie the Orangutan");
        Zebra marty = new Zebra("Marty the Zebra");
        Alligator ticktock = new Alligator("Tick-Tock the Alligator");
        Ring_Tailed_Lemur kingjulian = new Ring_Tailed_Lemur("King Julian the Ring-Tailed Lemur");

        animals.add(chip);
        animals.add(peter);
        animals.add(louie);
        animals.add(marty);
        animals.add(ticktock);
        animals.add(kingjulian);


    }
}