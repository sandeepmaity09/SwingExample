// JTextArea Example 1
// ghost
// 04 June 2017

import javax.swing.*;

public class JTextArea1 {

	JTextArea1(){

		JFrame f = new JFrame("JTextArea Example");

		JTextArea ta = new JTextArea("Welcome to Hell",1,1);

		ta.setBounds(50,50,300,300);
		f.add(ta);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]){
		new JTextArea1();
	}
}