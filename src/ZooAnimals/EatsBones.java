package ZooAnimals;

public class EatsBones implements EatStrategy
{
	@Override
	public String eat()
	{
		return("eats some bones\n");
	}
}