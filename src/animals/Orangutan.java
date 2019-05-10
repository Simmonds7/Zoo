package animals;


import types.Primate;

/**
 * Write a description of class animals.Orangutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orangutan extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Orangutan()
    {
        super("Orangutan", "Orange, Large Primate.");
        this.age = "Old";
    }

    public Orangutan(String name)
    {
        super(name, "Orange, Large Primate.");
        this.age = "Old";
    }

    @Override
    public String makeNoise()
    {
        return "Now I'm the king of the swingers, the jungle V.I.P \n" +
                "I reached the top and had to stop \n" +
                "And that's what bothering me \n" +
                "I want to be a man, man-cub, and stroll right into town \n" +
                "And be just like those other men \n" +
                "I'm tired of monkeying around...";
    }
    
    
}
