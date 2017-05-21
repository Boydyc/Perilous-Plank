import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class startUp 
{
	int row=13;
	int col=9;
	int c=0;
	int r=0;
	int lastR=0;
	int lastC=0;
	int gridWidth=9;
	int gridHeight=13;
	int panelHeight=150;
	int panelWidth=675;
	int aWidth=900;
	int aHeight=985;
	int cpHeight= aHeight-(panelHeight*2);
	int btnHeight=40;
	int btnWidth=200;
	int lvl=1;
	int plank=0;

	public void start()
	{
		//Requests a game JFrame
		JFrame a = new JFrame();
		a.setTitle("The Perilous Plank Puzzle Conundrum");
		a.setSize(aWidth, aHeight);
		a.setResizable(true);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Creates a centre JPanel that holds the 9x13 grid
		JPanel center = new JPanel();
		center.setSize(panelWidth, cpHeight);
		center.setLayout(new GridLayout(gridHeight, gridWidth));
		a.add(center, BorderLayout.CENTER);
				
		//Adds a JPanel for the Users heads up display
		JPanel hud = new JPanel();
		hud.setSize(aWidth-panelWidth, cpHeight);
		hud.setLayout(new BorderLayout());
		a.add(hud, BorderLayout.EAST);
				
		//Adds a JPanel to hold the restart button
		JPanel rHud = new JPanel();
		hud.add(rHud, BorderLayout.NORTH);
				
		//This is the JButton for the restart button (added to the JPanel)
		JButton restart = new JButton("RESTART LEVEL");
		restart.setPreferredSize(new Dimension(btnWidth, btnHeight));
		
		//This adds an action listener to the reset button, allowing you to input what function you need the button the perform. In this case, restart the level.
		restart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//HELPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
			}
		});
		rHud.add(restart, BorderLayout.NORTH);
						
		//Adds a JPanel for the quit button
		JPanel qHud = new JPanel();
		hud.add(qHud, BorderLayout.SOUTH);
				
		//This is the JButton for the quit button (added to the JPanel)
		JButton quit = new JButton("QUIT");
		quit.setPreferredSize(new Dimension(btnWidth, btnHeight));
		restart.setPreferredSize(new Dimension(btnWidth, btnHeight));
		
		//This adds an action listener to the quit button, allowing you to input what function you need the button the perform. In this case, close the window.
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
		holding.setLayout(new GridLayout(3,0));
		hud.add(holding, BorderLayout.CENTER);
				
		//Creates a JLabel saying "You are carrying:"
		JLabel carry = new JLabel("You are carrying:");
		holding.add(carry, BorderLayout.NORTH);
		
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
				
		//Creates a south JPanels that hold the instructions
		JPanel south = new JPanel();
		south.setSize(aWidth, panelHeight);
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
		Image newwater1 = water_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water1 = new ImageIcon(newwater1);
			
		//water2
		ImageIcon water2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water2.jpg");
		Image water_2 = water2.getImage() ; 
		Image newwater2 = water_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water2 = new ImageIcon(newwater2);
				
		//water3
		ImageIcon water3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water3.jpg");
		Image water_3 = water3.getImage() ; 
		Image newwater3 = water_3.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water3 = new ImageIcon(newwater3);
				
		//water4
		ImageIcon water4 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water4.jpg");
		Image water_4 = water4.getImage() ; 
		Image newwater4 = water_4.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		water4 = new ImageIcon(newwater4);
						
		//bank1
		ImageIcon bank1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank1.jpg");
		Image bank_1 = bank1.getImage() ; 
		Image newbank1 = bank_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		bank1 = new ImageIcon(newbank1);
						
		//bank2
		ImageIcon bank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank2.jpg");
		Image bank_2 = bank2.getImage() ; 
		Image newbank2 = bank_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		bank2 = new ImageIcon(newbank2);
						
		//stump3
		ImageIcon stump3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump3.jpg");
		Image stump_3 = stump3.getImage() ; 
		Image newstump3 = stump_3.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump3 = new ImageIcon(newstump3);
						
		//stump2
		ImageIcon stump2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2.jpg");
		Image stump_2 = stump2.getImage() ; 
		Image newstump2 = stump_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump2= new ImageIcon(newstump2);
				
		//stump1
		ImageIcon stump1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump1.jpg");
		Image stump_1 = stump1.getImage() ; 
		Image newstump1 = stump_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stump1= new ImageIcon(newstump1);
				
		//plankman1
		ImageIcon plankman1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank1_man.jpg");
		Image plankman_1 = plankman1.getImage() ; 
		Image newplankman1 = plankman_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plankman1= new ImageIcon(newplankman1);
				
		//plankman2
		ImageIcon plankman2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank2_man.jpg");
		Image plankman_2 = plankman2.getImage() ; 
		Image newplankman2 = plankman_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plankman2= new ImageIcon(newplankman2);
				
		//plank1
		ImageIcon plank1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank1.jpg");
		Image plank_1 = plank1.getImage() ; 
		Image newplank1 = plank_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plank1= new ImageIcon(newplank1);
				
		//plank2
		ImageIcon plank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank2.jpg");
		Image plank_2 = plank2.getImage() ; 
		Image newplank2 = plank_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		plank2= new ImageIcon(newplank2);
					
		//stumpman1
		ImageIcon stumpman1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump1_man.jpg");
		Image stumpman_1 = stumpman1.getImage() ; 
		Image newstumpman1 = stumpman_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stumpman1= new ImageIcon(newstumpman1);
				
		//stumpman2
		ImageIcon stumpman2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2_man.jpg");
		Image stumpman_2 = stumpman2.getImage() ; 
		Image newstumpman2 = stumpman_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stumpman2= new ImageIcon(newstumpman2);
				
		//stumpman3
		ImageIcon stumpman3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump3_man.jpg");
		Image stumpman_3 = stumpman3.getImage() ; 
		Image newstumpman3 = stumpman_3.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
		stumpman3= new ImageIcon(newstumpman3);
				
		//Creates a JButton that will be able to be sorted using the buttons co-ordinates on the grid
		JButton[][] button = new JButton[row][col];
				
		//Creates an array of JButtons that are enough to fill the space of a 9x13 grid equally
		for(r=0;r<row;r++)
		{
			for(c=0;c<col;c++)
			{
				//Creates the JButtons
				button[r][c] = new JButton();
				
				//Hides the border of the JButtons
				button[r][c].setBorderPainted(false);
							
				//Sets the top rows to be the river bank texture
				if(r==0 && c < 9)
				{
					button[r][c].setIcon(bank2);
					button[r][c].setName("bank2");
				}
								
				//Sets the bottom rows to be the river bank texture
				else if(r==12 && c < 9)
				{
					button[r][c].setIcon(bank1);
					button[r][c].setName("bank1");
				}
				
				//Sets the rest of the rows to be the water1 texture
				else
				{
					button[r][c].setIcon(water1);
					button[r][c].setName("water1");
				}
						
				//Adds all the buttons the the centre JPanel on the JFrame
				center.add(button[r][c]);
				
				button[r][c].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//water1
						ImageIcon water1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water1.jpg");
						Image water_1 = water1.getImage() ; 
						Image newwater1 = water_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						water1 = new ImageIcon(newwater1);
							
						//water2
						ImageIcon water2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water2.jpg");
						Image water_2 = water2.getImage() ; 
						Image newwater2 = water_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						water2 = new ImageIcon(newwater2);
								
						//water3
						ImageIcon water3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water3.jpg");
						Image water_3 = water3.getImage() ; 
						Image newwater3 = water_3.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						water3 = new ImageIcon(newwater3);
								
						//water4
						ImageIcon water4 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\water4.jpg");
						Image water_4 = water4.getImage() ; 
						Image newwater4 = water_4.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						water4 = new ImageIcon(newwater4);
										
						//bank1
						ImageIcon bank1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank1.jpg");
						Image bank_1 = bank1.getImage() ; 
						Image newbank1 = bank_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						bank1 = new ImageIcon(newbank1);
										
						//bank2
						ImageIcon bank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\bank2.jpg");
						Image bank_2 = bank2.getImage() ; 
						Image newbank2 = bank_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						bank2 = new ImageIcon(newbank2);
										
						//stump3
						ImageIcon stump3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump3.jpg");
						Image stump_3 = stump3.getImage() ; 
						Image newstump3 = stump_3.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						stump3 = new ImageIcon(newstump3);
										
						//stump2
						ImageIcon stump2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2.jpg");
						Image stump_2 = stump2.getImage() ; 
						Image newstump2 = stump_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						stump2= new ImageIcon(newstump2);
								
						//stump1
						ImageIcon stump1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump1.jpg");
						Image stump_1 = stump1.getImage() ; 
						Image newstump1 = stump_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						stump1= new ImageIcon(newstump1);
								
						//plankman1
						ImageIcon plankman1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank1_man.jpg");
						Image plankman_1 = plankman1.getImage() ; 
						Image newplankman1 = plankman_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						plankman1= new ImageIcon(newplankman1);
								
						//plankman2
						ImageIcon plankman2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank2_man.jpg");
						Image plankman_2 = plankman2.getImage() ; 
						Image newplankman2 = plankman_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						plankman2= new ImageIcon(newplankman2);
								
						//plank1
						ImageIcon plank1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank1.jpg");
						Image plank_1 = plank1.getImage() ; 
						Image newplank1 = plank_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						plank1= new ImageIcon(newplank1);
								
						//plank2
						ImageIcon plank2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\plank2.jpg");
						Image plank_2 = plank2.getImage() ; 
						Image newplank2 = plank_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						plank2= new ImageIcon(newplank2);
									
						//stumpman1
						ImageIcon stumpman1 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump1_man.jpg");
						Image stumpman_1 = stumpman1.getImage() ; 
						Image newstumpman1 = stumpman_1.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						stumpman1= new ImageIcon(newstumpman1);
								
						//stumpman2
						ImageIcon stumpman2 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump2_man.jpg");
						Image stumpman_2 = stumpman2.getImage() ; 
						Image newstumpman2 = stumpman_2.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						stumpman2= new ImageIcon(newstumpman2);
								
						//stumpman3
						ImageIcon stumpman3 = new ImageIcon("F:\\Java Eclipse\\Workspace\\Plank Game\\src\\stump3_man.jpg");
						Image stumpman_3 = stumpman3.getImage() ; 
						Image newstumpman3 = stumpman_3.getScaledInstance(aWidth/gridWidth, aHeight/gridHeight, java.awt.Image.SCALE_SMOOTH ) ; 
						stumpman3= new ImageIcon(newstumpman3);
						
						//Creates an array that allows the game to search the JButton array to find the specific texture and button that the user is clicking on.
						for(r=0;r<row;r++)
						{
							for(c=0;c<col;c++)
							{
								//If man man is on stumpman2 and the user clicks stump 1. The sprite moves from one to the other.
								if(button[r][c].getName()=="stumpman2" && ((Component) e.getSource()).getName()=="stump1")
								{
									((AbstractButton) e.getSource()).setIcon(stumpman1);
									((Component) e.getSource()).setName("stumpman1");
									button[r][c].setIcon(stump2);
									button[r][c].setName("stump2");
								}
								
								//If man man is on stumpman1 and the user clicks stump 2. The sprite moves from one to the other.
								if(button[r][c].getName()=="stumpman1" && ((Component) e.getSource()).getName()=="stump2")
								{
									((AbstractButton) e.getSource()).setIcon(stumpman2);
									((Component) e.getSource()).setName("stumpman2");
									button[r][c].setIcon(stump1);
									button[r][c].setName("stump1");
								}
								
								//If man man is on stumpman2 and the user clicks stump 3. The sprite moves from one to the other.
								if(button[r][c].getName()=="stumpman2" && ((Component) e.getSource()).getName()=="stump3")
								{
									((AbstractButton) e.getSource()).setIcon(stumpman3);
									((Component) e.getSource()).setName("stumpman3");
									button[r][c].setIcon(stump2);
									button[r][c].setName("stump2");
								}
								
								//If man man is on stumpman3 and the user clicks stump 2. The sprite moves from one to the other.
								if(button[r][c].getName()=="stumpman3" && ((Component) e.getSource()).getName()=="stump2")
								{
									((AbstractButton) e.getSource()).setIcon(stumpman2);
									((Component) e.getSource()).setName("stumpman2");
									button[r][c].setIcon(stump3);
									button[r][c].setName("stump3");
								}
								
								//If man man is on stumpman1 and the user clicks stump 1. The sprite moves from one to the other.
								if(button[r][c].getName()=="stumpman1" && ((Component) e.getSource()).getName()=="stump1")
								{
									((AbstractButton) e.getSource()).setIcon(stumpman1);
									((Component) e.getSource()).setName("stumpman1");
									button[r][c].setIcon(stump1);
									button[r][c].setName("stump1");
								}
								
								//If man man is on stumpman1 and the user clicks stump 3. The sprite moves from one to the other.
								if(button[r][c].getName()=="stumpman1" && ((Component) e.getSource()).getName()=="stump3")
								{
									((AbstractButton) e.getSource()).setIcon(stumpman3);
									((Component) e.getSource()).setName("stumpman3");
									button[r][c].setIcon(stump1);
									button[r][c].setName("stump1");
								}
								
								//If man man is on stumpman3 and the user clicks stump 1. The sprite moves from one to the other.
								if(button[r][c].getName()=="stumpman3" && ((Component) e.getSource()).getName()=="stump1")
								{
									((AbstractButton) e.getSource()).setIcon(stumpman1);
									((Component) e.getSource()).setName("stumpman1");
									button[r][c].setIcon(stump3);
									button[r][c].setName("stump3");
								}
								
								//Creates integers that hold the co-ordinates of the last place that the user clicked.
								if(button[r][c]==(JButton) e.getSource())
								{
									lastR=r;
									lastC=c;
								}
								
							}
						}
						
						//Checks to see if the user clicked on a  single plank. If its true it sets the square of the plank to water and the user picks up the plank.
						if(button[lastR][lastC].getName()=="plank2" && plank==0 && button[lastR+1][lastC].getName()!="plank2" && button[lastR-1][lastC].getName()!="plank2")
						{
								button[lastR][lastC].setIcon(water1);
								button[lastR][lastC].setName("water1");
								plank=1;
						}
						
						//Checks to see if the user has put the plank in a valid location. If its true, it changes the button to a single plank. The user stops holding the plank.
						else if(button[lastR][lastC].getName()=="water1" && plank==1 &&(button[lastR-1][lastC].getName()=="stump1" || button[lastR-1][lastC].getName()=="stump2" || button[lastR-1][lastC].getName()=="stump3" || button[lastR-1][lastC].getName()=="stumpman1" || button[lastR-1][lastC].getName()=="stumpman2" || button[lastR-1][lastC].getName()=="stumpman3") && (button[lastR+1][lastC].getName()=="stump1" || button[lastR+1][lastC].getName()=="stump2" || button[lastR+1][lastC].getName()=="stump3" || button[lastR+1][lastC].getName()=="stumpman1" || button[lastR+1][lastC].getName()=="stumpman2" || button[lastR+1][lastC].getName()=="stumpman3"))
						{
							button[lastR][lastC].setIcon(plank2);
							button[lastR][lastC].setName("plank2");
							plank=0; 
						}
						
						//Checks to see if the user clicked on a  double plank. If its true it sets the square of the plank to water and the user picks up the plank.
						if(button[lastR][lastC].getName()=="plank2" && plank==0 && button[lastR+1][lastC].getName()=="plank2" || button[lastR-1][lastC].getName()=="plank2")
						{
							if(button[lastR+1][lastC].getName()=="plank2" && button[lastR][lastC].getName()=="plank2" && plank==0)
							{
								button[lastR][lastC].setIcon(water1);
								button[lastR][lastC].setName("water1");
								button[lastR+1][lastC].setIcon(water1);
								button[lastR+1][lastC].setName("water1");
								plank=2;
							}
							
							else if(button[lastR-1][lastC].getName()=="plank2" && button[lastR][lastC].getName()=="plank2" && plank==0)
							{
								button[lastR][lastC].setIcon(water1);
								button[lastR][lastC].setName("water1");
								button[lastR-1][lastC].setIcon(water1);
								button[lastR-1][lastC].setName("water1");
								plank=2;
							}
						}
						
						//Checks to see if the user has put the plank in a valid location. If its true, it changes the button to a single plank. The user stops holding the plank.
						else if (button[lastR][lastC].getName()=="water1" && plank==2 && (button[lastR-2][lastC].getName()=="stump1" || button[lastR-2][lastC].getName()=="stump2" || button[lastR-2][lastC].getName()=="stump3" || button[lastR-2][lastC].getName()=="stumpman1" || button[lastR-2][lastC].getName()=="stumpman2" || button[lastR-2][lastC].getName()=="stumpman3" && button[lastR+1][lastC].getName()=="stump1" || button[lastR+1][lastC].getName()=="stump2" || button[lastR+1][lastC].getName()=="stump3" || button[lastR+1][lastC].getName()=="stumpman1" || button[lastR+1][lastC].getName()=="stumpman2" || button[lastR+1][lastC].getName()=="stumpman3") || (button[lastR+2][lastC].getName()=="stump1" || button[lastR+2][lastC].getName()=="stump2" || button[lastR+2][lastC].getName()=="stump3" || button[lastR+2][lastC].getName()=="stumpman1" || button[lastR+2][lastC].getName()=="stumpman2" || button[lastR+2][lastC].getName()=="stumpman3" && button[lastR-1][lastC].getName()=="stump1" || button[lastR-1][lastC].getName()=="stump2" || button[lastR-1][lastC].getName()=="stump3" || button[lastR-1][lastC].getName()=="stumpman1" || button[lastR-1][lastC].getName()=="stumpman2" || button[lastR-1][lastC].getName()=="stumpman3"))
						{
							if(button[lastR+1][lastC].getName()=="water1" && plank==2 && button[lastR][lastC].getName()=="water1")
							{
								button[lastR][lastC].setIcon(plank2);
								button[lastR][lastC].setName("plank2");
								button[lastR+1][lastC].setIcon(plank2);
								button[lastR+1][lastC].setName("plank2");
								plank=0;
							}
							
							else if(button[lastR-1][lastC].getName()=="water1" && plank==2 && button[lastR][lastC].getName()=="water1")
							{
								button[lastR][lastC].setIcon(plank2);
								button[lastR][lastC].setName("plank2");
								button[lastR-1][lastC].setIcon(plank2);
								button[lastR-1][lastC].setName("plank2");
								plank=0;
							}
						}
						
						System.out.println(button[lastR][lastC].getName());
						System.out.println(plank);
						
						//Checks to see if the user clicked on a  single plank. If its true it sets the square of the plank to water and the user picks up the plank.
						if(button[lastR][lastC].getName()=="plank1" && plank==0 && button[lastR][lastC+1].getName()!="plank1" && button[lastR][lastC-1].getName()!="plank1")
						{
								button[lastR][lastC].setIcon(water1);
								button[lastR][lastC].setName("water1");
								plank=1;
						}
						
						//Checks to see if the user has put the plank in a valid location. If its true, it changes the button to a single plank. The user stops holding the plank.
						else if(button[lastR][lastC].getName()=="water1" && plank==1 &&(button[lastR][lastC-1].getName()=="stump1" || button[lastR][lastC-1].getName()=="stump2" || button[lastR][lastC-1].getName()=="stump3" || button[lastR][lastC-1].getName()=="stumpman1" || button[lastR][lastC-1].getName()=="stumpman2" || button[lastR][lastC-1].getName()=="stumpman3") && (button[lastR][lastC+1].getName()=="stump1" || button[lastR][lastC+1].getName()=="stump2" || button[lastR][lastC+1].getName()=="stump3" || button[lastR][lastC+1].getName()=="stumpman1" || button[lastR][lastC+1].getName()=="stumpman2" || button[lastR][lastC+1].getName()=="stumpman3"))
						{
							button[lastR][lastC].setIcon(plank1);
							button[lastR][lastC].setName("plank1");
							plank=0; 
						}
						
						//Checks to see if the user clicked on a  double plank. If its true it sets the square of the plank to water and the user picks up the plank.
						if(button[lastR][lastC].getName()=="plank1" && plank==0 && button[lastR][lastC+1].getName()=="plank1" || button[lastR][lastC-1].getName()=="plank1")
						{
							if(button[lastR][lastC+1].getName()=="plank1" && button[lastR][lastC].getName()=="plank1" && plank==0)
							{
								button[lastR][lastC].setIcon(water1);
								button[lastR][lastC].setName("water1");
								button[lastR][lastC+1].setIcon(water1);
								button[lastR][lastC+1].setName("water1");
								plank=2;
							}
							
							else if(button[lastR][lastC-1].getName()=="plank1" && button[lastR][lastC].getName()=="plank1" && plank==0)
							{
								button[lastR][lastC].setIcon(water1);
								button[lastR][lastC].setName("water1");
								button[lastR][lastC-1].setIcon(water1);
								button[lastR][lastC-1].setName("water1");
								plank=2;
							}
						}
						
						//Checks to see if the user has put the plank in a valid location. If its true, it changes the button to a single plank. The user stops holding the plank.
						else if (button[lastR][lastC].getName()=="water1" && plank==2 && (button[lastR][lastC-2].getName()=="stump1" || button[lastR][lastC-2].getName()=="stump2" || button[lastR][lastC-2].getName()=="stump3" || button[lastR][lastC-2].getName()=="stumpman1" || button[lastR][lastC-2].getName()=="stumpman2" || button[lastR][lastC-2].getName()=="stumpman3" && button[lastR][lastC+1].getName()=="stump1" || button[lastR][lastC+1].getName()=="stump2" || button[lastR][lastC+1].getName()=="stump3" || button[lastR][lastC+1].getName()=="stumpman1" || button[lastR][lastC+1].getName()=="stumpman2" || button[lastR][lastC+1].getName()=="stumpman3") || (button[lastR][lastC+2].getName()=="stump1" || button[lastR][lastC+2].getName()=="stump2" || button[lastR][lastC+2].getName()=="stump3" || button[lastR][lastC+2].getName()=="stumpman1" || button[lastR][lastC+2].getName()=="stumpman2" || button[lastR][lastC+2].getName()=="stumpman3" && button[lastR][lastC-1].getName()=="stump1" || button[lastR][lastC-1].getName()=="stump2" || button[lastR][lastC-1].getName()=="stump3" || button[lastR][lastC-1].getName()=="stumpman1" || button[lastR][lastC-1].getName()=="stumpman2" || button[lastR][lastC-1].getName()=="stumpman3"))
						{
							if(button[lastR][lastC-1].getName()=="water1" && plank==2 && button[lastR][lastC].getName()=="water1")
							{
								button[lastR][lastC].setIcon(plank1);
								button[lastR][lastC].setName("plank1");
								button[lastR][lastC-1].setIcon(plank1);
								button[lastR][lastC-1].setName("plank1");
								plank=0;
							}
							
							else if(button[lastR][lastC+1].getName()=="water1" && plank==2 && button[lastR][lastC].getName()=="water1")
							{
								button[lastR][lastC].setIcon(plank1);
								button[lastR][lastC].setName("plank1");
								button[lastR][lastC+1].setIcon(plank1);
								button[lastR][lastC+1].setName("plank1");
								plank=0;
							}
						}
						
						
				}});
			}
		}
		
		//This is the levels layout section. It uses the co-ordinates of the buttons to build a pre-made map for the user to play.
		if(lvl==1)
		{
			button[12][2].setIcon(stumpman2);
			button[12][2].setName("stumpman2");
			button[11][2].setIcon(plank2);
			button[11][2].setName("plank2");
			button[10][2].setIcon(plank2);
			button[10][2].setName("plank2");
			button[9][2].setIcon(stump1);
			button[9][2].setName("stump1");
			button[9][3].setIcon(plank1);
			button[9][3].setName("plank1");
			button[9][4].setIcon(stump1);
			button[9][4].setName("stump1");
			button[6][4].setIcon(stump1);
			button[6][4].setName("stump1");
			button[6][2].setIcon(stump1);
			button[6][2].setName("stump1");
			button[3][2].setIcon(stump1);
			button[3][2].setName("stump1");
			button[3][0].setIcon(stump1);
			button[3][0].setName("stump1");
			button[0][0].setIcon(stump3);
			button[0][0].setName("stump3");
		}	

		if(lvl==2)
		{
			button[12][1].setIcon(stumpman2);
			button[12][1].setName("stumpman2");
			button[11][1].setIcon(plank2);
			button[11][1].setName("plank2");
			button[10][1].setIcon(plank2);
			button[10][1].setName("plank2");
			button[9][1].setIcon(stump1);
			button[9][1].setName("stump1");
			button[6][1].setIcon(stump1);
			button[6][1].setName("stump1");
			button[3][1].setIcon(stump1);
			button[3][1].setName("stump1");
			button[0][1].setIcon(stump3);
			button[0][1].setName("stump3");
		}
		
		//Creates a JLabel that can hold the timer
		JLabel seconds = new JLabel();
		nEast.add(seconds);
		
		//Creates a count that pauses for 1 second between each number. Allowing you to create a second timer.
		for(int time=0;time!=-1;time++)
		{
			try 
			{
				TimeUnit.SECONDS.sleep(1);
				seconds.setText("Time: " + time);
			} 
			catch (InterruptedException e) 
			{
			}
					
		}
	}
}
