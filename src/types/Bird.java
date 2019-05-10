package types;

import animal_qualities.Flying;
import main.Animal;

public class Bird extends Animal implements Flying
{
    public Bird()
    {
        super("Birds", "Birds fly in de sky.");
    }

    public Bird(String name, String desc)
    {
        super(name, desc);
    }

    public String makeNoise()
    {
        return "SQRAAAAAAAAAAW";
    }

    public String eat()
    {
        return "worms, the souls of the damned, and seeds";
    }

    public String fly() {return "Fly around with ease";}
}
