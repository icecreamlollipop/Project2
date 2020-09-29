package ZooAnimals;
public interface EatStrategy{
	private String strat;
	
	String getStrategy()
	{
		return strat;
	}
	
	static EatStrategy lapMilk()
	{
		strat = "laps up a bowl of milk.";
		return this;
	}
	
	static EatStrategy eatFlesh()
	{
		strat = "tears meat into pieces.";
		return this;
	}
	
	static EatStrategy eatWorms()
	{
		strat = "fills itself on worms.";
		return this;
	}

}