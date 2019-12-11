package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int num = Integer.parseInt(height);
		if (num >= 48) {
			JOptionPane.showMessageDialog(null, "You may ride the rollercoaster.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You may not ride the rollercoaster. Be taller can come back.");
		}

	}

}
