package ZooAnimals;

public class Hippo extends Pachyderm
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
