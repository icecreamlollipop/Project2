package ZooAnimals;

public class Lynx extends Feline
{
	public Lynx(String name) 
	{
		super(name + " the Lynx");
	}
	public void eat()
    	{
    		System.out.println(getName() + " eats some mice.");
	}
}
