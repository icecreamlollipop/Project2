package ZooAnimals;

public class Pachyderm extends Animal
{
    public Pachyderm(String name)
    {
        super(name);
    }

    public void roam(){
    	int rng = (int) ((Math.random() * 100) + 1);
        if (rng <= 25)
			charge();
		else
			System.out.println(getName() + " roams in the grasslands.");
    }

    public void charge()
    {
        System.out.println(getName() + " decides to charge.");
    }

}
