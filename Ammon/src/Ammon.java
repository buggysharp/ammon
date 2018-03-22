import javax.swing.ImageIcon;

//subclass to set ammon at location
public class Ammon extends Sprite{

	public Ammon(int x, int y) {
		super();
		image = new ImageIcon("icons/ammon.png");
		setLocation(x, y);
	}

}
