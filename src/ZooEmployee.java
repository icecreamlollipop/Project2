import java.util.ArrayList;
import ZooAnimals.*;
import java.lang.Math.*;

public class ZooEmployee extends ZooKeeper
{	
	private ArrayList<ZooAnimals.Animal> zoo;
	
	ZooEmployee(ArrayList zoo)
	{
		this.zoo = zoo;
	}

	@Override
	void awakenAnimals() 
	{
		for (ZooAnimals.Animal a : zoo)
		{
			System.out.println("Zookeeper wakes up " + a.getName());
			a.wakeUp();
		}
	}

	@Override
	void rollCall() 
	{
		System.out.println("Zookeeper takes roll");
		for (ZooAnimals.Animal a : zoo)
		{
			a.makeNoise();
		}
	}

	@Override
	void feeding() 
	{
		for (ZooAnimals.Animal a : zoo)
		{
			System.out.println("Zookeeper feeds " + a.getName());
			a.eat();
		}
	}

	@Override
	void exerciseAnimals() 
	{
		for (ZooAnimals.Animal a : zoo)
		{
			System.out.println("Zookeeper tells " + a.getName() + " to exercise.");
			a.roam();
		}
	}

	@Override
	void tuckIn() 
	{
		
		for (ZooAnimals.Animal a : zoo)
		{
			System.out.println("Zookeeper tucks in " + a.getName());
			
			a.sleep();
		}
	}

}
