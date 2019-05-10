package animals;

import types.Primate;

public class Ring_Tailed_Lemur extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Chimpanzee
     */
    public Ring_Tailed_Lemur()
    {
        super("Ring Tailed Lemur", "Lemur with striped tail.");
        this.age = "young";
    }

    public Ring_Tailed_Lemur(String name)
    {
        super(name, "Lemur with Striped tail, wearing a makeshift crown.");
        this.age = "young";
    }


    @Override
    public String makeNoise()
    {
        // put your code here
        return "I like to move it, move it / She like to move it, move it / He like to move it, move it / You like to... *Move it!*";
    }
}
