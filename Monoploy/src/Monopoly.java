import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Monopoly
	{
		static boolean stillplaying = true;
		static Player player1 = new Player();
		static Scanner stringGetter = new Scanner(System.in);
		private static String choice;
		public static void main(String[] args)
			{
				Spaces.fillboard();
				System.out.println("Welcome to Monopoly your starting balance is " + player1.getBalance() + ".\nPress Enter to Role the dice!" );
				
				pause();
				

				
				while(stillplaying)
					{
						if(player1.isJailStatus())
							{
								jail();
							}
						if(player1.isJailStatus()==false)
							{
								movePlayer();
								checkLocation();
							}
						pause();
					}
				
				

			}
		
		
		
		public static int rollDice()
		{
			int dice1 = (int) (Math.random()*6+1);	
			int dice2 = (int) (Math.random()*6+1);	
			return dice1+dice2;
		}
		
		public static int ranNum() {
			return (int) (Math.random()*6+1);
		}
		
		public static void jail()
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
			System.out.println("Your balance is $" + player1.getBalance());
			choice = stringGetter.nextLine();
			if (choice.equalsIgnoreCase("a"))
				{
					int die1 = ranNum();
					int die2 = ranNum();
					System.out.println("You rolled a " + die1 + " and a " + die2);
					if (die1 == die2)
						{
							System.out.println("Those are doubles! You're free to go");
							player1.setJailStatus(false);
						}
					else
						{
							System.out.println("Those are not doubles");
							turnsInJail ++;
						}
				}
			else
				{
					player1.subtractFromBalance(200);
					System.out.println("Your balance is now $" + player1.getBalance());
					player1.setJailStatus(false);
					
				}
		}
		
	public static void movePlayer()
		{

					int b = rollDice();
					System.out.println("You rolled a total of " + b + "!");
					player1.incrementLocation(b);
		}
		
		
		public static void checkLocation()
		{	
			//checks for properties	
			switch(player1.getLocation())
			{
				
				case 1:
						{
							player1.addToBalance(200);
							System.out.println("You are at GO");
							break;
						}
				case 2:
						{
							System.out.println("You have landed at " + Spaces.board.get(1).getName() + "!");
							if(Spaces.board.get(1).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(1).payRent();
							}
							 
							break;
						}
				case 3:
						{
							System.out.println("You landed on a community chest!");
							Chance.landChance();

							break;
						}
				case 4:
						{
							System.out.println("You have landed at " + Spaces.board.get(3).getName() + "!");
							if(Spaces.board.get(3).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(3).payRent();
							}
							break;

						}
				case 5:
						{
							player1.subtractFromBalance(100);
							System.out.println("Income Tax: Pay $100 to the bank!\nYour balance is now "+player1.getBalance()+"!");
							break;
						}
				case 6:
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
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice());
											int price = ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											Monopoly.player1.subtractFromBalance(price);
											System.out.println("Your balance is now: " + Monopoly.player1.getBalance());
											
											Monopoly.player1.ownedProperties.add(Monopoly.player1.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(5).payRent();
							}
							break;
						}
				case 7:
						{
							System.out.println("You have landed at " + Spaces.board.get(6).getName() + "!");
							if(Spaces.board.get(6).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(6).payRent();
							}
							break;
						}
				case 8:
						{
							System.out.println("You landed on a chance card!");
							Chance.landChance();

							break;
						}
				case 9:
						{
							System.out.println("You have landed at " + Spaces.board.get(8).getName() + "!");
							if(Spaces.board.get(8).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(8).payRent();
							}
							break;
						}
				case 10:
						{
							System.out.println("You have landed at " + Spaces.board.get(9).getName() + "!");
							if(Spaces.board.get(9).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(9).payRent();
							}
							break;
						}
				case 11:
						{
							System.out.println("You have landed at the " + Spaces.board.get(10).getName() + "! You are just visiting!");
							break;
						}
				case 12:
						{
							System.out.println("You have landed at " + Spaces.board.get(11).getName() + "!");
							if(Spaces.board.get(11).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(11).payRent();
							}
							break;
						}
				case 13:
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
											System.out.println("This Property's Cost Is: " + ((Utility)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice());
											int price = ((Utility)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											Monopoly.player1.subtractFromBalance(price);
											System.out.println("Your balance is now: " + Monopoly.player1.getBalance());
											
											Monopoly.player1.ownedProperties.add(Monopoly.player1.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(12).payRent();
							}
							break;
						}
				case 14:
						{
							System.out.println("You have landed at " + Spaces.board.get(13).getName() + "!");
							if(Spaces.board.get(13).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(13).payRent();
							}
							break;
						}
				case 15:
						{
							System.out.println("You have landed at " + Spaces.board.get(14).getName() + "!");
							if(Spaces.board.get(14).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(14).payRent();
							}
							break;
						}
				case 16:
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
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice());
											int price = ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											Monopoly.player1.subtractFromBalance(price);
											System.out.println("Your balance is now: " + Monopoly.player1.getBalance());
											
											Monopoly.player1.ownedProperties.add(Monopoly.player1.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(15).payRent();
							}
							break;
						}
				case 17:
						{
							System.out.println("You have landed at " + Spaces.board.get(16).getName() + "!");
							if(Spaces.board.get(16).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(16).payRent();
							}
							break;
						}
				case 18:
						{
							System.out.println("You landed on a community chest!");
							Chance.landChance();

							break;
						}
				case 19:
						{
							System.out.println("You have landed at " + Spaces.board.get(18).getName() + "!");
							if(Spaces.board.get(18).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(18).payRent();
							}
							break;
						}
				case 20:
						{
							System.out.println("You have landed at " + Spaces.board.get(19).getName() + "!");
							if(Spaces.board.get(19).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(19).payRent();
							}
							break;
						}
				case 21:
						{
							player1.addToBalance(500);
							System.out.println("Free Parking!!!!! You gained $500!\nYour balance is now " +player1.getBalance()+"!");
							
							break;
						}
				case 22:
						{
							System.out.println("You have landed at " + Spaces.board.get(21).getName() + "!");
							if(Spaces.board.get(21).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(21).payRent();
							}
							break;
						}
				case 23:
						{
							System.out.println("You landed on a chance card!");
							Chance.landChance();

							break;
						}
				case 24:
						{
							System.out.println("You have landed at " + Spaces.board.get(23).getName() + "!");
							if(Spaces.board.get(23).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(23).payRent();
							}
							break;
						}
				case 25:
						{
							System.out.println("You have landed at " + Spaces.board.get(24).getName() + "!");
							if(Spaces.board.get(24).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(24).payRent();
							}
							break;
						}
				case 26:
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
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice());
											int price = ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											Monopoly.player1.subtractFromBalance(price);
											System.out.println("Your balance is now: " + Monopoly.player1.getBalance());
											
											Monopoly.player1.ownedProperties.add(Monopoly.player1.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(25).payRent();
							}
							break;
						}
				case 27:
						{
							System.out.println("You have landed at " + Spaces.board.get(26).getName() + "!");
							if(Spaces.board.get(26).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(26).payRent();
							}
							break;
						}
				case 28:
						{
							System.out.println("You have landed at " + Spaces.board.get(27).getName() + "!");
							if(Spaces.board.get(27).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(27).payRent();
							}
							break;
						}
				case 29:
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
											System.out.println("This Property's Cost Is: " + ((Utility)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice());
											int price = ((Utility)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											Monopoly.player1.subtractFromBalance(price);
											System.out.println("Your balance is now: " + Monopoly.player1.getBalance());
											
											Monopoly.player1.ownedProperties.add(Monopoly.player1.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(28).payRent();
							}
							break;
						}
				case 30:
						{
							System.out.println("You have landed at " + Spaces.board.get(29).getName() + "!");
							if(Spaces.board.get(29).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(29).payRent();
							}
							break;
						}
				case 31:
						{
							System.out.println("You have done something illegal and now must go to Jail....");
							player1.setJailStatus(true);
							break;
						}
				case 32:
						{
							System.out.println("You have landed at " + Spaces.board.get(31).getName() + "!");
							if(Spaces.board.get(31).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(31).payRent();
							}
							break;
						}
				case 33:
						{
							System.out.println("You have landed at " + Spaces.board.get(32).getName() + "!");
							if(Spaces.board.get(32).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(32).payRent();
							}
							break;
						}
				case 34:
						{
							System.out.println("You landed on a community chest!");
							Chance.landChance();
							break;
						}
				case 35:
						{
							System.out.println("You have landed at " + Spaces.board.get(34).getName() + "!");
							if(Spaces.board.get(34).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(34).payRent();
							}
							break;
						}
				case 36:
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
											System.out.println("This Property's Cost Is: " + ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice());
											int price = ((Railroad)Spaces.board.get(Monopoly.player1.getLocation()-1)).getPrice();
											System.out.println("This Cost will now be subtracted from your balance");
											Monopoly.player1.subtractFromBalance(price);
											System.out.println("Your balance is now: " + Monopoly.player1.getBalance());
											
											Monopoly.player1.ownedProperties.add(Monopoly.player1.getLocation());
											
										}
								}
								
							else
							{
								Spaces.board.get(35).payRent();
							}
							break;
						}
				case 37:
						{
							System.out.println("You landed on a chance card!");
							Chance.landChance();

							break;
						}
				case 38:
						{
							System.out.println("You have landed at " + Spaces.board.get(37).getName() + "!");
							if(Spaces.board.get(37).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(37).payRent();
							}
							break;
						}
				case 39:
						{
							player1.subtractFromBalance(75);
							System.out.println("You have landed on " + Spaces.board.get(38).getName() + " and must pay $75 to the bank!\nYour balance is now " +player1.getBalance()+"!");
							break;
						}
				case 40:
						{
							System.out.println("You have landed at " + Spaces.board.get(39).getName() + "!");
							if(Spaces.board.get(39).isOwned()==false)
								{
									Spaces.board.get(player1.getLocation()).buyBoardSpace();
								}
								
							else
							{
								Spaces.board.get(39).payRent();
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
