package items;

import java.util.Scanner;

public class RectanguleItem extends Item{
	
	private double lenght;
	private double width;
	private double height;
	
	public RectanguleItem(){
		Scanner rectanguleScan = new Scanner(System.in);
		
		// input rectangule's dimension value
		System.out.println("Please Insert the size of the box in meters \nlenght value: ");
		this.lenght = rectanguleScan.nextDouble();
		
		System.out.println("\nwidth value: ");
		this.width = rectanguleScan.nextDouble();
		
		System.out.println("\nheight value: ");
		this.height = rectanguleScan.nextDouble();
		
		this.volume();
		
		
	}
	
	public void volume() {
		
		super.volume_setter(this.lenght*this.height*this.width);
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
		itemInfo += "Item Shape: Rectangule \n";
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
