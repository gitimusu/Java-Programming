import java.util.Scanner;

public class TestTime {
	public static void main(String[] args){
		char ch;
		
		Scanner Keyboard = new Scanner(System.in);
		Time myTime = new Time();
		System.out.println("Hour: ");
		int hour = Keyboard.nextInt();	// receives keyboard input of hour.
		System.out.println("Minute: ");
		int minute = Keyboard.nextInt();	// receives keyboard input of minute.
		
		myTime.setTime(hour, minute);		// sets time according to hour and minute.
		myTime.getTime('H');
		if(hour > 23 || hour < 0 && minute > 59 || minute < 0){  // compare the range of the inputed time.
			hour = 0; minute = 0;
			System.out.println("Wrong input");
		}
		System.out.println(+hour+":"+minute);	// prints time.
		
	}
}

     /* Time.java  CLASS File */
public class Time {
	private int hour;
	private int minute;

	private boolean isValid(int hour, int minute){
		if(hour == 0  && hour == 23 || minute == 0 && minute == 59){
			return true;
		}
		else 
			return false;
	}
	public void setTime(int hour, int minute){
			this.hour = hour;
			this.minute = minute;
	}
	public int getTime(char ch){
		if(ch == 'H' || ch == 'h' ) {
			return hour;
		}
		else if(ch == 'M' || ch == 'm'){

			return minute;
		}
		return ch;
	}
}
