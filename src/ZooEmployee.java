import ZooAnimals.*;
import java.util.ArrayList;


public class ZooEmployee extends ZooKeeper
{	
	
	private String currTask;
	private ArrayList<ZooAnimals.Animal> zoo;
	private ZooAnnouncer announcer;
	
	public static enum AnimalAction {AWAKEN, ROLLCALL, FEED, EXERCISE, TUCKIN};
	ZooEmployee()
	{
	}
	
	ZooEmployee(ArrayList zoo)
	{
		this.zoo = zoo;
		announcer = new ZooAnnouncer();
	}
	
	public void setTask(String newTask) 
	{
		currTask = newTask;
		announcer.announce(currTask);
		
    }
	
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
				// strategy pattern?
				case FEED: // switch statement here based on type of animal?
					System.out.println("Zookeeper feeds " + a.getName());
					if(a instanceof Cat) {
						Cat x = (Cat) a;
						x.eat();
					}
					else if(a instanceof Dog) {
						Dog x = (Dog) a;
						x.eat();
					}
					else if(a instanceof Elephant) {
						Elephant x = (Elephant) a;
						x.eat();
					}
					else if(a instanceof Hippo) {
						Hippo x = (Hippo) a;
						x.eat();
					}
					else if(a instanceof Lion) {
						Lion x = (Lion) a;
						x.eat();
					}
					else if(a instanceof Lynx) {
						Lynx x = (Lynx) a;
						x.eat();
					}
					else if(a instanceof Ray) {
						Ray x = (Ray) a;
						x.eat();
					}
					else if(a instanceof Rhino) {
						Rhino x = (Rhino) a;
						x.eat();
					}
					else if(a instanceof Shark) {
						Shark x = (Shark) a;
						x.eat();
					}
					else if(a instanceof Tiger) {
						Tiger x = (Tiger) a;
						x.eat();
					}
					else if(a instanceof Wolf) {
						Wolf x = (Wolf) a;
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

	@Override
	void awakenAnimals() 
	{
		setTask("awaken");
		doForEveryAnimal(AnimalAction.AWAKEN);
	}

	@Override
	void rollCall() 
	{
		setTask("rollcall");
		System.out.println("Zookeeper takes roll");
		doForEveryAnimal(AnimalAction.ROLLCALL);
	}

	@Override
	void feeding() 
	{
		setTask("feed");
		doForEveryAnimal(AnimalAction.FEED);
	}

	@Override
	void exerciseAnimals() 
	{
		setTask("exercise");
		doForEveryAnimal(AnimalAction.EXERCISE);
	}

	@Override
	void tuckIn() 
	{
		setTask("tuckin");
		doForEveryAnimal(AnimalAction.TUCKIN);
	}

}
