package ZooAnimals;

public class Dog extends Canine
{
	public Dog(String name)
	{
		super(name + " the Dog");
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + " gives a playful bark as it wags it's tail.");
	}
	
	public void dig()
	{
		System.out.println(super.getName() + " digs a huge hole in the earth.");
	}
	public void eat()
    	{
    		System.out.println(getName() + " eats some bones.");
	}
	public void roam()
	{
		int rng = (int) ((Math.random() * 100) + 1);
		
		//Special Cases
		//dog digs 25% of the time
		if (rng <= 25)
			dig();
		else
			super.roam();
		
	}
}
