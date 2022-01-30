import java.util.ArrayList;
import java.util.Scanner;
public class Chance 
	{
static ArrayList<Card> chance = new ArrayList<Card>();
static Scanner ans = new Scanner(System.in);
public static void ccards()
{
chance.add(new Card( "Go directly to jail, dont pass go "));	
chance.add(new Card("Income tax, pay 100$"));
chance.add(new Card("You won the lottery, collect $250"));	
	
	
}
public static void landChance(Player p)
{
int chanceNum = (int)(Math.random()*3);
switch(chanceNum)
{
	
	case 0:
			{
				System.out.println("Go to directly to jail, dont pass go");
				p.setLocation(10);
				p.setJailStatus(true);
				break;
			}
		
	case 1:
			{
				System.out.println("You have income tax!, pay up $100! ");
				if(p.getBalance()<100)
					{
						System.out.println("Go to directly to jail, don't pass go");
						p.setLocation(10);
						p.setJailStatus(true);
					}
			
				p.subtractFromBalance(100);
				break;
			}
	case 2:
			{
				if(p.scc = false)
					{
				System.out.println("Advance to Boardwalk!");
					}
				else if(p.scc = true)
					{
						System.out.println("Advance to Aspen!");
					}
				p.setLocation(39);
				Monopoly.checkLocation(p);
				break;
			}
	

}
}

public static void landCom(Player p)
{
	int comNum = (int)(Math.random()*3);
	switch(comNum)
	{
		case 0:
			{
				System.out.println("pick a number, if you roll it with two dice then you can triple your money, if your wrong you can loose it all...");
				System.out.println("do you want to continue?");
				System.out.println("1 - Yes ");
				System.out.println("2 - No");
				int one = ans.nextInt();
				if( one == 1)
					{
						System.out.println(" choose your number...wisely ");
						one = ans.nextInt();
					 int dice = Monopoly.rollDice();
					 System.out.println("The dice rolled a " + dice);
					if ( dice==one )
						{
							p.addToBalance(3*(p.getBalance()));
							System.out.println("congratulations, you got lucky and your balance is now " + p.getBalance());
							break;
						}
						System.out.println("you took the L, you lost all your money, shouldnt have gambled on such bad odds ");
						p.subtractFromBalance(p.getBalance());
						System.out.println("Your balance is now " + p.getBalance());
						break;

					}
				break;
				
			}
		case 1:
				{
				
					
					
				}
		
	}
		
		
		
		
	}
	
	
	
	
}
	
//max
//keep making fun cards and thne need to implement seperatly in the monopoly class for community and chance cards (easy) try to test them on sep branch?
//prep for new players to come through maybe dont make it so depeendant rn 
		
	
