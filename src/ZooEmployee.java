import ZooAnimals.*;
import java.util.ArrayList;
import java.beans.*;


public class ZooEmployee extends ZooKeeper
{	
	
	private String currTask;
	protected ArrayList<ZooAnimals.Animal> zoo;
	//private ZooAnnouncer announcer;
	private PropertyChangeSupport support;
	
	public static enum AnimalAction {AWAKEN, ROLLCALL, FEED, EXERCISE, TUCKIN};
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
	
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
	
	public ZooEmployee(ArrayList<ZooAnimals.Animal> zoo)
	{
		this.zoo = zoo;
		support = new PropertyChangeSupport(this);
	}
	
	public void setTask(String newTask) 
	{
		support.firePropertyChange("currTask", currTask, newTask);
		currTask = newTask;
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
	
	@Override
	void arrive(int d) {
		System.out.println("Zookeeper arrives at Zoo on Day " + d + ".");
	}
	@Override
	void leave() {
		System.out.println("Zookeeper heads home for the day.");
		setTask("leave");
	}

}
