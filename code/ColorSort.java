import java.awt.*;
public class ColorSort{
	public int r;
	public int g;
	public int b;
	public Color color;

	public ColorSort(int r, int g, int b){
		this.r = r;
		this.g = g;
		this.b = b;
		this.color = new Color(this.r,this.g,this.b);
	}
}