package ZooAnimals;

public class Wolf extends Canine
{
	public Wolf(String name)
	{
		super(name + " the Wolf");
		this.strategy = new EatsSheep();
	}
	public void makeNoise()
	{
		System.out.println(getName() + " makes a loud grumble as if it wants to eviscerate an animal.");
	}

}
