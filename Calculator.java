import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
	Label     display;
	Button    New;
	Button[]  buttons;						// declare an array of buttons.
	Frame     parent;
	double firstnumber = 0;
	char operatie = '=';
	boolean newinput=true;

	public static void main(String[] arg) {
		System.out.println("Name: Namu");
		System.out.println("ID: *******");
		new Calculator().setVisible(true);
	}
	public Calculator() {
		super("Calculator"); 
		newGUI();					// method used to set the calculator layout.
	}
	public void newGUI() {
		parent=this;
		display = new Label(" ",Label.RIGHT);
		display.setBackground(Color.white);
		New = new Button("NEW");
		New.addActionListener(this);
		Panel buttonPanel = new Panel(); 
		buttonPanel.setLayout(new GridLayout(4,4));
		String[] i = {"9","8","7", "/",

				"6","5","4", "*",

				"3","2","1", "-",

				"0","=", "+" };

		buttons = new Button[15];				// creates a 15 button objects.
		for (int b=0; b<15; b++) {
			buttons[b]=new Button(i[b]);
			buttons[b].addActionListener(this);
			buttonPanel.add(buttons[b]);
		}
		this.add(display,BorderLayout.NORTH);
		buttonPanel.add(New);
		this.add(buttonPanel,BorderLayout.CENTER);
		this.setSize(250,250);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}

				);

	}
	public void actionPerformed(ActionEvent evt) {
		if ( New==evt.getSource() ) { 
			doOnOff();
			return;
		} 
		if (New.getLabel().equals("NEW")) 
			return;
		char input = evt.getActionCommand().charAt(0);  
		System.out.println("input:"+input);
		if (input>='0' & input<='9' ) {
			if (display.equals("0") || newinput) 
				display.setText(input+"");
			else
				display.setText(display.getText()+input); 
			return;
		} 
		if (input=='C') {
			firstnumber=0;
			operatie='=';
			newinput=true;
			display.setText("0");
			return;
		}  
		String tekst="0"+display.getText().trim();
		long num = Long.parseLong(tekst);
		calculate(input,num);
		display.setText(firstnumber+"");
	}
	public void calculate(char input, long num) {					// method for calculation operations.
		System.out.println("calculate:"+input+"|"+num);
		switch (operatie) {
		case '=' : firstnumber= num; break;
		case '+' : firstnumber+=num; break;
		case '-' : firstnumber-=num; break;
		case '*' : firstnumber*=num; break;
		case '/' : firstnumber/=num; break;

		}   
		operatie=input;
		newinput=true;
	}
	public void doOnOff() {							// method used to reset the calculator for new inputs.
		newinput=true;
		if ( New.getLabel().equals("new") ) {
			New.setLabel("new");
			display.setBackground(Color.white);
			display.setText("0");
			return;
		}
		New.setLabel("NEw");
		display.setText(" ");
	}
}
