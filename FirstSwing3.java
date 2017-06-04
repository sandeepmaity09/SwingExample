// Swing : Example
// ghost
// 30 May 2017

import javax.swing.*;

public class FirstSwing3 extends JFrame {

	JFrame f;

	FirstSwing3 (){

		JButton b = new JButton("Click");

		b.setBounds(130,100,100,40);
		
		add(b);

		setSize(400,500);
		setLayout(null);
		setVisible(true);

	}

	public static void main(String args[]) {
		new FirstSwing3();
	}
}