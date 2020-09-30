package ZooAnimals;

public class Lynx extends Feline
{
	public Lynx(String name)
	{
		super(name + " the Lynx");
		this.strategy = new EatsMice();
	}
}
