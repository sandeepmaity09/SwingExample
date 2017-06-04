// Swing : Example
// ghost
// 30 May 2017

import javax.swing.*;

public class FirstSwing2 {

	JFrame f;
	JButton b;

	FirstSwing2 (){
		f = new JFrame("My Application");
		b = new JButton("Click");

		b.setBounds(130,100,100,40);

		f.add(b);

		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String args[]){

		new FirstSwing2();

	}
}