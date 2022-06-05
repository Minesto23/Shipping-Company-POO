/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/

/* I only use one ArrayList to the order because I did inheritance with the shape of the item,
 * like I told you in class and you tell than is not problem use only one ArrayList.
*/
package items;

import java.util.Scanner;


// main item class
public abstract class Item {
	
	private String name; // variable to store item name
	private double weight;// variable to store item weight
	private double total_weight; // Variable to store total weight of one type of product
	private int quantity;// variable to store item quantity
	private double volume;// variable to store single item volume
	private double total_volume; // variable to store total volume of one kind of product
	
	public Item(){
		Scanner itemScan = new Scanner(System.in);
		
		// input item name
		System.out.println("Please input the item name");
		this.name = itemScan.next();
		
		// input item quantity
		System.out.println("Please Insert the item's quatity: ");
		this.quantity = itemScan.nextInt();
		
		System.out.println("Please input the item weight in Kg");
		this.weight = itemScan.nextDouble();
		
		this.total_weight = this.weight * this.quantity;
		
		//itemScan.close();
	}
	
	// setters 
	
	public void quantity_setter(int quantity) {
		this.quantity = quantity;
	}
	public void volume_setter(double volume) {
		this.volume = volume;
	}
	// getters
	
	public String name_getter() {
		return this.name;
	}
	
	public double weight_getter() {
		return this.weight;
	}
	
	public double total_weight_getter() {
		return this.total_weight;
	}
	
	public int quantity_getter() {
		return this.quantity;
	}
	
	public double volume_getter() {
		return this.volume;
	}
	
	public double total_volume_getter() {
		return this.total_volume;
	}
	
	//methods
	
	public abstract void volume();
	
	public abstract void printItemInfo();
	
	public void total_volume() {
		this.total_volume = this.volume*this.quantity;
	}
}
