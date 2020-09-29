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
		zoo.add(new Cat("Cindy", new DrinksMilk()));
		zoo.add(new Cat("Carl", new DrinksMilk()));
		zoo.add(new Dog("Devon", new EatsBones()));
		zoo.add(new Dog("Dandy", new EatsBones()));
		
		zoo.add(new Elephant("Ellie", new EatsRoots()));
		zoo.add(new Elephant("Elizabeth", new EatsRoots()));
		
		zoo.add(new Hippo("Hippocrates", new EatsGrass()));
		zoo.add(new Hippo("Hanna", new EatsGrass()));
		
		zoo.add(new Lion("Leo", new EatsAntelopes()));
		zoo.add(new Lion("Liam", new EatsAntelopes()));
		
		zoo.add(new Lynx("Lizzie", new EatsMice()));
		zoo.add(new Lynx("Lissandra", new EatsMice()));
		
		zoo.add(new Ray("Rae", new EatsKrill()));
		zoo.add(new Ray("Randy", new EatsKrill()));
		
		zoo.add(new Rhino("Rudolph", new EatsFruit()));
		zoo.add(new Rhino("Rebecca", new EatsFruit()));
		
		zoo.add(new Shark("Sally", new EatsTurtles()));
		zoo.add(new Shark("Shrek", new EatsTurtles()));
		
		zoo.add(new Tiger("Tony", new EatsDeer()));
		zoo.add(new Tiger("Timmy", new EatsDeer()));
		
		zoo.add(new Wolf("Worwick", new EatsSheep()));
		zoo.add(new Wolf("Wally", new EatsSheep()));
		
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