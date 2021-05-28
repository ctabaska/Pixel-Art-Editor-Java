import java.awt.*;
public class ScreenshotButton{
	public static int xPos;
	public static int yPos;
	public static int width;
	public static int height;
	public Color color;

	public ScreenshotButton(){
		xPos = 765;
		yPos = 500;
		width = 90;
		height = 20;
		color = new Color(200, 200, 200);
	}

	public void draw(Graphics g){
		g.setColor(color);
		g.fillRoundRect(xPos, yPos, width, height, 20, 20);
		g.setColor(Color.black);
		g.drawRoundRect(xPos, yPos, width, height, 20, 20);

		g.setColor(Color.black);
		g.setFont(new Font("Helvetica", Font.BOLD, 15));
		g.drawString("Save Img", xPos + 10, yPos + height - 5);
	}

	public void hover(){
		color = new Color(150, 150, 150);
	}
	public void resetColor(){

		color = new Color(200, 200, 200);
	}
}