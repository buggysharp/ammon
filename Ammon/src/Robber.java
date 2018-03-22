import javax.swing.ImageIcon;


//subclass to set Robbers at locations
public class Robber extends Sprite{

	public Robber(int x, int y) {
		super();
		image = new ImageIcon("icons/robber.png");
		setLocation(x, y);
	}

}
