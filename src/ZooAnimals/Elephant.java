package ZooAnimals;

public class Elephant extends Pachyderm
{
	private EatStrategy strategy;
	
	public Elephant(String name, EatStrategy strategy)
	{
		super(name + " the Elephant");
		this.strategy = strategy;
	}
    public Elephant(String name){
        super(name + " the Elephant");
    }
    public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}
