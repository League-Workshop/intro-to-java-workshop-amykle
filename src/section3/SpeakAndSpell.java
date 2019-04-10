package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"

		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		speak ("Spell Mandlebrot");
		String answer = JOptionPane.showInputDialog("Write your answer");
		if (answer.equalsIgnoreCase("mandlebrot")) {
			speak ("Correct");
		} else {
			speak ("Wrong");
		}
		speak ("Spell Bellicose");
		String answer2 = JOptionPane.showInputDialog("Write your answer");
		if (answer2.equalsIgnoreCase("bellicose")) {
			speak ("Correct");
		} else {
			speak ("Wrong");
		}
		speak ("Deciduous");
		String answer3 = JOptionPane.showInputDialog("Write your answer");
		if (answer3.equalsIgnoreCase("deciduous")) {
			speak ("Correct");
		} else {
			speak ("Wrong;");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


