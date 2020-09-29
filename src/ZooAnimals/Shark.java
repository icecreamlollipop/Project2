package ZooAnimals;

public class Shark extends Chondrichthyes implements EatStrategy
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
