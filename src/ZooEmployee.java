import java.util.ArrayList;
import ZooAnimals.*;
import java.lang.Math.*;

public class ZooEmployee extends ZooKeeper
{	
	
	private ArrayList<ZooAnimals.Animal> zoo;
	
	public static enum AnimalAction {AWAKEN, ROLLCALL, FEED, EXERCISE, TUCKIN};
	
	void doForEveryAnimal(AnimalAction aa) {
		for (ZooAnimals.Animal a : zoo)
		{
			switch(aa) {
				case AWAKEN:
					System.out.println("Zookeeper wakes up " + a.getName());
					a.wakeUp();
					break;
				case ROLLCALL:
					a.makeNoise();
					break;
				case FEED: // switch statement here based on type of animal?
					System.out.println("Zookeeper feeds " + a.getName());
					if(a instanceof Cat) {
						Cat x = new Cat(a.getName());
						x.eat();
					}
					else if(a instanceof Dog) {
						Dog x = new Dog(a.getName());
						x.eat();
					}
					break;
				case EXERCISE:
					System.out.println("Zookeeper tells " + a.getName() + " to exercise.");
					a.roam();
					break;
				case TUCKIN:
					System.out.println("Zookeeper tucks in " + a.getName());
					a.sleep();
					break;
			}
		}
	}
	
	ZooEmployee(ArrayList zoo)
	{
		this.zoo = zoo;
	}

	@Override
	void awakenAnimals() 
	{
		doForEveryAnimal(AnimalAction.AWAKEN);
	}

	@Override
	void rollCall() 
	{
		System.out.println("Zookeeper takes roll");
		doForEveryAnimal(AnimalAction.ROLLCALL);
	}

	@Override
	void feeding() 
	{
		doForEveryAnimal(AnimalAction.FEED);
	}

	@Override
	void exerciseAnimals() 
	{
		doForEveryAnimal(AnimalAction.EXERCISE);
	}

	@Override
	void tuckIn() 
	{
		doForEveryAnimal(AnimalAction.TUCKIN);
	}

}
