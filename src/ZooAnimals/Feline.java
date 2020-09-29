package ZooAnimals;

public class Feline extends Animal 
{
	public Feline(String name)
	{
		super(name);
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + " purrs violently.");
	}
	public void roam()
	{
        	System.out.println(getName() + " roams in the forest.");
    }
	public void sleep()
	{
		int rng = (int) ((Math.random() * 100) + 1);
		
		//Felines don't care what you tell them
		if (rng <= 30)
			roam();
		else if (rng > 70)
			makeNoise();
		else
			super.sleep();
	}
}
