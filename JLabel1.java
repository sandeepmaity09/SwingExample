// JLabel Example 1
// ghost
// 04 June 2017

import javax.swing.*;

public class JLabel1 {

	public static void main(String args[]) {
		JFrame f = new JFrame("Label Example");

		JLabel l1,l2;

		l1 = new JLabel("First Label");
		l1.setBounds(100,100,200,50);

		l2 = new JLabel("Second Label");
		l2.setBounds(100,150,200,50);

		f.add(l1);
		f.add(l2);

		f.setBounds(200,200,500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}