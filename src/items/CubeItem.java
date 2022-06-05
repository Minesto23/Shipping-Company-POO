/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/
package items;

import java.util.Scanner;

public class CubeItem extends Item{

	private double side;
	
	public CubeItem(){
		Scanner cubeScan = new Scanner(System.in);
		
		// input cube's side value
		System.out.println("Please Insert the size of the box in meters \nside value: ");
		this.side = cubeScan.nextDouble();
		
		this.volume();
		
		//cubeScan.close();
	}
	
	public void volume() {
		
		super.volume_setter(this.side*3);
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
		itemInfo += "Item Shape: Cube \n";
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
