package animals;


import types.Reptile;

/**
 * Write a description of class animals.Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Reptile
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Alligator
     */
    public Alligator()
    {
        super("Alligator", "Green and scaly, might tick, run if that's the case.");
        this.age = "Very Old";
    }

    public Alligator(String name)
    {
        super(name, "Green and scaly, might tick, run if that's the case.");
        this.age = "Very Old";
    }


    @Override
    public String makeNoise()
    {
        return "tick tock, tick tock, tick tock";
    }
}