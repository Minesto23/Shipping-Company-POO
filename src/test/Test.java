/**
 *	Made by : Miguel Ernesto Morales Molina
 *	Matriculation number : 15590763
 * 
 **/

package test;

import java.util.Scanner;

import containers.BigContainer;
import containers.SmallContainer;
import methods.Calculation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test  test = new Test();
		
		test.menu();
		
		
	}
	
	public void menu() {
		
		Scanner menuScan = new Scanner(System.in);
		char option;
		nice_line();
		System.out.println("\n\tWELCOME TO YOUR BEST SHIPPING OPTION\n");
		nice_line();
		System.out.println("\nWe are happy to help you to select the best option for your shippings.");
		System.out.println("\nIn what issue we can help you today: \n");
		System.out.println("(A) Calculate a new order");
		System.out.println("(B) See our Container information");
		option = menuScan.next().toUpperCase().charAt(0);
		
		switch (option) {
			case 'A':
				
				Calculation order = new Calculation();
					
				order.add_order();
				
				subMenu(order);
				
				break;
				
			case 'B':
				do {
					System.out.println("\nAbout Which Container do you want information: \n");
					System.out.println("(A) Big Container");
					System.out.println("(B) Small Container");
					option = menuScan.next().toUpperCase().charAt(0);
				
					switch (option) {
						case 'A':
							BigContainer bigcontainer = new BigContainer();
							bigcontainer.printContainerInfo();
							break;
						case 'B':
							SmallContainer smallcontainer = new SmallContainer();
							smallcontainer.printContainerInfo();
							break;
						default:
							System.out.println("Please select a valid option.");
							break;
					}
					System.out.println("Do you want to return to the previous menu? Y/N");
					option = menuScan.next().toUpperCase().charAt(0);
				}while(option=='N');
				menu();
				break;
			
			default:
				do {
					System.out.println("Please select a valid option.");
					menu();
				}while(option == 'N');
				break;
		}
		
		
	}
	
	// method used to print a nice line to give some style to the console program
	public void nice_line() {
		for(int i=0; i<100;i++) {
			System.out.print("=");
		}
	}
	
	public void subMenu(Calculation order) {
		
		Scanner submenuScan = new Scanner(System.in);
		
		System.out.println("\nPlease select an option: \n");
		System.out.println("(A) See order");
		System.out.println("(B) See specific item inside order");
		System.out.println("(C) Print shipping results");
		System.out.println("(other key) come back to the previous menu (losing order information)");
		char option = submenuScan.next().toUpperCase().charAt(0);
	
		switch (option) {
			case 'A':
				order.printOrderInformation();
				subMenu(order);
				break;
			case 'B':
				order.printItemInformation();
				subMenu(order);
				break;
			case 'C':
				order.best_shipping();
				System.out.println("Do you want to do another order? Y/N");
				option = submenuScan.next().toUpperCase().charAt(0);
				if(option == 'Y') {
					menu();
				}else {
					System.out.println("Thanks for choice us to calculate your shipping options BYE!!");
					System.exit(0);
				}
				subMenu(order);
			default:
				menu();
				break;
		}
	}
	
	

}
