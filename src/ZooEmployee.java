import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

abstract public class ZooEmployee 
{
	private String task = "";
	private PropertyChangeSupport support = new PropertyChangeSupport(this);
	public ZooEmployee() {}
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
	
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    
	protected void setTask(String newTask) 
	{
		support.firePropertyChange(employeeType()+".task", task, newTask);
		task = newTask;
    }
    
	abstract public String employeeType();
	public void leave() {
		setTask("leave");
		System.out.println(employeeType()+" heads home for the day.");
	}
	public void arrive(int d) {
		setTask("arrive");
		System.out.println(employeeType()+" arrives at Zoo on Day " + d + ".");
	}
	public void doTaskAtTime(int hour, int d) {
		if (hour==ZooClock.START_HOUR) arrive(d);
		else if (hour==ZooClock.END_HOUR) leave();
	}
}
