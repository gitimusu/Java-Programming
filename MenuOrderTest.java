import java.util.Scanner;

public class MenuOrderTest {
	public static void main(String[] args){
		System.out.println("==========================");
		System.out.println("Major: Computer ENG.");
		System.out.println("ID: 1415001");
		System.out.println("Name: Ahmad Z. Muslimat");
		System.out.println("==========================");
		System.out.println(" ");
		Scanner Keyboard = new Scanner(System.in);
		MenuOrder s = new MenuOrder();		// created a MenuOrder object.
		
		System.out.println("--- Set the price of drinks ---");
		System.out.print("Coke price: ");		// set the prices of drinks.
		s.setPrice("Coke price:", Keyboard.nextInt());
		System.out.print("Lemonade price:");
		s.setPrice("Lemonade price:", Keyboard.nextInt());
		System.out.print("Coffee price:");
		s.setPrice("Coffee price:", Keyboard.nextInt());
		System.out.println(" ");
		
		String input = "Y";
		do{
			System.out.println("--- Input Your Money ---");
			int money = Keyboard.nextInt();		// enables user input of money.
			System.out.println("--- Select Drink ---");
			s.showMenu();
			s.showResult(money);
			
			System.out.println("Do you want to continue?(y/n) ");
			input = Keyboard.next();
		}while(input.equalsIgnoreCase("y"));
		
		System.out.println("End");
	}
}

/*    MenuOrder CLASS File  */

import java.util.Scanner;
/*A program to order a drink in a coffee shop or restaurant */
public class MenuOrder {
	
	private int cokePrice;		// declares the instance variables.
	private int lemonPrice;
	private int coffeePrice;
	private int drink_cost;
	public void setPrice(String drink, int price){		// a method to set the prices of drinks.
		this.cokePrice = price;
		this.lemonPrice = price;
		this.coffeePrice = price;
	}
	public void showMenu(){			// 	a method to print out the contents and price of drinks.
		
		System.out.println("1 : coke "+cokePrice);
		System.out.println("2 : lemonade "+lemonPrice);
		System.out.println("3 : coffee "+coffeePrice);
	}
	public void orderedDrinkAndCost(int drink){	
		}
	
	public void showResult(int money){			// a method used to print out orders depending on the user's selection.
		Scanner keyboard = new Scanner(System.in);
		int drink_order = keyboard.nextInt();
		
		if(drink_order == 1){
			System.out.println("You selected Coke");
			drink_cost = (money - cokePrice);
		
			System.out.println("Your change is " +drink_cost+" won ");
		}
		else if(drink_order == 2){
			System.out.println("You selected lemonade");
			drink_cost = lemonPrice - money;
			System.out.println("please input " +drink_cost+" won more");
		}
		else if(drink_order == 3){
			System.out.println("You selected coffee");
			drink_cost = coffeePrice - money;
			System.out.println("please input " +drink_cost+" won more");	
		}
		else if(drink_order > 3){
			System.out.println("You selected wrong menu");
		}
		
		else System.out.println("");
	}	
		
}

