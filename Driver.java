import javax.swing.*;
import java.awt.*;

public class Driver
{	
	public static void main(String [] args)
	{
		int row=13;
		int col=9;
		int c=0;
		int r=0;
		int gridWidth=9;
		int gridHeight=13;
		int panelHeight=150;
		int aWidth=675;
		int aHeight=1024;
		int cpHeight= aHeight-(panelHeight*2);
		
		//Imports the Image a sets the image to the same size of the grid itself
		
		//water1
		ImageIcon water1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water1.jpg");
		Image water_1 = water1.getImage() ; 
		Image newWater1 = water_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water1 = new ImageIcon(newWater1);
				
		//bank1
		ImageIcon bank1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank1.jpg");
		Image bank_1 = bank1.getImage() ; 
		Image newBank1 = bank_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		bank1 = new ImageIcon(newBank1);
				
		//bank2
		ImageIcon bank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank2.jpg");
		Image bank_2 = bank2.getImage() ; 
		Image newBank2 = bank_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		bank2 = new ImageIcon(newBank2);
				
		//stump3
		ImageIcon stump3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump3.jpg");
		Image stump_3 = stump3.getImage() ; 
		Image newStump3 = stump_3.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump3 = new ImageIcon(newStump3);
				
		//stump2
		ImageIcon stump2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2.jpg");
		Image stump_2 = stump2.getImage() ; 
		Image newStump2 = stump_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump2= new ImageIcon(newStump2);
				
		//Requests a game JFrame
		JFrame a = new JFrame();
		a.setTitle("The Perilous Plank Puzzle Conundrum");
		a.setSize(aWidth, aHeight);
		a.setResizable(true);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates a center JPanel that holds the 9x13 grid..
		JPanel center = new JPanel();
		center.setSize(aWidth, cpHeight);
		center.setLayout(new GridLayout(gridHeight, gridWidth));
		center.setOpaque(true);
		a.add(center, BorderLayout.CENTER);
		
		//Creates a north JPanel that holds the high score and timer JLabels
		JPanel north = new JPanel();
		north.setSize(aWidth, panelHeight);
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		north.setBackground(Color.GREEN);
		a.add(north, BorderLayout.NORTH);
		
		//Adds a JPanel to north that holds the high score
		JPanel nWest = new JPanel();
		nWest.setSize(aWidth/2, panelHeight);
		nWest.setBackground(Color.GREEN);
		nWest.setLayout(new FlowLayout(FlowLayout.LEFT));
		north.add(nWest);
		
		//Adds a JPanel to north that holds the high score
		JPanel nEast = new JPanel();
		nEast.setSize(aWidth/2, panelHeight);
		nEast.setBackground(Color.GREEN);
		nEast.setLayout(new FlowLayout(FlowLayout.RIGHT));
		north.add(nEast);
		
		//Creates a JLabel that can hold the high score
		JLabel highscore = new JLabel("Highscore: 63");
		nWest.add(highscore);
		
		//Creates a JLabel that can hold the timer
		JLabel highscore1 = new JLabel("Timer: 0:12");
		nEast.add(highscore1);
		
		
		//Creates a south JPanels that hold the instructions
		JPanel south = new JPanel();
		south.setSize(aWidth, panelHeight);
		south.setLayout(new FlowLayout(FlowLayout.LEFT));
		south.setBackground(Color.GREEN);
		a.add(south, BorderLayout.SOUTH);
		
		//Creates a JLabel that can hold the high score
		JLabel instructions = new JLabel("Instructions-...");
		south.add(instructions);
			
		//Creates a JButton, that uses the values of rows and columns to keep track of where the button is places using co-ordinates
		JButton[][] button = new JButton[row][col];
		
		//Creates an array of JButtons that are enough to fill the space of a 9x13 grid equally. 
		for(r=0;r<row;r++)
		{
			for(c=0;c<col;c++)
			{
				button[r][c] = new JButton();
				button[r][c].setBorderPainted(false);
				
				//Sets the top rows to be the river bank texture
				if(r==0 && c < 9)
				{
					button[r][c].setIcon(bank2);
				}
				
				//Sets the bottom rows to be the river bank texture
				else if(r==12 && c < 9)
				{
					button[r][c].setIcon(bank1);
				}
				
				//Sets the rest of the rows to be the water1 texture
				else
				{
					button[r][c].setIcon(water1);
				}
				
				center.add(button[r][c]);
			}
		}
		
		//Adds a Stump to the top bank
		int random = ((int)(Math.random()*9));
		button[0][random].setIcon(stump3);
		
		//Adds a Stump to the bottom bank
		random = ((int)(Math.random()*9));
		button[12][random].setIcon(stump2);
	}
}
