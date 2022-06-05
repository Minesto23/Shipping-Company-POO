package methods;

import java.util.ArrayList;
import java.util.Scanner;

import containers.BigContainer;
import containers.SmallContainer;
import items.*;


public class Calculation {
	
	private ArrayList<Item> order = new ArrayList<Item>();
	
	public Calculation() {
	}

	
	//methods
	
	public void add_item(Item item) {
		this.order.add(item);
	}
	
	public void add_order() {
		
		Scanner orderScan = new Scanner(System.in);
		int boxtype;
		char add_other;
		
		do {
			System.out.println("Please select the box type of your item\n(1) Cube Box  (2) Rentangule Box "+
						"(3) Cylinder Box (4) Pentagon Box");
			boxtype=orderScan.nextInt();
		
			switch (boxtype) {
		
				case 1:
					add_item(new CubeItem());
					break;
				case 2:
					add_item(new RectanguleItem());
					break;
				case 3:
					add_item(new CylinderItem());
					break;
				case 4:
					add_item(new PentagonItem());
					break;

				default:
					System.out.println("Please select a valid option");
					break;
			}
		
			System.out.println("Do you want to add another Item? (y) yes (n) No");
			add_other = orderScan.next().toLowerCase().charAt(0);
		}while(add_other=='y');
		
		
	}
	
	public void printOrderInformation() {
		
		
		for(int i=0;i<100;i++) {
			System.out.print("-");
		}
		
		System.out.print("\n\t\t Order INFO\n");
		for(int i=0;i<100;i++) {
			System.out.print("-");
		}
		System.out.println("\n| item\t| Item quantity\t| item name ");
		for(int i=0;i<100;i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 0; i<this.order.size(); i++ ) {
			
			System.out.println("| "+ (i+1) +"\t| "+ this.order.get(i).quantity_getter() +"\t\t| "+ this.order.get(i).name_getter());
			
			for(int j=0;j<100;j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public void printItemInformation() {
		
		char search_other;
		Scanner itemsScan = new Scanner(System.in);
		
		do {
			System.out.println("Please Input Item order number:");
			int item = itemsScan.nextInt() - 1;
		
			this.order.get(item).printItemInfo();

			System.out.println("Do you want to search other Item? (y) yes (n) No");
			search_other = itemsScan.next().toLowerCase().charAt(0);
			
		}while(search_other=='y');
		
	}
	
	public double total_volume(ArrayList<Item> order) {
		
		double total_volume=0;
		
		for (Item i : order) {
			total_volume += i.total_volume_getter();
		}
		
		return total_volume;
	}
	
	public double total_weight(ArrayList<Item> order) {
		
		double total_weight=0;
		
		for (Item i : order) {
			total_weight += i.total_weight_getter();
		}
		
		return total_weight;
	}
	
	public int shipping_price(BigContainer bigcontainer, SmallContainer smallcontainer) {
		
		int shipping_price =0;
		
		shipping_price = bigcontainer.quantity_needed_getter()*bigcontainer.cost_getter() + smallcontainer.quantity_needed_getter()*smallcontainer.cost_getter();
		
		return shipping_price;
	}

	public void best_shipping() {
		
		BigContainer bigcontainer = new BigContainer();
		SmallContainer smallcontainer = new SmallContainer();
		
		double total_volume = this.total_volume(this.order);
		double total_weight = this.total_weight(this.order);
		
		if(total_volume<=smallcontainer.volume_getter()) {
			smallcontainer.quanity_needed_setter(1);
			smallcontainer.cost_setter(total_weight);
			
		}else if (total_volume>=smallcontainer.volume_getter() && total_volume<=bigcontainer.volume_getter()) {
			bigcontainer.quanity_needed_setter(1);
		}else {
			bigcontainer.quanity_needed_setter((int) (total_volume/bigcontainer.volume_getter()));
			
			if((total_volume%bigcontainer.volume_getter())<=smallcontainer.volume_getter()) {
				smallcontainer.quanity_needed_setter(1);
				smallcontainer.cost_setter(((total_volume%bigcontainer.volume_getter())/total_volume) * total_weight);
			}else {
				bigcontainer.quanity_needed_setter(1);
			}
		}
		
		for(int i=0;i<100;i++) {
			System.out.print("-");
		}
		
		System.out.print("\n\t\t BEST SHIPPING OPTION\n");
		for(int i=0;i<100;i++) {
			System.out.print("-");
		}
		
		System.out.println("\nnumber of big containers: " + bigcontainer.quantity_needed_getter());
		System.out.println("number of small containers: " + smallcontainer.quantity_needed_getter());
		System.out.println("number of items to ship: " + this.order.size());
		System.out.println("Total price: " + this.shipping_price(bigcontainer, smallcontainer) + " Euros");
		
	}

}
