import java.util.ArrayList;

public class ZooKeeper extends ZooEmployee
{	
	private ArrayList<ZooAnimals.Animal> zoo;
	
	public static enum AnimalAction {AWAKEN, ROLLCALL, FEED, EXERCISE, TUCKIN};
	
	public ZooKeeper(ArrayList<ZooAnimals.Animal> zoo)
	{
		this.zoo = zoo;
	}
	
	@Override
	public String employeeType() {return "Zookeeper";}
	
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
			case FEED:
				System.out.println("Zookeeper feeds " + a.getName());
				a.eat();
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

	void awakenAnimals() 
	{
		setTask("wake the animals");
		doForEveryAnimal(AnimalAction.AWAKEN);
	}

	void rollCall() 
	{
		setTask("take roll");
		System.out.println("Zookeeper takes roll");
		doForEveryAnimal(AnimalAction.ROLLCALL);
	}

	void feeding() 
	{
		setTask("feed the animals");
		doForEveryAnimal(AnimalAction.FEED);
	}

	void exerciseAnimals() 
	{
		setTask("exercise the animals");
		doForEveryAnimal(AnimalAction.EXERCISE);
	}

	void tuckIn() 
	{
		setTask("tuck the animals in");
		doForEveryAnimal(AnimalAction.TUCKIN);
	}
	public void doTaskAtTime(int hour, int d) {
		super.doTaskAtTime(hour, d);
		if (hour==9) awakenAnimals();
		if (hour==10) rollCall();
		if (hour==14) feeding();
		if (hour==15) exerciseAnimals();
		if (hour==19) tuckIn();
	}
}
