package animals;


import types.Equine;

/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Equine
{
    // instance variables - replace the example below with your own
    private String age;


    public Zebra()
    {
        super("Zebra", "Black with white stripes, or is it white with black stripes?");
        this.age = "Adolescent";
    }

    public Zebra(String name)
    {
        super(name, "Black with white stripes, or is it white with black stripes?");
        this.age = "Adolescent";
    }

    @Override
    public String makeNoise()
    {
        // put your code here
        return "I'm ten years old. My life is half over and I don't even know if I'm black with white stripes or white with black stripes!";
    }
}