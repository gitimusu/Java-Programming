import java.lang.*;
public class SimulThread extends Thread{
	public int num;
	int[] d = new int[7];

	SharedArea sh;
	SimulThread(int num){
		this.num = num;
	}
	public void run(){
		for(int i=1; i<7;i++){
			d[i] = 0;
			for(int k=0; k<num; k++){
				int toss = (int)(6.0*Math.random()+1.0);
				d[toss]++;
			}
			sh.roll = (double)d[i]/100;
			sh.isReady = true;
			synchronized(sh){
				sh.notify();
			}
			
		}

	}
}

/*      PrintThread CLASS   */

import java.lang.Thread;

public class PrintThread extends Thread{
	SharedArea sh;
	public void run(){
		if(sh.isReady!=true){
			try{
				synchronized(sh){
					sh.wait();
				}
				System.out.println("* Result of Dice tossing *");
				for(int i=1; i<7; i++)
				System.out.println(+ i + ": " + (sh.roll/1000));
				System.out.println();
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}


/*      SharedArea CLASS   */
public class SharedArea {
	double roll;
	boolean isReady;
}

/*      Test CLASS   */

import java.util.Scanner;

public class HW4_3Test {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		System.out.println("How many times to toss?");
		int num = kbd.nextInt();
		PrintThread thread1 = new PrintThread();
		SimulThread thread2 = new SimulThread(num);
		SharedArea SH = new SharedArea();
		thread1.sh = SH;
		thread2.sh = SH;
		thread1.start();
		thread2.start();
	}
}

