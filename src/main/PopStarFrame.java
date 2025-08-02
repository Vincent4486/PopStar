package main;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PopStarFrame extends JPanel{
	
	public PopStarFrame() {
		
		JPanel scroeBoard = new JPanel();
		scroeBoard.setBounds(20, 20, 540, 130);
		scroeBoard.setBackground(new Color(0x4531CF));
		
		this.setBounds(0, 0, 600, 800);
		this.setBackground(new Color(0x231969));
		this.setLayout(null);
		this.add(scroeBoard);
		
	}

}
