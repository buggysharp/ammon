import java.awt.Graphics;
import java.awt.Point;

import javax.swing.ImageIcon;

public class Sprite {
	// where the sprite is actually drawn
	protected Point absolutePosition;
	// where it should go on the map 
	protected Point relativePosition;
	// gets and stores sprites actual image
	protected ImageIcon image;

	// setting the sprite to default everything
	public Sprite() {
		image = null;
		relativePosition = new Point(0, 0);
		absolutePosition = relativePosition;
	}


	// if p is null then set the position to null
	// otherwise continue on
	public void setLocation(Point p) {
		if (p == null) {
			relativePosition = null;
			absolutePosition = null;
		} else {

		}
	}


	// Draw the image at the absolute position as long as it's not null
	// if null then skip it
	public void draw(Graphics g) {
		if (absolutePosition != null) {
			g.drawImage(image.getImage(), absolutePosition.x, absolutePosition.y, null);
		}
	}


	// set the relative position to where it needs to go
	public void setLocation(int x, int y) {
		setRelativePosition(x, y);
		// calculate the absolute position from the relative position given
		absolutePosition.x = x * image.getIconWidth();
		absolutePosition.y = y * image.getIconHeight();
		
	}

	// set the relative position
	public void setRelativePosition(int x, int y) {
		relativePosition.x = x;
		relativePosition.y = y;
	}
	
	//getter
	public int getRelativePositionX() {
		return  relativePosition.x;
	}
	
	public int getRelativePositionY() {
		return  relativePosition.y;
	}
}
