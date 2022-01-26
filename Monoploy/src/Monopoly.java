import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Monopoly
	{
		static boolean stillplaying = true;
		static Player player1 = new Player();
		static Player player2 = new Player();
		static boolean reverse = false;
		static boolean scc = false;
		static Scanner stringGetter = new Scanner(System.in);
		private static String choice;

		public static void main(String[] args)
			{
				
				System.out.println("Welcome to Monopoly!");
				//player1.setName(name);
				System.out.println("You have two monopoly options:");
				System.out.println("(1) - Normal Monopoly");
				System.out.println("(2) - Ski Resort Monopoly");
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Which one do you want to choose?");
				int choice = userIntInput.nextInt();
				if(choice == 1)
					{
						Spaces.fillboard();
						scc = false;
					}
				else if(choice == 2)
					{
						Spaces.fillSkiBoard();
						scc = true;
					}
				else
					{
						System.out.println("You need to choose either 1 or 2");
					}
				//System.out.println("Your starting balance is " + player1.getBalance() + ".\nPress Enter to Role the Dice");
				pause();
				

				
				while(stillplaying)
					{
						playerTurn(player1);
						playerTurn(player2);
					}
				
				

			}
		
		public static void playerTurn(Player p)
		{
			if(p.isJailStatus())
				{
					jail(p);
				}
			if(p.isJailStatus()==false)
				{
					movePlayer(p);
					checkLocation(p);
				}
			pause();
			System.out.println("\n\nIt is the next players turn!");
		}
		
		public static int rollDice()
		{
			int dice1 = (int) (Math.random()*6+1);	
			int dice2 = (int) (Math.random()*6+1);	
			return dice1+dice2;
		}
		
		public static void printStats(Player p) {
			System.out.println("Your balance is $"+ p.getBalance());
			if (p.ownedProperties.size() == 0) {
				System.out.println("You don't own any properties");
			}
			else if (p.ownedProperties.size()>=1){
				System.out.println("The Properties You Own Are: ");
				for(int i: p.ownedProperties)
					{
						System.out.println(Spaces.board.get(i).getName());
					}
				//System.out.println("You own "+ownedProperties.size()+" properties");
			}
		}
		
		public static int ranNum() {
			return (int) (Math.random()*6+1);
		}
		
		public static void jail(Player p)
		{
			int turnsInJail = 0;

			if (turnsInJail == 0)
				{
					System.out.println("You're in jail");
				}
			else
				{
					System.out.println("You're still in jail");
				}
			System.out.println("\n Would you like to \ta) Roll the dice to get out \tb) Pay the fine of $200");
			System.out.println("Your balance is $" + p.getBalance());
			choice = stringGetter.nextLine();
			if (choice.equalsIgnoreCase("a"))
				{
					int die1 = ranNum();
					int die2 = ranNum();
					System.out.println("You rolled a " + die1 + " and a " + die2);
					if (die1 == die2)
						{
							System.out.println("Those are doubles! You're free to go");
							p.setJailStatus(false);
						}
					else
						{
							System.out.println("Those are not doubles");
							turnsInJail ++;
						}
				}
			else
				{
					p.subtractFromBalance(200);
					System.out.println("Your balance is now $" + p.getBalance());
					p.setJailStatus(false);
					
				}
		}
		
	public static void movePlayer(Player p)
		{

					int b = rollDice();
					System.out.println("You rolled a total of " + b + "!");
					if(reverse == true)
						{
							p.reverseIncrementLocation(b);
						}
					p.incrementLocation(b);
		}
		
		
		public static void checkLocation(Player p)
		{	
			//checks for properties	
			switch(p.getLocation())
			{
				
				case 0:
						{
							p.addToBalance(200);
							System.out.println("You are at GO");
							break;
						}
				case 1:
						{
							System.out.println("You have landed at " + Spaces.board.get(1).getName() + "!");
							if(Spaces.board.get(1).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(1).payRent(p);
							}
							 
							break;
						}
				case 2:
						{
							System.out.println("You landed on a community chest!");
							Chance.landChance(p);

							break;
						}
				case 3:
						{
							System.out.println("You have landed at " + Spaces.board.get(3).getName() + "!");
							if(Spaces.board.get(3).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(3).payRent(p);
							}
							break;

						}
				case 4:
						{
							p.subtractFromBalance(100);
							System.out.println("Income Tax: Pay $100 to the bank!\nYour balance is now "+p.getBalance()+"!");
							break;
						}
				case 5:
						{
							System.out.println("You have landed at the " + Spaces.board.get(5).getName() + "!");
							if(Spaces.board.get(5).isOwned()==false)
								{
									System.out.println("This Railroad is unowned. Do you want to buy it?");
									System.out.println("1 - Yes");
									System.out.println("2 - No");
									int playerChoice = stringGetter.nextInt();
									
									if(playerChoice == 1)
										{
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(p.getLocation())).getPrice());
											int price = ((Railroad)Spaces.board.get(p.getLocation())).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											p.subtractFromBalance(price);
											System.out.println("Your balance is now: " + p.getBalance());
											
											p.ownedProperties.add(p.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(5).payRent(p);
							}
							break;
						}
				case 6:
						{
							System.out.println("You have landed at " + Spaces.board.get(6).getName() + "!");
							if(Spaces.board.get(6).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(6).payRent(p);
							}
							break;
						}
				case 7:
						{
							System.out.println("You landed on a chance card!");
							Chance.landChance(p);

							break;
						}
				case 8:
						{
							System.out.println("You have landed at " + Spaces.board.get(8).getName() + "!");
							if(Spaces.board.get(8).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(8).payRent(p);
							}
							break;
						}
				case 9:
						{
							System.out.println("You have landed at " + Spaces.board.get(9).getName() + "!");
							if(Spaces.board.get(9).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(9).payRent(p);
							}
							break;
						}
				case 10:
						{
							System.out.println("You have landed at the " + Spaces.board.get(10).getName() + "! You are just visiting!");
							break;
						}
				case 11:
						{
							System.out.println("You have landed at " + Spaces.board.get(11).getName() + "!");
							if(Spaces.board.get(11).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(11).payRent(p);
							}
							break;
						}
				case 12:
						{
							System.out.println("You have landed at the " + Spaces.board.get(12).getName() + "!");
							if(Spaces.board.get(12).isOwned()==false)
								{
									System.out.println("This Utility is unowned. Do you want to buy it?");
									System.out.println("1 - Yes");
									System.out.println("2 - No");
									int playerChoice = stringGetter.nextInt();
									
									if(playerChoice == 1)
										{
											System.out.println("This Property's Cost Is: " + ((Utility)Spaces.board.get(p.getLocation())).getPrice());
											int price = ((Utility)Spaces.board.get(p.getLocation())).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											p.subtractFromBalance(price);
											System.out.println("Your balance is now: " + p.getBalance());
											
											p.ownedProperties.add(p.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(12).payRent(p);
							}
							break;
						}
				case 13:
						{
							System.out.println("You have landed at " + Spaces.board.get(13).getName() + "!");
							if(Spaces.board.get(13).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(13).payRent(p);
							}
							break;
						}
				case 14:
						{
							System.out.println("You have landed at " + Spaces.board.get(14).getName() + "!");
							if(Spaces.board.get(14).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(14).payRent(p);
							}
							break;
						}
				case 15:
						{
							System.out.println("You have landed at the " + Spaces.board.get(15).getName() + "!");
							if(Spaces.board.get(15).isOwned()==false)
								{
									System.out.println("This Railroad is unowned. Do you want to buy it?");
									System.out.println("1 - Yes");
									System.out.println("2 - No");
									int playerChoice = stringGetter.nextInt();
									
									if(playerChoice == 1)
										{
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(p.getLocation())).getPrice());
											int price = ((Railroad)Spaces.board.get(p.getLocation())).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											p.subtractFromBalance(price);
											System.out.println("Your balance is now: " + p.getBalance());
											
											p.ownedProperties.add(p.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(15).payRent(p);
							}
							break;
						}
				case 16:
						{
							System.out.println("You have landed at " + Spaces.board.get(16).getName() + "!");
							if(Spaces.board.get(16).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(16).payRent(p);
							}
							break;
						}
				case 17:
						{
							System.out.println("You landed on a community chest!");
							Chance.landChance(p);

							break;
						}
				case 18:
						{
							System.out.println("You have landed at " + Spaces.board.get(18).getName() + "!");
							if(Spaces.board.get(18).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(18).payRent(p);
							}
							break;
						}
				case 19:
						{
							System.out.println("You have landed at " + Spaces.board.get(19).getName() + "!");
							if(Spaces.board.get(19).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(19).payRent(p);
							}
							break;
						}
				case 20:
						{
							p.addToBalance(500);
							System.out.println("Free Parking!!!!! You gained $500!\nYour balance is now " +p.getBalance()+"!");
							System.out.println("Your order on the board is now being reversed, you are going backwards!");
							reverse = true;
							break;
						}
				case 21:
						{
							System.out.println("You have landed at " + Spaces.board.get(21).getName() + "!");
							if(Spaces.board.get(21).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(21).payRent(p);
							}
							break;
						}
				case 22:
						{
							System.out.println("You landed on a chance card!");
							Chance.landChance(p);

							break;
						}
				case 23:
						{
							System.out.println("You have landed at " + Spaces.board.get(23).getName() + "!");
							if(Spaces.board.get(23).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(23).payRent(p);
							}
							break;
						}
				case 24:
						{
							System.out.println("You have landed at " + Spaces.board.get(24).getName() + "!");
							if(Spaces.board.get(24).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(24).payRent(p);
							}
							break;
						}
				case 25:
						{
							System.out.println("You have landed at the " + Spaces.board.get(25).getName() + "!");
							if(Spaces.board.get(25).isOwned()==false)
								{
									System.out.println("This Railroad is unowned. Do you want to buy it?");
									System.out.println("1 - Yes");
									System.out.println("2 - No");
									int playerChoice = stringGetter.nextInt();
									
									if(playerChoice == 1)
										{
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(p.getLocation())).getPrice());
											int price = ((Railroad)Spaces.board.get(p.getLocation())).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											p.subtractFromBalance(price);
											System.out.println("Your balance is now: " + p.getBalance());
											
											p.ownedProperties.add(p.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(25).payRent(p);
							}
							break;
						}
				case 26:
						{
							System.out.println("You have landed at " + Spaces.board.get(26).getName() + "!");
							if(Spaces.board.get(26).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(26).payRent(p);
							}
							break;
						}
				case 27:
						{
							System.out.println("You have landed at " + Spaces.board.get(27).getName() + "!");
							if(Spaces.board.get(27).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(27).payRent(p);
							}
							break;
						}
				case 28:
						{
							System.out.println("You have landed at the " + Spaces.board.get(28).getName() + "!");
							if(Spaces.board.get(28).isOwned()==false)
								{
									System.out.println("This Utility is unowned. Do you want to buy it?");
									System.out.println("1 - Yes");
									System.out.println("2 - No");
									int playerChoice = stringGetter.nextInt();
									
									if(playerChoice == 1)
										{
											System.out.println("This Property's Cost Is: " + ((Utility)Spaces.board.get(p.getLocation())).getPrice());
											int price = ((Utility)Spaces.board.get(p.getLocation())).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											p.subtractFromBalance(price);
											System.out.println("Your balance is now: " + p.getBalance());
											
											p.ownedProperties.add(p.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(28).payRent(p);
							}
							break;
						}
				case 29:
						{
							System.out.println("You have landed at " + Spaces.board.get(29).getName() + "!");
							if(Spaces.board.get(29).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(29).payRent(p);
							}
							break;
						}
				case 30:
						{
							System.out.println("You have done something illegal and now must go to Jail....");
							p.setJailStatus(true);
							break;
						}
				case 31:
						{
							System.out.println("You have landed at " + Spaces.board.get(31).getName() + "!");
							if(Spaces.board.get(31).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(31).payRent(p);
							}
							break;
						}
				case 32:
						{
							System.out.println("You have landed at " + Spaces.board.get(32).getName() + "!");
							if(Spaces.board.get(32).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(32).payRent(p);
							}
							break;
						}
				case 33:
						{
							System.out.println("You landed on a community chest!");
							Chance.landChance(p);
							break;
						}
				case 34:
						{
							System.out.println("You have landed at " + Spaces.board.get(34).getName() + "!");
							if(Spaces.board.get(34).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(34).payRent(p);
							}
							break;
						}
				case 35:
						{
							System.out.println("You have landed at the " + Spaces.board.get(35).getName() + "!");
							if(Spaces.board.get(35).isOwned()==false)
								{
									System.out.println("This Railroad is unowned. Do you want to buy it?");
									System.out.println("1 - Yes");
									System.out.println("2 - No");
									int playerChoice = stringGetter.nextInt();
									
									if(playerChoice == 1)
										{
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(p.getLocation())).getPrice());
											int price = ((Railroad)Spaces.board.get(p.getLocation())).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											p.subtractFromBalance(price);
											System.out.println("Your balance is now: " + p.getBalance());
											
											p.ownedProperties.add(p.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(35).payRent(p);
							}
							break;
						}
				case 36:
						{
							System.out.println("You landed on a chance card!");
							Chance.landChance(p);

							break;
						}
				case 37:
						{
							System.out.println("You have landed at " + Spaces.board.get(37).getName() + "!");
							if(Spaces.board.get(37).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(37).payRent(p);
							}
							break;
						}
				case 38:
						{
							p.subtractFromBalance(75);
							System.out.println("You have landed on " + Spaces.board.get(38).getName() + " and must pay $75 to the bank!\nYour balance is now " +p.getBalance()+"!");
							break;
						}
				case 39:
						{
							System.out.println("You have landed at " + Spaces.board.get(39).getName() + "!");
							if(Spaces.board.get(39).isOwned()==false)
								{
									Spaces.board.get(p.getLocation()).buyBoardSpace(p);
								}
								
							else
							{
								Spaces.board.get(39).payRent(p);
							}
							break;
						}
			}
			
		}
		
		
		public static void pause()
		{
			Scanner userFakeInput = new Scanner(System.in);
			String pause;
			pause = userFakeInput.nextLine();
		}
		

	}
