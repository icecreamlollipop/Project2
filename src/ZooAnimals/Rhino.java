package ZooAnimals;

public class Rhino extends Pachyderm
{
	private EatStrategy strategy;
	
	public Rhino(String name, EatStrategy strategy)
	{
		super(name + " the Rhino");
		this.strategy = strategy;
	}
    public Rhino(String name){
        super(name + " the Rhino");
    }
    public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}