import java.awt.Color;
import java.util.ArrayList;
public class Colors{
	public static ArrayList<Color> colors;
	public Colors(){
		colors = new ArrayList<Color>();
		for (int r=1; r<6; r++)
			colors.add(new Color(r*255/5, 0,0));
		for (int r=0; r<6; r++) 
			colors.add(new Color(255, r*255/7, r*255/7));

		for (int r=1; r<6; r++)
			colors.add(new Color(r*255/5, r*128/5,0));
		for (int r=0; r<6; r++) 
			colors.add(new Color(255, 128 + (r*128/7), r*255/7));

		for (int r=1; r<6; r++) 
			colors.add(new Color(r*255/5, r*255/5, 0));
		for (int r=0; r<6; r++) 
			colors.add(new Color(255, 255, r*255/7));

		for (int r=1; r<6; r++)
			colors.add(new Color(r*128/5, r*255/5,0));
		for (int r=0; r<6; r++) 
			colors.add(new Color(128 + (r*128/7), 255, r*255/7));

		for (int r=1; r<6; r++) 
			colors.add(new Color(0, r*255/5, 0));
		for (int r=0; r<6; r++) 
			colors.add(new Color(r*255/7, 255, r*255/7));

		for (int r=1; r<6; r++)
			colors.add(new Color(0, r*255/5,r*128/5));
		for (int r=0; r<6; r++) 
			colors.add(new Color( r*255/7, 255,128 + (r*128/7)));

		for (int r=1; r<6; r++) 
			colors.add(new Color(0, r*255/5, r*255/5));
		for (int r=0; r<6; r++) 
		 	colors.add(new Color( r*255/7,255, 255));

		for (int r=1; r<6; r++)
			colors.add(new Color(0, r*128/5 , r*255/5));
		for (int r=0; r<6; r++) 
			colors.add(new Color( r*255/7,128 + (r*128/7), 255));

		for (int r=1; r<6; r++)
			colors.add(new Color( 0,0,r*255/5));
		for (int r=0; r<6; r++) 
			colors.add(new Color( r*255/7, r*255/7, 255));

		for (int r=1; r<6; r++)
			colors.add(new Color( r*128/5 ,0, r*255/5));
		for (int r=0; r<6; r++) 
			colors.add(new Color(128 + (r*128/7), r*255/7, 255));

		for (int r=1; r<6; r++) 
			colors.add(new Color(r*255/5, 0, r*255/5));
		for (int r=0; r<6; r++) 
			colors.add(new Color(255, r*255/7, 255));

		for (int r=1; r<6; r++)
			colors.add(new Color(r*255/5 ,0, r*128/5 ));
		for (int r=0; r<6; r++) 
			colors.add(new Color( 255, r*255/7,128 + (r*128/7)));

		for (int r=0; r<11; r++)
			colors.add(new Color(r*255/11, r*255/11, r*255/11 ));
	}
}