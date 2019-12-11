package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {

	public static void main(String[] args) {
		int lotNum1 = 0;
		int lotNum2 = 0;
		int lotNum3 = 0;
		int lotNum4 = 0;
		int lotNum5 = 0;
		
		Random ran1 = new Random();
		lotNum1 = ran1.nextInt(101);
		Random ran2 = new Random();
		lotNum2 = ran2.nextInt(101);
		Random ran3 = new Random();
		lotNum3 = ran3.nextInt(101);
		Random ran4 = new Random();
		lotNum4 = ran4.nextInt(101);
		Random ran5 = new Random();
		lotNum5 = ran5.nextInt(101);
		
		JOptionPane.showMessageDialog(null, "Your lottery number is " + lotNum1 + " " + lotNum2 + " " + lotNum3 + " " + lotNum4 + " " + lotNum5 + "!"  );
		
		

	}

}
