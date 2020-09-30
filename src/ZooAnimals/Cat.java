package ZooAnimals;


public class Cat extends Feline
{
	public Cat(String name)
	{
		super(name + " the Cat");
		this.strategy = new EatsMice();
	}
}
