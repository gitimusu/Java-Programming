
public abstract class Pet {
	private String name;
	private int age;
	private double weight;
	private char gender;
	
	public abstract void writeOutput();
	public void setPet(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public void setName(String name){
		this.name  = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getWeight(){
		return weight;
	}
	public char getGender(){
		return gender;
	}
}


/*    DOG CLASS     */

import java.util.Scanner;

public class Dog extends Pet {
	private String breed;
	private boolean boosterShot;
	public Dog(){
		super();
		this.breed = breed;
		this.boosterShot = boosterShot;
	}
	public void writeOutput(){
		System.out.println("Name:"+ getName());
		System.out.println("Age:" + getAge());
		System.out.println("Weight:" + getWeight());
		System.out.println("Gender:" + getGender());
		System.out.println("Breed:" + getBreed());
		/*System.out.println("BoosterShot:" + getBoosterShot(s));*/
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public void setBoosterShot(String s){	
	s = s;
		
	}
	public String getBreed(){
		return breed;
	}
	public boolean getBoosterShot(String s){
		s = "y";
		if(s.equalsIgnoreCase("y")){
			System.out.println("O");
			return true;
		}	
		else
			 System.out.println("X");
			 return false;
		
	}
/*	public void printList(Dog[] d){
		System.out.println("Breed\tName\tGender\tAge\tBoosterShot");
		for(int i=0; i<d.length; i++){
	
		System.out.println(d[0].getBreed() + "\t" + d[0].getName() + "\t" + d[0].getGender() + "\t" + d[0].getAge() + "\t" + d[0].getBoosterShot());
		System.out.println(d[1].getBreed() + "\t" + d[1].getName() + "\t" + d[1].getGender() + "\t" + d[1].getAge() + "\t" + d[1].getBoosterShot());
		System.out.println(d[2].getBreed() + "\t" + d[2].getName() + "\t" + d[2].getGender() + "\t" + d[2].getAge() + "\t" + d[2].getBoosterShot());
		System.out.println(d[3].getBreed() + "\t" + d[3].getName() + "\t" + d[3].getGender() + "\t" + d[3].getAge() + "\t" + d[3].getBoosterShot());
		System.out.println(d[4].getBreed() + "\t" + d[4].getName() + "\t" + d[4].getGender() + "\t" + d[4].getAge() + "\t" + d[4].getBoosterShot());
	}
	}	 */
	public void printTitle(){
		System.out.println("=================================");
		System.out.println("<Dog List>");
	}
	
}
