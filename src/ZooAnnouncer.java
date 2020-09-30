import java.beans.*;
import java.util.*;

public class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener
{
	ZooEmployee observed;
	public ZooAnnouncer(ArrayList<ZooAnimals.Animal> zoo) 
	{
		super(zoo);
	}

	public void arrive(int d, ZooEmployee observed) {
		System.out.println("Announcer arrived on day "+d+".");
		this.observed = observed;
		observed.addPropertyChangeListener(this);
	}
	
	@Override public void propertyChange(PropertyChangeEvent evt)
	{
		String event = (String)evt.getNewValue();
		switch (event)
		{
		case "awaken":
			System.out.println("Announcer says: The Zookeeper is about to wake the animals!");
			break;
		case "rollcall":
			System.out.println("Announcer says: The Zookeeper is about to take roll!");
			break;
		case "feed":
			System.out.println("Announcer says: The Zookeeper is about to feed the animals!");
			break;
		case "exercise":
			System.out.println("Announcer says: The Zookeeper is about to exercise the animals!");
			break;
		case "tuckin":
			System.out.println("Announcer says: The Zookeeper is about to tuck the animals in!");
			break;
		case "leave":
			System.out.println("Announcer says: The Zookeeper left!");
			leave();
			break;
		}
		
	}
	
	@Override
	public void leave() {
		System.out.println("Announcer left for the day.");
		observed.removePropertyChangeListener(this);
	}
}