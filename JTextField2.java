// JTextField Example 2
// ghost
// 04 June 2017

import javax.swing.*;
import java.awt.event.*;

public class JTextField2 implements ActionListener {

	JTextField tf1,tf2,tf3;
	JButton b1,b2;

	JTextField2(){
		
		JFrame f = new JFrame("JTextField Example");

		tf1 = new JTextField();
		tf1.setBounds(100,100,200,30);

		tf2 = new JTextField();
		tf2.setBounds(100,150,200,30);

		tf3 = new JTextField();
		tf3.setBounds(100,200,200,30);
		tf3.setEditable(false);

		b1 = new JButton("+");
		b1.setBounds(50,250,100,30);

		b2 = new JButton("-");
		b2.setBounds(150,250,100,30);

		b1.addActionListener(this);
		b2.addActionListener(this);

		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);

		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
	}

	public void actionPerformed(ActionEvent e) {

		String s1 = tf1.getText();
		String s2 = tf2.getText();

		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);

		int c = 0;

		if(e.getSource()==b1){
			c = a+b;
		}
		else if(e.getSource() == b2){
			c = a-b;
		}

		String result = String.valueOf(c);
		tf3.setText(result);

		// tf3.setText(c);

	}

	public static void main(String args[]){
		new JTextField2();
	}
}