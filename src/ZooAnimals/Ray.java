package ZooAnimals;

public class Ray extends Chondrichthyes
{
    public Ray(String name)
    {
        super(name + " the Ray");
    }
    public void eat()
    {
    	System.out.println(getName() + " eats some krill.");
	}
}
