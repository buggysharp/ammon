import java.awt.Color;
import java.awt.Graphics;



/**
 * Water draws water on the map
 */
public class Water extends Sprite {
	//creates the water sprite. There wasn't an actual sprite so I made a square of blue
	
	//sets the width and height of the water square
	private static final int width = 35;
	private static final int height = 35;
	
	//subclass to set water at locations
	public Water(int x, int y) {
		super();
		setLocation(x, y);
	}
	

	// Coloring and making water square parameters
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(absolutePosition.x, absolutePosition.y, width, height);
	}


	//creates the relative locations for water
	@Override
	public void setLocation(int x, int y) {
		setRelativePosition(x, y);
		absolutePosition.x = x * width;
		absolutePosition.y = y * height;
		
		
	}
}
