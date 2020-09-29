package ZooAnimals;
public interface EatStrategy{
	private String strat;
	
	static String getStrategy()
	{
		return strat;
	}
	
	static String lapMilk()
	{
		strat = "laps up a bowl of milk.";
		return strat;
	}
	
	static String eatFlesh()
	{
		strat = "tears meat into pieces.";
		return strat;
	}
	
	static String eatWorms()
	{
		strat = "fills itself on worms.";
		return strat;
	}

}