import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
public class GridButton{
	public static int xPos;
	public static int yPos;
	public static int width;
	public static int height;
	public static Color color;
	public GridButton(){
		xPos = 765;
		yPos = 470;
		width = 90;
		height = 20;
		color = new Color(200, 200, 200);	
	}

	public void draw(Graphics g){
		g.setColor(color);
		g.fillRoundRect(xPos, yPos, width, height, 20, 20);
		g.setColor(Color.black);
		g.drawRoundRect(xPos, yPos, width, height, 20, 20);
		g.setFont(new Font("Helvetica", Font.BOLD, 15));
		g.drawString("Toggle Grid", xPos + 3, yPos + height - 4);
	}

	public void hover(){
		color = new Color(150, 150, 150);
	}
	public void resetColor(){

		color = new Color(200, 200, 200);
	}
}