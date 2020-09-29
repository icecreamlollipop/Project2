package ZooAnimals;

public class Chondrichthyes extends Animal
{
    public Chondrichthyes(String name)
    {
        super(name);
    }
    public void roam()
    {
		System.out.println(getName() + " roams in the water.");
	}
}
