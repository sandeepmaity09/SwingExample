// JButton : 
// ghost
// 30 May 2017

import javax.swing.*;

public class JButton1 {

	public static void main(String args[]) {

		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Click Here");

		b.setBounds(100,200,200,50);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}
}