public class Railroad extends BoardSpace
	{
		private int oneRoadRent;
		private int twoRoadRent;
		private int threeRoadRent;
		private int fourRoadRent;
		private int mortgage;
		private int price;
		private int numOfRoads;
		boolean owned = false;
		
		public Railroad(String n, int l, int r1,int r2, int r3, int r4, int m, int p, boolean o)
		{
			setName(n);
			setLocation(l);
			oneRoadRent = r1;
			twoRoadRent = r2;
			threeRoadRent = r3;
			fourRoadRent = r4;
			mortgage = m;
			price = p;
			owned = o;
			
		}

		public int getOneRoadRent()
			{
				return oneRoadRent;
			}

		public void setOneRoadRent(int oneRoadRent)
			{
				this.oneRoadRent = oneRoadRent;
			}

		public int getTwoRoadRent()
			{
				return twoRoadRent;
			}

		public void setTwoRoadRent(int twoRoadRent)
			{
				this.twoRoadRent = twoRoadRent;
			}

		public int getThreeRoadRent()
			{
				return threeRoadRent;
			}

		public void setThreeRoadRent(int threeRoadRent)
			{
				this.threeRoadRent = threeRoadRent;
			}

		public int getFourRoadRent()
			{
				return fourRoadRent;
			}

		public void setFourRoadRent(int fourRoadRent)
			{
				this.fourRoadRent = fourRoadRent;
			}

		public int getMortgage()
			{
				return mortgage;
			}

		public void setMortgage(int mortgage)
			{
				this.mortgage = mortgage;
			}

		public int getNumOfRoads()
			{
				return numOfRoads;
			}

		public void setNumOfRoads(int numOfRoads)
			{
				this.numOfRoads = numOfRoads;
			}

		public boolean isOwned()
			{
				return owned;
			}

		public void setOwned(boolean owned)
			{
				this.owned = owned;
			}

		public int getRent()
			{
				return oneRoadRent;
			}

		public void setRent(int rent)
			{
				this.oneRoadRent = rent;
			}

		public int getPrice()
			{
				return price;
			}

		public void setPrice(int price)
			{
				this.price = price;
			}


		
	}
