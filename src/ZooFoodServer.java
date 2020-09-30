
public class ZooFoodServer extends ZooEmployee {

	@Override
	public String employeeType() {
		return "ZooFoodServer";
	}
	public void makeFood() {
		System.out.println("ZooFoodServer is making food.");
	}
	public void serveMeal(String meal) {
		setTask("serve "+meal);
		System.out.println("ZooFoodServer is serving "+meal);
	}
	public void clean() {
		System.out.println("ZooFoodServer is cleaning.");
	}
	@Override
	public void doTaskAtTime(int hour, int d) {
		super.doTaskAtTime(hour, d);
		if (hour==11) makeFood();
		if (hour==12) serveMeal("lunch");
		if (hour==13) clean();
		if (hour==16) makeFood();
		if (hour==17) serveMeal("dinner");
		if (hour==18) clean();
	}
}