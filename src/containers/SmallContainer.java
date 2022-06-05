/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/

package containers;

public class SmallContainer extends Container{
	
	private int cost;
	public SmallContainer() {
		
		super.height_setter(2.59);
		super.lenght_setter(6.06);
		super.wide_setter(2.43);
		
		super.volume();
	}
	
	// setter
	
	public void cost_setter(double weight) {
		if(weight <= 500) {
			this.cost = 1000;
		}else {
			this.cost = 1200;
		}
	}
	
	// getter
	
	public int cost_getter() {
		return this.cost;
	}
	
	
	
	//methods
	
	public void printContainerInfo() {
		
		String containerInfo = "";
		
		for(int i=0;i<100;i++) {
			containerInfo += "*";
		}
		
		containerInfo += "\n\t\t CONTAINER INFO\n";
		for(int i=0;i<100;i++) {
			containerInfo += "*";
		}
		containerInfo += "\n\n";
		
		containerInfo += "Container Type: Big Container\n";
		containerInfo += "Container Cost if the weight is lower than 500: 1000"+"\n";
		containerInfo += "Container Cost if the weight is higher than 500: 1200"+"\n";
		containerInfo += "Container height: " + Double.toString(super.height_getter())  +"\n";
		containerInfo += "Container lenght: " + Double.toString(super.lenght_getter())  +"\n";
		containerInfo += "Container wide: " + Double.toString(super.wide_getter())  +"\n";
		containerInfo += "container Volume: "+ Double.toString(super.volume_getter()) + "\n";
		
		containerInfo += "\n";
		
		for(int i=0;i<100;i++) {
			containerInfo += "*";
		}
		
		System.out.println(containerInfo);
		
	}

}
