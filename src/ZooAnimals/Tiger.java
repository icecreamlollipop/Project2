package ZooAnimals;

public class Tiger extends Feline
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
