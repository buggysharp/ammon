import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Game extends JPanel implements KeyListener{
	
	private static final int rows = 10;
	private static final int cols = 10;
	private Ammon ammon;
	private ArrayList<Sheep> sheep;
	private ArrayList<Water> water;
	private ArrayList<Tree> trees;
	private ArrayList<Robber> robbers;

	public Game() {
		//building the actual map and putting locations of sprites down
		setBackground(new Color(124,252,0));
		
		setOpaque(true);
		/* Create a padded border with a thin line */
		Border b = BorderFactory.createCompoundBorder(new LineBorder(Color.black), new EmptyBorder(10, 10, 10, 10));
		setBorder(b);

		// adding the key listener
		addKeyListener(this);
		
		//starting point for Ammon
		ammon = new Ammon(9, 4);

		//constructor for the arrays of each of the icons
		sheep = new ArrayList<>();
		water = new ArrayList<>();
		trees = new ArrayList<>();
		robbers = new ArrayList<>();

		// first row
		trees.add(new Tree(0, 0));
		trees.add(new Tree(1, 0));
		trees.add(new Tree(2, 0));
		sheep.add(new Sheep(6, 0));
		robbers.add(new Robber(8, 0));
		sheep.add(new Sheep(9, 0));

		// second row
		robbers.add(new Robber(0, 1));
		sheep.add(new Sheep(1, 1));
		trees.add(new Tree(2, 1));
		trees.add(new Tree(8, 1));
		trees.add(new Tree(9, 1));

		// third row
		trees.add(new Tree(2, 2));
		trees.add(new Tree(1, 2));
		trees.add(new Tree(6, 2));

		// fourth row
		robbers.add(new Robber(1, 3));
		sheep.add(new Sheep(2, 3));
		trees.add(new Tree(6, 3));
		sheep.add(new Sheep(7, 3));

		// fifth row
		robbers.add(new Robber(5, 4));

		// sixth row
		water.add(new Water(0, 5));
		water.add(new Water(1, 5));
		water.add(new Water(2, 5));
		sheep.add(new Sheep(5, 5));
		trees.add(new Tree(6, 5));

		// seventh row
		sheep.add(new Sheep(1, 6));
		water.add(new Water(2, 6));
		trees.add(new Tree(6, 6));

		// eight row
		robbers.add(new Robber(0,7));
		water.add(new Water(1, 7));
		water.add(new Water(2, 7));
		sheep.add(new Sheep(7, 7));
		
		// ninth row
		sheep.add(new Sheep(4, 8));
		trees.add(new Tree(6, 8));

		// tenth row
		trees.add(new Tree(6, 9));
		sheep.add(new Sheep(9, 9));

		int width = ammon.image.getIconWidth() * cols;
		int height = ammon.image.getIconHeight() * rows;

		System.out.println(width);

		setPreferredSize(new Dimension(width, height));
	}
	
	// getting the graphics on how to draw each icon
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		super.paintComponent(g);
		
		//draws ammon
		ammon.draw(g2d);
		for (Robber robber : robbers) {
			robber.draw(g);
		}
		
		// draws the sheep
		for (Sheep sh : sheep) {
			sh.draw(g);
		}

		// draws the water
		for (Water w : water) {
			w.draw(g);
		}

		// draws the trees
		for (Tree tree : trees) {
			tree.draw(g);
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		JFrame jfr = new JFrame("Game");
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.add(game);
		jfr.getContentPane().add(jp);
		jfr.pack();
		jfr.setVisible(true);
	}

	public int setRelativePositionX(int x) {
		relativePosition.x = x;
	}
	
	public int setRelativePositionY(int y) {
		relativePosition.y = y;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) 
		{

		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
