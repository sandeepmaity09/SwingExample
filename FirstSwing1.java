// Swing : Test
// ghost'
// 30 May 2017

import javax.swing.*;

public class FirstSwing1 {

	public static void main(String args[]) {

		JFrame f = new JFrame();  // creating instnace of JFrame
		JButton b = new JButton("Click");  // creating instance of JButton

		b.setBounds(130,100,100,40);

		f.add(b);

		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);

	}
}