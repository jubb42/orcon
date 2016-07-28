package ORCONOUTSIDEGAME;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;



public class mainFunction {

	private static int height = 1920;
	private static int width = 1080;
	
	public static void main(String[] args) {
		
		//Creates all of the game objects
		
				//sets up the window
				JFrame frame = new JFrame(); 
				//creates the window object which is a JPanel
				Window window = new Window();
				//creates a JlayeredPanel
				JLayeredPane layeredPane = new JLayeredPane();
						
				//sets the layout manager to BorderLayout
				frame.setLayout(new BorderLayout());
				
				//sets up the layerPane with a dimension the same as the window
				layeredPane.setPreferredSize(new Dimension(width, height));
				
				//Set up the mouseWatcher going to be deleted
				MouseWatcher mouseWatcher = new MouseWatcher();
				
				//sets the window background as the color black
				window.setBackground(Color.BLACK);
				
				//allow the window to the close of the x even thought the top banner has been disabled
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//sets up the frame height and width 
				frame.setSize(width,height);
				
				
				// I think that this removes the minimize and exit buttons
				frame.setUndecorated(true);
				
				//set the size of the window to equal the preferredsize which is the same as the Height/width
				window.setSize(layeredPane.getPreferredSize());
				
				//set the location of the window to be in the upper left hand side.
				window.setLocation(0,0);
				
				//adds the layered pane to the frame
		        frame.add(layeredPane, BorderLayout.CENTER);
				
				// this adds the window jpanel to the middle of the screen
				layeredPane.add(window,JLayeredPane.DEFAULT_LAYER);
				
				
			
				//add the window to the frame
//		        frame.add(window);
		        
		       mouseWatcher.setLocation(0,0);
		       mouseWatcher.setSize(layeredPane.getPreferredSize());
				
				//adds the mouseWatcher banner to the top of the screen
						layeredPane.add(mouseWatcher,BorderLayout.NORTH);
				
				
				//sets the frame as visisble
				frame.setVisible(true);

	public static int getHeight(){
		return height;
	}
	public static int getWidth(){
		return width;
	}
	
		
		
	
	
}
