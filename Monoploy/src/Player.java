import java.util.ArrayList;
import java.util.Collections;

public class Player
	{
		private int balance;
		private int location = 1;
		private boolean isInJail;
		private String name;
		 ArrayList<Integer> ownedProperties = new ArrayList<Integer>();
		private boolean jailStatus;
		public Player()
			{
				balance = 1500;
			}

		public void buyProperty(int index, int price)
			{
				if (price <= balance)
					{
						subtractFromBalance(price);
					ownedProperties.add(index);
					} else
					{
						System.out.println("You can't afford that");
					}
				
			}
		public void buyHouse(int location) {
			Spaces.board.get(location);
			
		}

		public int getBalance()
			{
				return balance;
			}
		
		public boolean getIsInJail()
			{
				return isInJail;
			}

		public void setInJail(boolean isInJail)
			{
				this.isInJail = isInJail;
			}

		public void addToBalance(int b)
			{
				balance += b;
			}

		public void subtractFromBalance(int b)
			{
				if(balance-b>=0) {
				balance -= b;
				}else {
					System.out.println("Negative Balance, do something else");
					System.out.println("Transaction not completed");
				}
			}

		public int getLocation()
			{
				return location;
			}

		public void setLocation(int location)
			{
				this.location = location;
				if(location>40) {
					location-=40;
				}
			}
		public void incrementLocation(int il) {
			location += il;
			if(location>40) {
				location-=40;
			}
		}
		public void reverseIncrementLocation(int il)
		{
			location -= il;
			if(location<0) {
				location+=40;
			}
		}

		public boolean isJailStatus()
			{
				return jailStatus;
			}

		public void setJailStatus(boolean jailStatus)
			{
				this.jailStatus = jailStatus;
			}
		
		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}
		
		
	}
