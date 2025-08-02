package main.java.net.vincent.PopStar;

import javax.swing.JFrame;

public class PopStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PopStarFrame popStarrame = new PopStarFrame();
		frame.add(popStarrame);
		
		frame.setVisible(true);

	}

}
