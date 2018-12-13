package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String s = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if (s.equals("yes")){
JOptionPane.showMessageDialog(null, "Your future consits of ruling the the world, have a nice day");
		// 3. Otherwise, wish them good luck washing dishes.
}
else{JOptionPane.showMessageDialog(null, "Your future consists of only washing dishes, have a nice day");

	}
}
	}	

