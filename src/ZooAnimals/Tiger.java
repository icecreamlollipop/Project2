package ZooAnimals;

public class Tiger extends Feline implements EatStrategy
{
	public Tiger(String name) 
	{
		super(name + " the Tiger");
	}
	public void eat()
    	{
    		System.out.println(getName() + " eats some deer.");
	}
}
