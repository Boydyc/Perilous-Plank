import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class startUp 
{
	public void start()
	{
		//Requests a game JFrame
		JFrame a = new JFrame();
		a.setTitle("The Perilous Plank Puzzle Conundrum");
		a.setSize(vars.aWidth, vars.aHeight);
		a.setResizable(true);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Creates a centre JPanel that holds the 9x13 grid
		JPanel center = new JPanel();
		center.setSize(vars.panelWidth, vars.cpHeight);
		center.setLayout(new GridLayout(vars.gridHeight, vars.gridWidth));
		a.add(center, BorderLayout.CENTER);
				
		//Adds a JPanel for the Users heads up display
		JPanel hud = new JPanel();
		hud.setSize(vars.aWidth-vars.panelWidth, vars.cpHeight);
		hud.setLayout(new BorderLayout());
		a.add(hud, BorderLayout.EAST);
				
		//Adds a JPanel to hold the restart button
		JPanel rHud = new JPanel();
		hud.add(rHud, BorderLayout.NORTH);
				
		//This is the JButton for the restart button (added to the JPanel)
		JButton restart = new JButton("RESTART LEVEL");
		restart.setPreferredSize(new Dimension(vars.btnWidth, vars.btnHeight));
		restart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				a.repaint();
			}
		});
		rHud.add(restart, BorderLayout.NORTH);
						
		//Adds a JPanel for the quit button
		JPanel qHud = new JPanel();
		hud.add(qHud, BorderLayout.SOUTH);
				
		//This is the JButton for the quit button (added to the JPanel)
		JButton quit = new JButton("QUIT");
		quit.setPreferredSize(new Dimension(vars.btnWidth, vars.btnHeight));
		restart.setPreferredSize(new Dimension(vars.btnWidth, vars.btnHeight));
		quit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				a.dispose();
			}
		});
		qHud.add(quit, BorderLayout.SOUTH);
						
		//Adds a JPanel to show the items that the player is currently holding
		JPanel holding = new JPanel();
		hud.add(holding, BorderLayout.CENTER);
				
		//Creates a JLabel saying "You are carrying:"
		JLabel carry = new JLabel("You are carrying:");
		holding.add(carry, BorderLayout.CENTER);
				
		//Creates a north JPanel that holds the high score and timer JLabels
		JPanel north = new JPanel();
		north.setSize(vars.aWidth, vars.panelHeight);
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		north.setBackground(Color.GREEN);
		a.add(north, BorderLayout.NORTH);
				
		//Adds a JPanel to north that holds the high score
		JPanel nWest = new JPanel();
		nWest.setSize(vars.aWidth/2, vars.panelHeight);
		nWest.setBackground(Color.GREEN);
		nWest.setLayout(new FlowLayout(FlowLayout.LEFT));
		north.add(nWest);
				
		//Adds a JPanel to north that holds the high score
		JPanel nEast = new JPanel();
		nEast.setSize(vars.aWidth/2, vars.panelHeight);
		nEast.setBackground(Color.GREEN);
		nEast.setLayout(new FlowLayout(FlowLayout.RIGHT));
		north.add(nEast);
				
		//Creates a JLabel that can hold the high score
		JLabel highscore = new JLabel("Highscore: 63");
		nWest.add(highscore);
				
		//Creates a south JPanels that hold the instructions
		JPanel south = new JPanel();
		south.setSize(vars.aWidth, vars.panelHeight);
		south.setLayout(new FlowLayout(FlowLayout.LEFT));
		south.setBackground(Color.GREEN);
		a.add(south, BorderLayout.SOUTH);
				
		//Creates a JLabel that can hold the high score
		JLabel instructions = new JLabel("Instructions-...");
		south.add(instructions);
				
		//Imports the Image a sets the image to the same size of the grid itself
		
		//water1
		ImageIcon water1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water1.jpg");
		Image water_1 = water1.getImage() ; 
		Image newwater1 = water_1.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water1 = new ImageIcon(newwater1);
			
		//water2
		ImageIcon water2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water2.jpg");
		Image water_2 = water2.getImage() ; 
		Image newwater2 = water_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water2 = new ImageIcon(newwater2);
				
		//water3
		ImageIcon water3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water3.jpg");
		Image water_3 = water3.getImage() ; 
		Image newwater3 = water_3.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water3 = new ImageIcon(newwater3);
				
		//water4
		ImageIcon water4 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water4.jpg");
		Image water_4 = water4.getImage() ; 
		Image newwater4 = water_4.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water4 = new ImageIcon(newwater4);
						
		//bank1
		ImageIcon bank1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank1.jpg");
		Image bank_1 = bank1.getImage() ; 
		Image newbank1 = bank_1.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		bank1 = new ImageIcon(newbank1);
						
		//bank2
		ImageIcon bank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank2.jpg");
		Image bank_2 = bank2.getImage() ; 
		Image newbank2 = bank_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		bank2 = new ImageIcon(newbank2);
						
		//stump3
		ImageIcon stump3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump3.jpg");
		Image stump_3 = stump3.getImage() ; 
		Image newstump3 = stump_3.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump3 = new ImageIcon(newstump3);
						
		//stump2
		ImageIcon stump2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2.jpg");
		Image stump_2 = stump2.getImage() ; 
		Image newstump2 = stump_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump2= new ImageIcon(newstump2);
				
		//stump1
		ImageIcon stump1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump1.jpg");
		Image stump_1 = stump1.getImage() ; 
		Image newstump1 = stump_1.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump1= new ImageIcon(newstump1);
				
		//plankman1
		ImageIcon plankman1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank1_man.jpg");
		Image plankman_1 = plankman1.getImage() ; 
		Image newplankman1 = plankman_1.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plankman1= new ImageIcon(newplankman1);
				
		//plankman2
		ImageIcon plankman2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank2_man.jpg");
		Image plankman_2 = plankman2.getImage() ; 
		Image newplankman2 = plankman_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plankman2= new ImageIcon(newplankman2);
				
		//plank1
		ImageIcon plank1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank1.jpg");
		Image plank_1 = plank1.getImage() ; 
		Image newplank1 = plank_1.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plank1= new ImageIcon(newplank1);
				
		//plank2
		ImageIcon plank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank2.jpg");
		Image plank_2 = plank2.getImage() ; 
		Image newplank2 = plank_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plank2= new ImageIcon(newplank2);
					
		//stumpman1
		ImageIcon stumpman1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump1_man.jpg");
		Image stumpman_1 = stumpman1.getImage() ; 
		Image newstumpman1 = stumpman_1.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stumpman1= new ImageIcon(newstumpman1);
				
		//stumpman2
		ImageIcon stumpman2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2_man.jpg");
		Image stumpman_2 = stumpman2.getImage() ; 
		Image newstumpman2 = stumpman_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stumpman2= new ImageIcon(newstumpman2);
				
		//stumpman3
		ImageIcon stumpman3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump3_man.jpg");
		Image stumpman_3 = stumpman3.getImage() ; 
		Image newstumpman3 = stumpman_3.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stumpman3= new ImageIcon(newstumpman3);
				
		//Creates a JButton that will be able to be sorted using the buttons co-ordinates on the grid
		JButton[][] button = new JButton[vars.row][vars.col];
				
		//Creates an array of JButtons that are enough to fill the space of a 9x13 grid equally
		for(vars.r=0;vars.r<vars.row;vars.r++)
		{
			for(vars.c=0;vars.c<vars.col;vars.c++)
			{
				button[vars.r][vars.c] = new JButton();
				button[vars.r][vars.c].setBorderPainted(false);
							
				//Sets the top rows to be the river bank texture
				if(vars.r==0 && vars.c < 9)
				{
					button[vars.r][vars.c].setIcon(bank2);
				}
								
				//Sets the bottom rows to be the river bank texture
				else if(vars.r==12 && vars.c < 9)
				{
					button[vars.r][vars.c].setIcon(bank1);
				}
				
				//Sets the rest of the rows to be the water1 texture
				else
				{
					button[vars.r][vars.c].setIcon(water1);
				}
						
				//Adds all the buttons the the centre JPanel on the JFrame
				center.add(button[vars.r][vars.c]);
				
				button[vars.r][vars.c].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//stumpman2
						ImageIcon stumpman2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2_man.jpg");
						Image stumpman_2 = stumpman2.getImage(); 
						Image newstumpman2 = stumpman_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ); 
						stumpman2= new ImageIcon(newstumpman2);
						
						//bank2
						ImageIcon bank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank2.jpg");
						Image bank_2 = bank2.getImage() ; 
						Image newbank2 = bank_2.getScaledInstance(vars.aWidth/vars.gridWidth, vars.aHeight/vars.gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						bank2 = new ImageIcon(newbank2);
						
							if(e.getSource()==button[0][0])
							{	
								button[0][0].setIcon(stumpman2);
							}
					}
				});
			}
		}
		
		//This is the levels layout section. It uses the co-ordinates of the buttons to build a pre-made map for the user to play.
		if(vars.lvl==1)
		{
			button[12][5].setIcon(stumpman2);
			button[11][5].setIcon(plank2);
			button[10][5].setIcon(plank2);
			button[9][5].setIcon(stump1);
			button[6][5].setIcon(stump1);
			button[3][5].setIcon(stump1);
			button[0][5].setIcon(stump3);
		}	
		
		//Creates a JLabel that can hold the timer
				JLabel seconds = new JLabel();
				nEast.add(seconds);
				for(int time=0;time!=-1;time++)
				{
					try 
					{
						TimeUnit.SECONDS.sleep(1);
					} 
					catch (InterruptedException e) 
					{
					}
					seconds.setText("Time: " + time);
				}
	}
}
