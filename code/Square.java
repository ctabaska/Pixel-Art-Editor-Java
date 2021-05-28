import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Square{
	int positionX;
	int positionY;
	public Color color;
	int tileSize;
	public Square(int positionX, int positionY, int tileSize){
		this.positionY = positionY;
		this.positionX = positionX;
		color = new Color(255, 255, 255);
		this.tileSize = tileSize;
	}

	public Square(int positionX, int positionY, Color random){
		this.positionY = positionY;
		this.positionX = positionX;
		this.color = random;
		this.tileSize = 25;
	}

	public Square(int positionX, int positionY, Color random, int tileSize){
		this.positionY = positionY;
		this.positionX = positionX;
		this.color = random;
		this.tileSize = tileSize;
	}

	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(positionX, positionY,tileSize,tileSize );
		
	}


	public void changeColor(Color color){
		this.color = color;
	}

	public void changeSize(int positionX, int positionY, int tileSize){
		this.positionY = positionY;
		this.positionX = positionX;
		this.tileSize = tileSize;
	}
}