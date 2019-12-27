import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
Steven Li
31647656
Assignment 9
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that makes the buttons and the frame and runs everything
 */
public class myApp extends JFrame implements ActionListener{

	protected JButton button;
	protected int count;
	protected JLabel label;
	protected JButton buttonTwo;
	protected boolean off;
	protected int offCounter;
	protected JButton buttonThree;
	public static void main(String[] args) {
		new myApp().setVisible(true);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("MyApp.actionPerformed");
		
		Object src = e.getSource();
		if(src == button && off == true) {
			count +=1;
			label.setText("Counter: " + count);
		}else if(src == button && off == false) {
			label.setText("The button is off!");
		}else if(src == buttonTwo) {
			offCounter +=1;
			if(offCounter %2 == 0) {
				buttonTwo.setLabel("Off");
				off = false;
			}else{
				buttonTwo.setLabel("On");
				off = true;
			}
		}else if(src == buttonThree) {
			count = 0;
		}
		
	}
	
	public myApp() {
		setTitle("New Window");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		label = new JLabel("");
		add(label);
		button = new JButton("Click");
		button.addActionListener(this);
		add(button);
		buttonTwo = new JButton("Off");
		buttonTwo.addActionListener(this);
		add(buttonTwo);
		buttonThree = new JButton("Reset Counter");
		buttonThree.addActionListener(this);
		add(buttonThree);
	}

}
