/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/

package containers;

public class BigContainer extends Container{

	private int cost;
	
	public BigContainer() {
		
		super.height_setter(2.59);
		super.lenght_setter(12.01);
		super.wide_setter(2.43);
		this.cost = 1800;
		
		super.volume();
	}
	
	// getters
	
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
		containerInfo += "Container Cost: " + Integer.toString(this.cost)+"\n";
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
