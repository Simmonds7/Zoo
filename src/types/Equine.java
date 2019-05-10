package types;

import animal_qualities.Walking;
import main.Animal;

public class Equine extends Animal implements Walking
{
    public Equine()
    {
        super("Equine", "Horses... And stuff like horses...");

    }
    public Equine(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Neigh";
    }
    public String eat()
    {
        return "Öats";
    }
    public String walk() {return "Gallops and trots";}


}
