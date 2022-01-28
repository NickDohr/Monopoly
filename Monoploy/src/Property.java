public class Property extends BoardSpace
	{
		private int price;
		private int houseprice;
		private int rent;
		private int rentOne;
		private int rentTwo;
		private int rentThree;
		private int rentFour;
		private int rentHotel;
		private int mortgage;
		private String color;
		boolean owned = false;
		int numOfHouses;
	
		
		
		


	
		public Property(String n, int l, int p, int hp, int r, int r1, int r2, int r3, int r4, int rh, int m, String c, boolean o, int h)
		{
			
			setName(n);
			setLocation(l);
			price = p;
			houseprice = hp;
			rent = r;
			rentOne = r1;
			rentTwo = r2;
			rentThree = r3;
			rentFour = r4;
			rentHotel = rh;
			mortgage = m;
			color = c;
			owned = o;
			numOfHouses = h;
			
		}
		
		public int getNumOfHouses()
			{
				return numOfHouses;
			}
		public void setNumOfHouses(int numOfHouses)
			{
				this.numOfHouses = numOfHouses;
			}
		public boolean isOwned()
			{
				return owned;
			}


		public void setOwned(boolean owned)
			{
				this.owned = owned;
			}

		public int getRentOne()
			{
				return rentOne;
			}



		public int getPrice()
			{
				return price;
			}


		public void setPrice(int price)
			{
				this.price = price;
			}


		public int getHouseprice()
			{
				return houseprice;
			}


		public void setHouseprice(int houseprice)
			{
				this.houseprice = houseprice;
			}


		public int getRent()
			{
				return rent;
			}


		public void setRent(int rent)
			{
				this.rent = rent;
			}


		public void setRentOne(int rentOne)
			{
				this.rentOne = rentOne;
			}



		public int getRentTwo()
			{
				return rentTwo;
			}



		public void setRentTwo(int rentTwo)
			{
				this.rentTwo = rentTwo;
			}



		public int getRentThree()
			{
				return rentThree;
			}



		public void setRentThree(int rentThree)
			{
				this.rentThree = rentThree;
			}



		public int getRentFour()
			{
				return rentFour;
			}



		public void setRentFour(int rentFour)
			{
				this.rentFour = rentFour;
			}



		public int getRentHotel()
			{
				return rentHotel;
			}



		public void setRentHotel(int rentHotel)
			{
				this.rentHotel = rentHotel;
			}



		public int getMortgage()
			{
				return mortgage;
			}



		public void setMortgage(int mortgage)
			{
				this.mortgage = mortgage;
			}



		public String getColor()
			{
				return color;
			}



		public void setColor(String color)
			{
				this.color = color;
			}
		
		
	}