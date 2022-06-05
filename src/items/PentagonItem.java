/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/
package items;

import java.util.Scanner;

public class PentagonItem extends Item{

	private double side;
	private double height;
	
	public PentagonItem(){
		Scanner pentagonScan = new Scanner(System.in);
		
		// input pentgon's dimensions
		System.out.println("Please Insert the size of the box in meters \nside value: ");
		this.side = pentagonScan.nextDouble();
		
		System.out.println("\nheight value: ");
		this.height = pentagonScan.nextDouble();
		
		this.volume();
		
		
	}
	
	public void volume() {
		
		super.volume_setter((0.25)*(Math.sqrt(5*(5+2*Math.sqrt(5)))*(Math.pow(this.side, 2))*this.height));
		super.total_volume();
	}
	
	public void printItemInfo() {
		
		String itemInfo = "";
		
		for(int i=0;i<100;i++) {
			itemInfo += "*";
		}
		
		itemInfo += "\n\t\t ITEM INFO\n";
		for(int i=0;i<100;i++) {
			itemInfo += "*";
		}
		itemInfo += "\n\n";
		
		itemInfo += "Item Name: " + super.name_getter() +"\n";
		itemInfo += "Item Shape: Pentagon \n";
		itemInfo += "Item quantity: " + Integer.toString(super.quantity_getter())+"\n";
		itemInfo += "Item Weight: " + Double.toString(super.weight_getter())  +"\n";
		itemInfo += "Item Total Weight: " + Double.toString(super.total_weight_getter())  +"\n";
		itemInfo += "Item Volume: "+ Double.toString(super.volume_getter()) + "\n";
		itemInfo += "Item Total Volume: " + Double.toString(super.total_volume_getter())  +"\n";
		
		itemInfo += "\n";
		
		for(int i=0;i<100;i++) {
			itemInfo += "*";
		}
		
		System.out.println(itemInfo);
		
	}
}
