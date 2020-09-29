package ZooAnimals;

public class Rhino extends Pachyderm
{
    public Rhino(String name){
        super(name + " the Rhino");
    }
    public void eat()
    {
		System.out.println(getName() + " eats some fruit.");
	}
}