import java.beans.*;
import java.util.*;

// observer pattern implementation (this is the observer, ZooEmployee is being observed)
public class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener
{
	private ArrayList<ZooEmployee> observed = new ArrayList<ZooEmployee>();
	
	public void addObserved(ZooEmployee o) {
		observed.add(o);
	}

	@Override
	public void arrive(int d) {
		super.arrive(d);
		for (ZooEmployee o : observed) {
			o.addPropertyChangeListener(this);
		}
	}
	private boolean isTaskFor(PropertyChangeEvent evt, ZooEmployee emp) {
		return evt.getPropertyName().equals(emp.employeeType()+".task");
	}
	private void announce(PropertyChangeEvent evt) {
		String employee = evt.getPropertyName().substring(0,evt.getPropertyName().length()-5);
		String newVal = (String)(evt.getNewValue());
		System.out.println(" >>>> Announcer says: "+employee+" is about to "+newVal+"! <<<<<");
	}
	@Override public void propertyChange(PropertyChangeEvent evt)
	{
		String newVal = (String)(evt.getNewValue());
		if (newVal=="arrive");
		if (newVal=="leave") {
			for (ZooEmployee o : observed) {
				if (isTaskFor(evt,o)) {
					o.removePropertyChangeListener(this);
				}
			}
		}
		else {
			announce(evt);
		}
	}

	@Override
	public String employeeType() {
		return "Announcer";
	}
}