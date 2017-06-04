// JTextField Example 1
// ghost
// 04 June 2017

import javax.swing.*;

public class JTextField1 {

	public static void main(String args[]) {

		JFrame f = new JFrame("Text Field Example");

		JTextField t1,t2;

		t1 = new JTextField();
		t1.setBounds(100,100,300,30);

		t2 = new JTextField();
		t2.setBounds(100,150,300,30);

		f.add(t1);
		f.add(t2);

		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}