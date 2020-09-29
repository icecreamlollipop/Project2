package ZooAnimals;

public class Animal
{
	private String name;

	public Animal(String name)
	{
		this.name = name;
	}
	
    public String getName()
    {
        return name;
    }
	
	public void wakeUp()
	{
		System.out.println(name + " awakens from a deep slumber.");
	}
	public void sleep()
	{
		System.out.println(name + " falls into a sleepy stupor.");
	}
	public void makeNoise()
	{
		System.out.println(name + " emits an audible response.");
	}
	public void roam()
	{
		System.out.println(name + " roams.");
	}
	
}
