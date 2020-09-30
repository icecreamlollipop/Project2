package ZooAnimals;

public class Rhino extends Pachyderm
{
	
	public Rhino(String name)
	{
		super(name + " the Rhino");
		this.strategy = new EatsGrass();
	}

}