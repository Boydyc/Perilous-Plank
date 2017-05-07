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
		int aWidth=675;
		int aHeight=975;
		int gridWidth=9;
		int gridHeight=13;
		
		//Requests a game JFrame
		JFrame a = new JFrame();
		a.setTitle("The Perilous Plank Puzzle Conundrum");
		a.setSize(aWidth, aHeight);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates a layout for the JFrame 9x13
		GridLayout newLayout = new GridLayout(gridHeight, gridWidth);
		a.setLayout(newLayout);
	
		//Creates a JButton, that uses the values of rows and columns to keep track of where the button is places using co-ordinates
		JButton[][] button = new JButton[row][col];
		
		//Imports the Image a sets the image to the same size of the grid itself#
		
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
				
				a.add(button[r][c]);
			}
		}
	}
}