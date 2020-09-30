package ZooAnimals;

public class Elephant extends Pachyderm
{
	public Elephant(String name)
	{
		super(name + " the Elephant");
		this.strategy = new EatsGrass();
	}
}
