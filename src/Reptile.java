import animal_qualities.Swimming;
import main.Animal;

public class Reptile extends Animal implements Swimming
{
    public Reptile()
    {
        super("Reptiles", "Reptiles do scaly things in the water.");
    }
    public Reptile(String name, String desc)
    {
        super(name, desc);
    }

    public String makeNoise()
    {
        return "(Reptile Noises?)";
    }
    public String eat()
    {
        return "Reptile Food";
    }
    public String swim() {return "Just keep swimming, just keep swimming, just keep swimming...";}
}
