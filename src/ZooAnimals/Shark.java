package ZooAnimals;

public class Shark extends Chondrichthyes
{
    public Shark(String name)
    {
        super(name + " the Shark");
    }
    public void eat()
    {
    	System.out.println(getName() + " eats some turtles.");
	}

}
