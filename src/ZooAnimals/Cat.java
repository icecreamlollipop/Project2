package ZooAnimals;


public class Cat extends Feline implements EatStrategy
{
	public Cat(String name) 
	{
		super(name + " the Cat");
	}
	public void eat()
    {
    	System.out.println(getName() + " eats some rabbits.");
	}
}
