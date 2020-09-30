

public class ZooClock {
	public static final int START_HOUR = 8, END_HOUR = 20;
	private int hour = 0;
	public void startDay() {
		hour = START_HOUR;
		announceTime();
	}
	public void announceTime() {
		System.out.print("        TIME: ");
		String ampm = hour<12 ? "AM" : "PM";
		int hour12 = hour;
		if (hour>12) hour12 -= 12;
		if (hour==0) hour12 += 12;
		System.out.println(hour12+" "+ampm);
	}
	public boolean nextHour() {
		if (hour>=END_HOUR) return false;
		hour++;
		announceTime();
		return true;
	}
	public int getHour() {
		return hour;
	}
}