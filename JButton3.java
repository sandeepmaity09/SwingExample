// JButton Example 3
// ghost
// 30 May 2017

import javax.swing.*;

public class JButton3 {

	JFrame f;
	JButton b;

	JButton3(){
		f = new JFrame("Button Application");
		b = new JButton(new ImageIcon("/home/ghost/Desktop/myimg.png"));

		b.setBounds(100,100,200,50);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

	public static void main(String args[]) {
		new JButton3();
	}
}