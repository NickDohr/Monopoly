import java.util.Scanner;
public class BoardSpace
	{
		private String name;
		private int location;
		protected static boolean owned;
		public BoardSpace(String n,int l)
		{
			name = n;
			location = l;
		}
		
		public BoardSpace()
		{

		}
		
		public String getName()
			{
				return name;
			}
		

		public void setName(String name)
			{
				this.name = name;
			}


		public int getLocation()
			{
				return location;
			}


		public void setLocation(int location)
			{
				this.location = location;
			}
		public boolean isOwned()
			{
				return owned;
			}

		public void setOwned(boolean owned)
			{
				this.owned = owned;
			}
		
		public int getPrice()
			{
				return 1;
			}
		
		public static void buyBoardSpace(Player p)
		{
			 Scanner userIntInput = new Scanner(System.in);
			
		//	 ( (Property) Spaces.board.get(Monopoly.player1.getLocation())).getPrice()
			
					System.out.println("This Property is unowned. Do you want to buy it?");
					System.out.println("1 - Yes");
					System.out.println("2 - No");
					int playerChoice = userIntInput.nextInt();
					
					if(playerChoice == 1)
						{
							System.out.println("This Property's Cost Is: " + ((Property)Spaces.board.get(p.getLocation())).getPrice());
							int price = ((Property)Spaces.board.get(p.getLocation())).getPrice();
							System.out.println("This Cost will now be subtracted from your balance");
							p.subtractFromBalance(price);
							System.out.println("Your balance is now: " + p.getBalance());
							//figure out owned properties method and like why this isn't adding
							p.ownedProperties.add(p.getLocation());
							Spaces.board.get(p.getLocation()).setOwned(true);
							String color = ((Property)Spaces.board.get(p.getLocation())).getColor();
							switch(color)
							{
								case "Brown":
										{
											int brownCounter = p.getBrownCounter();
											p.setBrownCounter(brownCounter++);
										}
								case "Light Blue":
										{
											int lightBlueCounter = p.getBrownCounter();
											p.setLightBlueCounter(lightBlueCounter++);
										}
								case "Pink":
										{
											int pinkCounter = p.getBrownCounter();
											p.setPinkCounter(pinkCounter++);
										}
								case "Orange":
										{
											int orangeCounter = p.getBrownCounter();
											p.setOrangeCounter(orangeCounter++);
										}
								case "Red":
										{
											int redCounter = p.getBrownCounter();
											p.setRedCounter(redCounter++);
										}
								case "Yellow":
										{
											int yellowCounter = p.getBrownCounter();
											p.setYellowCounter(yellowCounter++);
										}
								case "Green":
										{
											int greenCounter = p.getBrownCounter();
											p.setGreenCounter(greenCounter++);
										}
								case "Dark Blue":
										{
											int darkBlueCounter = p.getBrownCounter();
											p.setDarkBlueCounter(darkBlueCounter++);
										}
							}
							System.out.println("Do You want to see your properties?");
							System.out.println("1 - Yes");
							System.out.println("2 - No");
							int playerDecision = userIntInput.nextInt();
							if(playerDecision == 1)
								{
									Monopoly.printStats(p);
								}
							System.out.println("Do you want to activate the reverse board method?");
							System.out.println("1 - Yes");
							System.out.println("2 - No");
							int playerDecision2 = userIntInput.nextInt();
							if(playerDecision2 == 1)
								{
									Monopoly.playerDemo(p);
								}
														}
		
				
		}
		public static void payRent(Player p)
		{
			 Scanner userIntInput = new Scanner(System.in);
			boolean playerOwned = false;
			for(int i: p.ownedProperties)
				{
					if(Spaces.board.get(i) == Spaces.board.get(p.getLocation()))
						{
							playerOwned = true;
						}
					
				}
			 if(playerOwned == false)
				 {
					 System.out.println("\nYou landed on someone's property, you must now pay the rent to them");
					 System.out.println("You lost $" + ((Property)Spaces.board.get(p.getLocation())).getRentOne() + "!!");
					 int price = ((Property)Spaces.board.get(p.getLocation())).getRent();
					 p.subtractFromBalance(price);
					 System.out.println("Your balance is now: $" + p.getBalance());
				 }
			 else
				 {
					 System.out.println("You have landed on your own property");
					  if(p.getBrownCounter() == 2)
							  {
								  if(((Property)Spaces.board.get(p.getLocation())).getNumOfHouses()!= 4)
									  {
										   System.out.println("Do you want to add more houses?");
											System.out.println("1 - Yes");
											System.out.println("2 - No");
											int playerDecision3 = userIntInput.nextInt();
											if(playerDecision3 == 1)
												{
													System.out.println("$" + ((Property)Spaces.board.get(p.getLocation())).getHouseprice() + " is the cost of a house");
												}
									  }
								 
							  }
					  else if(p.getLightBlueCounter() == 3)
						  {
							  
						  }
					  else if(p.getPinkCounter() == 3)
						  {
							  
						  }
					  else if(p.getOrangeCounter() == 3)
						  {
							  
						  }
					  else if(p.getRedCounter() == 3)
						  {
							  
						  }
					  else if(p.getYellowCounter() == 3)
						  {
							  
						  }
					  else if(p.getGreenCounter() == 3)
						  {
							  
						  }
					  else if(p.getDarkBlueCounter() == 2)
						  {
							  
						  }
					  
				 }
			
		}	

	}
