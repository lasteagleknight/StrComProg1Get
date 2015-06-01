package accounts;

import javax.swing.JFrame;

public class AcctGUITester {
	public static void main(String[]args){
	ActGUI myGUI=new ActGUI();
	myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myGUI.setSize(250, 250);
	myGUI.setVisible(true);
	}
}
