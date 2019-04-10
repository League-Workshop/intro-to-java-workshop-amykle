package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective

		// Get the user to enter a type of liquid

		// Get the user to enter a body part

		// Get the user to enter a verb

		// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		String adjective = JOptionPane.showInputDialog("Enter an adjective");
		String liquid = JOptionPane.showInputDialog("Enter a type of liquid");
		String body = JOptionPane.showInputDialog("Enter any type of body part");
		String verb = JOptionPane.showInputDialog("Enter a verb");
		String place = JOptionPane.showInputDialog("Enter a place");
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective + " during the day, so cross the river at night. Piranhas are attracted to fresh " + liquid + "\nand will most likely take a bite out of your " + body + " if you " + verb + ". Whatever you do, if you have an open wound,\ntry to find another way to get back to the " + place + ". \nGood luck!" );
	}
}

