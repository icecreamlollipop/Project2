package ZooAnimals;

public class Ray extends Chondrichthyes
{
	public Ray(String name)
	{
		super(name + " the Ray");
		this.strategy = new EatsFish();
	}
}
