package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(answer);
		if (age >= 18) {
			JOptionPane.showInputDialog("Who should be the next president be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Noone cares about what you think");
		}

	}

}
