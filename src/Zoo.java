import ZooAnimals.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo 
{
	public static void main(String[] args) 
	{
		//create zoo
		ArrayList<Animal> zoo = new ArrayList<Animal>(); 
		//A cat is created and instantiated with a EatStrategy to lap milk
		zoo.add(new Cat("Cindy"));
		zoo.add(new Cat("Carl"));
		zoo.add(new Dog("Devon"));
		zoo.add(new Dog("Dandy"));
		
		zoo.add(new Elephant("Ellie"));
		zoo.add(new Elephant("Elizabeth"));
		
		zoo.add(new Hippo("Hippocrates"));
		zoo.add(new Hippo("Hanna"));
		
		zoo.add(new Lion("Leo"));
		zoo.add(new Lion("Liam"));
		
		zoo.add(new Lynx("Lizzie"));
		zoo.add(new Lynx("Lissandra"));
		
		zoo.add(new Ray("Rae"));
		zoo.add(new Ray("Randy"));
		
		zoo.add(new Rhino("Rudolph"));
		zoo.add(new Rhino("Rebecca"));
		
		zoo.add(new Shark("Sally"));
		zoo.add(new Shark("Shrek"));
		
		zoo.add(new Tiger("Tony"));
		zoo.add(new Tiger("Timmy"));
		
		zoo.add(new Wolf("Worwick"));
		zoo.add(new Wolf("Wally"));
		
		//create zoo employees
		ZooKeeper zoolad = new ZooKeeper(zoo);
		ZooFoodServer foodslave = new ZooFoodServer();
		ZooAnnouncer announcer = new ZooAnnouncer();
		announcer.addObserved(zoolad);
		announcer.addObserved(foodslave);
		
		ArrayList<ZooEmployee> employees = new ArrayList<ZooEmployee>();
		employees.add(zoolad);
		employees.add(foodslave);
		employees.add(announcer);
		
		//main runtime
		Scanner input = new Scanner(System.in);
		System.out.println("How many days should the zoo run for?");
		int days = input.nextInt(); 
		int d = 1;
		ZooClock clock = new ZooClock();
		while (days > 0)
		{
			
			System.out.println("============================================================");
			clock.startDay();
			do {
				int hour = clock.getHour();
				for (ZooEmployee e : employees) {
					e.doTaskAtTime(hour, d);
				}
			} while (clock.nextHour());

			System.out.println();
			d++;
			days--;

		}
		input.close();
	}
}