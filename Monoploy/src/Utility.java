
public class Utility extends BoardSpace
	{
		private int rent;
		private int price;
		private int numOfUtilities;
		boolean owned = false;
		
		public Utility(String n, int l,  int p,  int u, boolean o)
		{
			setName(n);
			setLocation(l);
			price = p;
			numOfUtilities = u;
			owned = o;
		}

		public int getRent(int diceRoll)
			{
				if(owned) {
					return 10*diceRoll;
				}else {
					System.out.println();
					return 0;
				}
				
			}

		public void setRent(int rent)
			{
				this.rent = rent;
			}

		public int getPrice()
			{
				return price;
			}

		public void setPrice(int price)
			{
				this.price = price;
			}

		public int getNumOfUtilities()
			{
				return numOfUtilities;
			}

		public void setNumOfUtilities(int numOfUtilities)
			{
				this.numOfUtilities = numOfUtilities;
			}

		
		
		
	}
