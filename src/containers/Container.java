/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/

package containers;

public abstract class Container {
	
	private double height;
	private double wide;
	private double lenght;
	private double volume;
	private int quantity_needed;
	
	public Container() {
		this.quantity_needed = 0;
	}
	
	// setters
	
	public void height_setter(double height) {
		this.height = height;
	}
	
	public void wide_setter(double wide) {
		this.wide = wide;
	}
	
	public void lenght_setter(double lenght) {
		this.lenght = lenght;
	}
	
	public void quanity_needed_setter(int quantity) {
		this.quantity_needed += quantity;
	}
	
	
	// getters
	
	public double height_getter() {
		return this.height;
	}
	
	public double wide_getter() {
		return this.wide;
	}
	
	public double lenght_getter() {
		return this.lenght;
	}
	
	public double volume_getter() {
		return this.volume;
	}
	
	public int quantity_needed_getter() {
		return this.quantity_needed;
	}
	
	
	// methods
	
	public abstract void printContainerInfo();
	
	public void volume() {
		this.volume = this.height*this.lenght*this.wide;
	}

}
