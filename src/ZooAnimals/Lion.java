package ZooAnimals;

public class Lion extends Feline
{
	public Lion(String name)
	{
		super(name + " the Lion");
		this.strategy = new EatsAntelopes();
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + "heaves a mighty roar!");
	}

}
