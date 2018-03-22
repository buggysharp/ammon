import javax.swing.ImageIcon;

//subclass to set Sheep at locations
public class Sheep extends Sprite{

	public Sheep(int x, int y) {
		super();
		image = new ImageIcon("icons/sheep.png");
		
		setLocation(x, y);
	}

}
