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
		zoo.add(new Cat("Cindy", EatStrategy.lapMilk()));
		zoo.add(new Cat("Carl"));
		
		zoo.add(new Dog("Devon"));
		zoo.add(new Dog("Dandy"));
		
		zoo.add(new Elephant("Ellie"));
		zoo.add(new Cat("Elizabeth"));
		
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
		
		//create zookeeper
		ZooEmployee zoolad = new ZooEmployee(zoo);
		
		//main runtime
		Scanner input = new Scanner(System.in);
		System.out.println("How many days should the zoo run for?");
		int days = input.nextInt();
		int d = 1;
		
		while (days > 0)
		{
			System.out.println("Zookeeper arrives at Zoo on Day " + d + ".");
			zoolad.awakenAnimals();
			zoolad.rollCall();
			zoolad.feeding();
			zoolad.exerciseAnimals();
			zoolad.tuckIn();
			d++;
			days--;
			System.out.println("Zookeeper heads home for the day.");
		}
	}
}