/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/
package items;

import java.util.Scanner;

public class CylinderItem extends Item{
	
	private double radius;
	private double height;
	
	public CylinderItem(){
		Scanner cylinderScan = new Scanner(System.in);
		
		// input cylinder's dimentions
		System.out.println("Please Insert the size of the box in meters \nradius value: ");
		this.radius = cylinderScan.nextDouble();
		System.out.println("\nheight value: ");
		this.height = cylinderScan.nextDouble();
		
		this.volume();
		
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		super.volume_setter(Math.PI*Math.pow(this.radius, 2)*this.height);
		super.total_volume();
		
	}

	@Override
	public void printItemInfo() {
		// TODO Auto-generated method stub
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
		itemInfo += "Item Shape: Cylinder \n";
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
