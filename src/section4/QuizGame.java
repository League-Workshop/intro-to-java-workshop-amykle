package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		int score = 0; 
		String question1 = JOptionPane.showInputDialog("What is the capital city of Texas?");
		if (question1.equalsIgnoreCase("Austin")) {
			score + 1;
		} else {
			score - 1;
		}
		String question2 = JOptionPane.showInputDialog("How many states does the USA have?");
		if (question2.equalsIgnoreCase("50")) {
			score + 1;
		} else {
			score - 1;
		}
		String question3 = JOptionPane.showInputDialog("How many chromosomes do red blood cells have?");
		if (question3.equalsIgnoreCase("0")) {
			score + 1;
		} else {
			score - 1;
		}
}
}
