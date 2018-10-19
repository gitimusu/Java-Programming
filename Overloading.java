import java.util.Scanner;
public class Overloading {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		Overloading d0 = new Overloading();
		Overloading d1 = new Overloading();
		Overloading d2 = new Overloading();
		Overloading d3 = new Overloading();
		int i = 4;
		while(i > 0){
			System.out.println(" ");
			System.out.println("Choose the number computation type. 0 to finish.");
			System.out.println("1. int, int 2. int, double 3. double, int 4. double, double");
			System.out.println(" ");
			double x, y; int v,z;
			i = kbd.nextInt();
			switch(i){
			case 1: 
				System.out.println("input two integers:");
				v = kbd.nextInt();
				z = kbd.nextInt();
				System.out.println( Overloading.Compute(v,z));
				break;
			case 2:
				System.out.println("input one integer and one double:");
				v = kbd.nextInt();
				y = kbd.nextDouble();
				System.out.println(Overloading.Compute(v,y));
				break;
			case 3:
				System.out.println("input one double number and one integer:");
				x = kbd.nextDouble();
				z = kbd.nextInt();
				System.out.println(Overloading.Compute(x,z));
				break;
			case 4:
				System.out.println("input two double numbers:");
				x = kbd.nextDouble();
				y = kbd.nextDouble();
				System.out.println(Overloading.Compute(x,y));
				break;
			default:
				
				
			}
		}if(i == 0) System.out.println("Program finished");
		
	}
	public static int Compute(int num1, int num2){
		return num1 / num2;
	}
	public static double Compute(int num1, double num2){
		return (double)num1 / num2;
	}
	public static double Compute(double num1, int num2){
		return num1 / (double)num2;
	}
	public static double Compute(double num1, double num2){
		return num1 / num2;
	}
	
}
