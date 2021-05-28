import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SizeBar{
	public static int xPos;
	public static int yPos;
	public static int circleSize;
	int sizeToPosition;
	public SizeBar(int sizeToPosition){
		this.sizeToPosition = sizeToPosition;
		xPos = (3 * sizeToPosition) + 740;
		yPos = 533;
		circleSize = 20;
	}

	public void draw(Graphics g){
		g.setColor(new Color(0,0,255));
		g.fillRoundRect(765, yPos + 7, 90, 6, 3, 3);
		g.setColor(new Color(0,0,102));
		g.fillOval(xPos, yPos, circleSize, circleSize);

	}

	public void move(int xPos){
		if(xPos >= 765 && xPos <= 855){
			this.xPos = xPos - 10;
		}
		int sizeChange = (this.xPos - 740) / 3;

		for(int r = 0; r < Screen.squares.length; r++){
			for(int c = 0; c < Screen.squares[r].length; c++){
				Screen.squares[r][c].changeSize(sizeChange*r + ((Screen.screenHeight - (Screen.squares.length * sizeChange)) / 2 ), ((Screen.screenHeight - (Screen.squares.length * sizeChange)) / 2 ) + sizeChange*c , sizeChange);

			}
		}
	}


}