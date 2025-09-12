package net.vincent.PopStar;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JPanel {
    int[][] map = generateMap();
    Tiles tiles;
    public GameFrame(){
        this.setBounds(20, 170, 540, 540);
        this.setBackground(new Color(0x231969));
        tiles = new Tiles();
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

    }
    public int[][] generateMap(){
        int map[][] = new int[9][9];

        return map;
    }
}
