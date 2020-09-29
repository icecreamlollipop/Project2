import java.util.ArrayList;

public class ZooAnnouncer extends ZooEmployee
{
	
	ZooAnnouncer() 
	{
		return;
	}

	public void announce(String event)
	{
		switch (event)
		{
		case "awaken":
			System.out.println("The Zookeeper is about to wake the animals!");
			break;
		case "rollcall":
			System.out.println("The Zookeeper is about to take roll!");
			break;
		case "feed":
			System.out.println("The Zookeeper is about to feed the animals!");
			break;
		case "exercise":
			System.out.println("The Zookeeper is about to exercise the animals!");
			break;
		case "tuckin":
			break;
		}
	}
}