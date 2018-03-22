import javax.swing.ImageIcon;

//subclass to set Trees at locations
public class Tree extends Sprite{

	public Tree(int x, int y) {
		super();
		image = new ImageIcon("icons/tree.png");
		setLocation(x, y);

	}

}
