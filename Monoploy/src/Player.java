import java.util.ArrayList;
import java.util.Collections;

public class Player
	{
		private int balance;
		private int location = 1;
		private boolean isInJail;
		private boolean reversed;
		private int houseCounter = 0;
		private int brownCounter;
		private int lightBlueCounter;
		private int pinkCounter;
		private int OrangeCounter;
		private int redCounter;
		private int yellowCounter;
		private int greenCounter;
		private int darkBlueCounter;
		
		
		
		
		public int getBrownCounter()
			{
				return brownCounter;
			}

		public void setBrownCounter(int brownCounter)
			{
				this.brownCounter = brownCounter;
			}

		

		public int getLightBlueCounter()
			{
				return lightBlueCounter;
			}

		public void setLightBlueCounter(int lightBlueCounter)
			{
				this.lightBlueCounter = lightBlueCounter;
			}

		public int getPinkCounter()
			{
				return pinkCounter;
			}

		public void setPinkCounter(int pinkCounter)
			{
				this.pinkCounter = pinkCounter;
			}

		public int getOrangeCounter()
			{
				return OrangeCounter;
			}

		public void setOrangeCounter(int orangeCounter)
			{
				OrangeCounter = orangeCounter;
			}

		public int getRedCounter()
			{
				return redCounter;
			}

		public void setRedCounter(int redCounter)
			{
				this.redCounter = redCounter;
			}

		public int getYellowCounter()
			{
				return yellowCounter;
			}

		public void setYellowCounter(int yellowCounter)
			{
				this.yellowCounter = yellowCounter;
			}

		public int getGreenCounter()
			{
				return greenCounter;
			}

		public void setGreenCounter(int greenCounter)
			{
				this.greenCounter = greenCounter;
			}

		public int getDarkBlueCounter()
			{
				return darkBlueCounter;
			}

		public void setDarkBlueCounter(int darkBlueCounter)
			{
				this.darkBlueCounter = darkBlueCounter;
			}

		public int getHouseCounter()
			{
				return houseCounter;
			}

		public void setHouseCounter(int houseCounter)
			{
				this.houseCounter = houseCounter;
			}

		public void setBalance(int balance)
			{
				this.balance = balance;
			}

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
		
		public boolean isReversed()
			{
				return reversed;
			}

		public void setReversed(boolean reversed)
			{
				this.reversed = reversed;
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
