package ZooAnimals;

public class Hippo extends Pachyderm
{
	public Hippo(String name)
	{
		super(name + " the Hippo");
		this.strategy = new EatsGrass();
	}
}
