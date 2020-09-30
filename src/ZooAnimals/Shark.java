package ZooAnimals;

public class Shark extends Chondrichthyes
{

	public Shark(String name)
	{
		super(name + " the Shark");
		this.strategy = new EatsFish();
	}

}
