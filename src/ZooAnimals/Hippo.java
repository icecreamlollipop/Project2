package ZooAnimals;

public class Hippo extends Pachyderm implements EatStrategy
{
    public Hippo(String name)
    {
        super(name + " the Hippo");
    }
    public void eat()
    {
		System.out.println(getName() + " eats some grass.");
	}
}
