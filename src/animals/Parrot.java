package animals;


import types.Bird;

/**
 * Write a description of class animals.Parrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parrot extends Bird
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Parrot
     */
    public Parrot()
    {
        super("Parrot", "Colorful, Mimics sound.");
        this.age = "very young";
    }

    public Parrot(String name)
    {
        super(name, "Colorful, Mimics sound.");
        this.age = "very young";
    }

    @Override
    public String makeNoise()
    {
        return "SQAAAAAAW. Look up... SQAAAAAAAAAW...";
    }

    
    
}
