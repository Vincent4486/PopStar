package net.vincent.PopStar;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class PopStarFrame extends JPanel{

	JTextField recordField;
	JTextField targetField;
	JTextField currentField;
	JTextField stageField;

	public int recordScoreInt = 0;
	public int targetScoreInt = 0;
	public int currentScoreInt = 0;
	public int stageInt = 0;
	
	public PopStarFrame() {

		Font font = new Font("Comic Sans", Font.BOLD, 20);

		PropertiesData propertiesData = new PropertiesData(this);

		JLabel recordScore = new JLabel("Record:");
		recordScore.setFont(font);
		recordScore.setForeground(Color.white);
		recordScore.setHorizontalAlignment(JLabel.CENTER);

		JLabel targetScore = new JLabel("Target:");
		targetScore.setFont(font);
		targetScore.setForeground(Color.white);
		targetScore.setHorizontalAlignment(JLabel.CENTER);

		JLabel currentScore = new JLabel("Score:");
		currentScore.setFont(font);
		currentScore.setForeground(Color.white);
		currentScore.setHorizontalAlignment(JLabel.CENTER);

		JLabel stage = new JLabel("Stage:");
		stage.setFont(font);
		stage.setForeground(Color.white);
		stage.setHorizontalAlignment(0);

		recordField = new JTextField();
		recordField.setFont(font);
		recordField.setBackground(new Color(0x4531CF));
		recordField.setFocusable(false);
		recordField.setForeground(Color.white);

		targetField = new JTextField();
		targetField.setFont(font);
		targetField.setBackground(new Color(0x4531CF));
		targetField.setFocusable(false);
		targetField.setForeground(Color.white);

		currentField = new JTextField();
		currentField.setFont(font);
		currentField.setBackground(new Color(0x4531CF));
		currentField.setFocusable(false);
		currentField.setForeground(Color.white);

		stageField = new JTextField();
		stageField.setFont(font);
		stageField.setBackground(new Color(0x4531CF));
		stageField.setFocusable(false);
		stageField.setForeground(Color.white);

		JPanel scoreBoard = new JPanel();
		scoreBoard.setBounds(20, 20, 540, 130);
		scoreBoard.setBackground(new Color(0x4531CF));
		scoreBoard.setLayout(new GridLayout(2, 4));
		scoreBoard.add(recordScore);
		scoreBoard.add(recordField);
		scoreBoard.add(targetScore);
		scoreBoard.add(targetField);
		scoreBoard.add(currentScore);
		scoreBoard.add(currentField);
		scoreBoard.add(stage);
		scoreBoard.add(stageField);
		
		this.setBounds(0, 0, 600, 800);
		this.setBackground(new Color(0x231969));
		this.setLayout(null);
		this.add(scoreBoard);

		propertiesData.load();

		setScoreBoardText();

	}

	public void setScoreBoardText(){

		recordField.setText(Integer.toString(recordScoreInt));
		targetField.setText(Integer.toString(targetScoreInt));
		currentField.setText(Integer.toString(currentScoreInt));
		stageField.setText(Integer.toString(stageInt));

	}

}
