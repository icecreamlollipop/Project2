package ZooAnimals;

public class Tiger extends Feline
{
	public Tiger(String name)
	{
		super(name + " the Tiger");
		this.strategy = new EatsDeer();
	}
}
