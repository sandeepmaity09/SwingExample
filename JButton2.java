// JButton 
// ghost
// 30 May 2017

import javax.swing.*;
import java.awt.event.*;

public class JButton2 {

	public static void main(String args[]) {

		JFrame f = new JFrame("Button");

		final JTextField tf = new JTextField();

		tf.setBounds(50,50,200,20);

		JButton b = new JButton("Click Here");

		b.setBounds(50,100,200,30);

		f.add(tf);
		f.add(b);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setText("Welcome to Hell");
			}
		});

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}
}