
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HW_3_1 {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Name: Rosy");
		System.out.println("ID:   *******");
		System.out.println("Major: Computer Engineering");
		System.out.print(" \n ");
		
		System.out.println("input file name to read");	
		String fileName = kbd.nextLine();		// gets input file name from user.
		System.out.println("Input file name to write");
		String outFileName = kbd.nextLine();	// gets output file name from the user.
		Scanner inputStream = null;				// scanner reference for the file to be read.
		PrintWriter outStream = null;			// PrintWriter for the written file.
		try{
			inputStream = new Scanner(new File(fileName));		
			try{
				outStream = new PrintWriter(outFileName);
			}
			catch(FileNotFoundException d){
				System.out.println("Error in writing from " + outFileName);
				System.exit(1);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Error in opening a file.\n");
			System.exit(1);
		}
		String line =  inputStream.next();		// to read the strings in the input file.
		
		while(inputStream.hasNextLine()){		// write the strings into the output file.
			if(line.length() > 4){
			outStream.println(line);
			}
		}
		StringTokenizer token = new StringTokenizer(line, ",");		// breaks the strings into token.
			while(token.hasMoreTokens()){
					outStream.println(token.nextToken());			// prints the tokens into the output file.
				}
		
		System.out.println(outFileName + " is generated");
		inputStream.close();							// closes the read file.
		outStream.close();								// closes the written file.
	}
}


/*                        Next Class File1                               */



import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class HW_3_2 {
	public static void main(String[] args){

		System.out.println("Name: Iffy");
		System.out.println("ID:   ******");
		System.out.println("Major: Computer Engineering");
		System.out.print(" \n ");

		Scanner kbd = new Scanner(System.in);
		String inFileName, outFileName = "c:\\temp\\primefile.dat";		// input file name uses to calculate prime numbers.
		System.out.println("Input a filename");
		inFileName = kbd.nextLine();						// receives the file name from user input.
		int anInteger;						// declares a variable to calculate prime numbers.
		try{
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(inFileName));
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outFileName));

			System.out.println("Input a number");
			anInteger = kbd.nextInt();		// initializes anInteger using user input.
			System.out.println("writing data into " + inFileName );
			System.out.println("reading data from " + outFileName);
			System.out.print(" \n ");
			System.out.println("<Prime numbers between 2 and " + anInteger + " >"  );
			try{
				
				for(int i = 2; i<= anInteger; i++){
					if(Check(i)){						// call Check() method to calculate the given prime numbers.
						outputStream.writeInt( i );		// writes the prime numbers into output file.
						System.out.print(i);			// prints the result.
						System.out.print(" ");	
					}
				}

			}

			catch(EOFException e){
				System.out.println(" End of File ");
			}
			System.out.println("\nEnd of File reading");
			inputStream.close();
			outputStream.close();

		}
		catch(FileNotFoundException e){
			System.out.println("cannot find file");
		}
		catch(IOException e){
			System.out.println("Problem with output to file " + inFileName);
		}
	}
	public static boolean Check(int n){		// defines a method to calculate n prime numbers.
		for(int i =2; i<Math.sqrt(n); i++){
			if(n % i==0){
				return false;
			}
		}
		return true;
	}
}


/*                        MyFrame                               */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JCheckBox box1 = new JCheckBox("Apple");	// CheckBoxes defined as an instance variable.
	JCheckBox box2 = new JCheckBox("Banana");
	JCheckBox box3 = new JCheckBox("Grape");
	JCheckBox box4 = new JCheckBox("Strawberry");
	JLabel label = new JLabel("Choose the fruit you like");	// label also defined as an instance variable to enable easy access by other methods.
	public MyFrame(){
		setTitle("FRUIT SELECTION");
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();	// label information.
		JPanel panel2 = new JPanel();	// check boxes.
		JPanel panel3 = new JPanel();	// two buttons.
		
		panel1.add(label);				// label is added to panel1.
		add(panel1, BorderLayout.NORTH);	// set label Layout.
		panel2.add(box1);					// box1 is added to panel2.
		panel2.add(box2);					// box2 is added to panel2.
		panel2.add(box3);					// box3 is added to panel2.
		panel2.add(box4);					// box4 is added to panel2.
		panel2.setLayout(new GridLayout(0,2,5,10));		// set checkBoxe Layout.
		add(panel2, BorderLayout.CENTER);				// add panel2 into JFrame using BorderLayout.
		
		makeButton("OK", panel3);			// create "OK" button and add it to panel3.
		makeButton("Cancel", panel3);		// create "Cancel" button and add it to panel3.
		add(panel3, BorderLayout.SOUTH);	// add panel3 into JFrame using BorderLayout.
		
		box1.addActionListener(this);		// Attach the event listener on the component. 
		box2.addActionListener(this);
		box3.addActionListener(this);
		box4.addActionListener(this);
		
		setVisible(true);
	}
	void makeButton(String text, JPanel panel){		// defines a makeButton method to create buttons.
		JButton button = new JButton(text);			// creates a button object with text as an argument.
		button.addActionListener(this);				// attach the event listener on the component.
		panel.add(button);							// add all the created buttons to the component.
	}
	public void actionPerformed(ActionEvent e){		// Event Handling method.
	if(box1.isSelected() && e.getActionCommand().equals("OK")){		// if box1 is clicked,then
		label.setText("You like " + box1.getText());				// set label to this message.
	}
	else if(box2.isSelected() && e.getActionCommand().equals("OK")){
		label.setText("You like " + box2.getText());
	}
	else if(box3.isSelected() && e.getActionCommand().equals("OK")){
		label.setText("You like " + box3.getText());
	}
	else if(box4.isSelected() && e.getActionCommand().equals("OK")){
		label.setText("You like " + box4.getText());
	}
	else if(e.getActionCommand().equals("OK")){					// if no CheckBox is selected and only OK button is clicked, then
		label.setText("You like nothing");						// set label to the corresponding message.
	}
	else if(e.getActionCommand().equals("Cancel")){				// else if Cancel is button is clicked, execute the following instructions.
		box1.setSelected((isEnabled() == false));
		box2.setSelected((isEnabled() == false));
		box3.setSelected((isEnabled() == false));
		box4.setSelected((isEnabled() == false));
		label.setText("Choose the fruit you like");
		
	}
	}
}

/*                        MyFrameTest                               */


public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame v = new MyFrame();		// MyFrame object is created.
		System.out.println("Name: Oden");
		System.out.println("ID:   *******");
		System.out.println("Major: Civil Engineering");
	}

}

