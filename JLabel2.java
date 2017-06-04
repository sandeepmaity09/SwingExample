// JLabel Example 2
// ghost
// 04 June 2017

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLabel2 extends Frame implements ActionListener {

	JTextField tf;
	JLabel l;
	JButton b;

	JLabel2(){

		tf = new JTextField();
		tf.setBounds(100,50,200,30);

		l = new JLabel("Your IP Here:");
		l.setBounds(320,50,400,30);

		b = new JButton("Find IP");
		b.setBounds(200,100,300,50);

		b.addActionListener(this);

		add(tf);
		add(l);
		add(b);

		setSize(700,600);
		setLayout(null);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("Ip of " + host + " is: " + ip);
		} catch (Exception ep) {
			ep.printStackTrace();
		}
	}

	public static void main(String args[]){
		new JLabel2();
	}
}