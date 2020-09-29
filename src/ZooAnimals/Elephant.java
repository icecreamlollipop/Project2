package ZooAnimals;

public class Elephant extends Pachyderm implements EatStrategy
{
    public Elephant(String name){
        super(name + " the Elephant");
    }
    public void eat(){
				System.out.println(getName() + " eats some roots.");
		}
}
