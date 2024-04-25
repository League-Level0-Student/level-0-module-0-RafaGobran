package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog("What was the second zelda game");
		// 3. Use an if statement to check if their answer is correct
		if ("the adventure of link".equalsIgnoreCase(input)) {
			JOptionPane.showMessageDialog(null, "correct");
			score += 1;
		}
		// 4. if the user's answer was correct, add one to their score

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer
		String more = JOptionPane.showInputDialog("What was the third zelda game");

		if ("a link to the past".equalsIgnoreCase(more)) {
			JOptionPane.showMessageDialog(null, "correct");
			score += 1;
		}

		String made = JOptionPane.showInputDialog("What was the fourth zelda game");
		if ("links awakening".equalsIgnoreCase(made)) {
			JOptionPane.showMessageDialog(null, "correct");
			score += 1;
		}
		
		String mode = JOptionPane.showInputDialog("What was the fifth zelda game");
		if ("ocarina of time".equalsIgnoreCase(mode)) {
			JOptionPane.showMessageDialog(null, "correct");
			score += 1;
		}
		String make = JOptionPane.showInputDialog("What was the sixth zelda game");
		if ("four swords".equalsIgnoreCase(make)) {
			JOptionPane.showMessageDialog(null, "correct");
			score += 1;
		}
		
		// After all the questions have been asked, tell the user their final score
		JOptionPane.showMessageDialog(null, score);
	}

}