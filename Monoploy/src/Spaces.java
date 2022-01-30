import java.util.*;

public class Spaces
	{
		
		static ArrayList<BoardSpace> board = new ArrayList<BoardSpace>();
	
		//boards
		
		
		public static void fillboard()
			{			
				board.add(new BoardSpace("Go", 0));
				board.add(new Property("Mediterranean Avenue", 1, 60, 50, 2, 10, 30, 90, 160, 250, 30, "Brown", false, 0, 0));
				board.add(new BoardSpace("Community Chest Card", 2));
				board.add(new Property("Baltic Avenue", 3, 60, 50, 4, 20, 60, 180, 320, 450, 30,  "Brown", false, 0, 0));
				board.add(new BoardSpace("Income Tax", 4));
				board.add(new Railroad("Reading Railroad", 5, 25, 50, 100, 200, 100, 200, false));
				board.add(new Property("Oriental Avenue", 6, 100, 50, 6, 30, 90, 270, 400, 550, 50, "Light Blue", false, 0, 0));
				board.add(new BoardSpace("Chance Card", 7));
				board.add(new Property("Vermont Avenue", 8, 100, 50, 6, 30, 90, 270, 400, 550, 50, "Light Blue", false, 0, 0));
				board.add(new Property("Connecticut Avenue", 9, 120, 50, 8, 40, 100, 300, 450, 600, 60, "Light Blue", false, 0, 0));
				board.add(new BoardSpace("Jail", 10));
				board.add(new Property("St. Charles Place", 11, 140, 100, 10, 50, 150, 450, 625, 750, 70, "Pink", false, 0, 0));
				board.add(new Utility("Electric Company", 12, 150, 0, false));
				board.add(new Property("States Avenue", 13, 140, 100, 10, 50, 150, 450, 625, 750, 70, "Pink", false, 0, 0));
				board.add(new Property("Virginia Avenue", 14, 160, 100, 12, 60, 180, 500, 700, 900, 80, "Pink", false, 0, 0));
				board.add(new Railroad("Pennsylvania Railroad", 15, 25, 50, 100, 200, 100, 200, false));
				board.add(new Property("St. James Place", 16, 180, 100, 14, 70, 200, 550, 750, 950, 90, "Orange", false, 0, 0));
				board.add(new BoardSpace("Community Chest", 17));
				board.add(new Property("Tennessee Avenue", 18, 180, 100, 14, 70, 200, 550, 750, 950, 90, "Orange", false, 0 ,0));
				board.add(new Property("New York Avenue", 19, 200, 100, 16, 80, 220, 600, 800, 1000, 100, "Orange", false, 0 ,0));
				board.add(new BoardSpace("Free Parking", 20));
				board.add(new Property("Kentucky Avenue", 21, 220, 150, 18, 90, 250, 700, 875, 1050, 110, "Red", false, 0 ,0));
				board.add(new BoardSpace("Chance Card", 22));
				board.add(new Property("Indiana Avenue", 23, 220, 150, 18, 90, 250, 700, 875, 1050, 110, "Red", false, 0 ,0));
				board.add(new Property("Illinois Avenue", 24, 240, 150, 20, 100, 300, 750, 925, 1100, 120, "Red", false, 0 ,0));
				board.add(new Railroad("B. & O. Railroad", 25, 25, 50, 100, 200, 100, 200, false));
				board.add(new Property("Atlantic Avenue", 26, 260, 150, 22, 110, 330, 800, 975, 1150, 130, "Yellow", false, 0 ,0));
				board.add(new Property("Ventnor Avenue", 27, 260, 150, 22, 110, 330, 800, 975, 1150, 130, "Yellow", false, 0 ,0));
				board.add(new Utility("Water Works", 28, 150, 0, false));
				board.add(new Property("Marvin Gardens", 29, 280, 150, 24, 120, 360, 850, 1025, 1200, 140, "Yellow", false, 0 ,0));
				board.add(new BoardSpace("Go To Jail", 30));
				board.add(new Property("Pacific Avenue", 31, 300, 200, 26, 130, 390, 900, 1100, 1275, 150, "Green", false, 0 ,0));
				board.add(new Property("North Carolina Avenue", 32, 300, 200, 26, 130, 390, 900, 1100, 1275, 150, "Green", false, 0 ,0));
				board.add(new BoardSpace("Community Chest", 33));
				board.add(new Property("Pennsylvania Avenue", 34, 320, 200, 28, 150, 450, 1000, 1200, 1400, 160, "Green", false, 0 ,0));
				board.add(new Railroad("Short Line", 35, 25, 50, 100, 200, 100, 200, false));
				board.add(new BoardSpace("Chance Card", 36));
				board.add(new Property("Park Place", 37, 350, 200, 35, 175, 500, 1100, 1300, 1500, 175, "Dark Blue", false, 0 ,0));
				board.add(new BoardSpace("Luxury Tax", 38));
				board.add(new Property("Boardwalk", 39, 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, "Dark Blue", false, 0 ,0));
			}
		public static void fillSkiBoard()
			{
				board.add(new BoardSpace("Go", 0));
				board.add(new Property("Steamboat", 1, 60, 50, 2, 10, 30, 90, 160, 250, 30, "Brown", false, 0, 0));
				board.add(new BoardSpace("Ski Patrol Orders", 2));
				board.add(new Property("Howelsen Hill", 3, 60, 50, 4, 20, 60, 180, 320, 450, 30,  "Brown", false, 0, 0));
				board.add(new BoardSpace("Epic Pass", 4));
				board.add(new Railroad("Free Chondola", 5, 25, 50, 100, 200, 100, 200, false));
				board.add(new Property("Breckenridge", 6, 100, 50, 6, 30, 90, 270, 400, 550, 50, "Light Blue", false, 0 ,0));
				board.add(new BoardSpace("Chance Card", 7));
				board.add(new Property("Eldora Mountain", 8, 100, 50, 6, 30, 90, 270, 400, 550, 50, "Light Blue", false, 0, 0));
				board.add(new Property("Sunlight", 9, 120, 50, 8, 40, 100, 300, 450, 600, 60, "Light Blue", false, 0, 0));
				board.add(new BoardSpace("Jail", 10));
				board.add(new Property("Ski Cooper", 11, 140, 100, 10, 50, 150, 450, 625, 750, 70, "Pink", false, 0,0));
				board.add(new Utility("Lift Maintenence", 12, 150, 0, false));
				board.add(new Property("Echo Mountain", 13, 140, 100, 10, 50, 150, 450, 625, 750, 70, "Pink", false, 0, 0));
				board.add(new Property("Vail", 14, 160, 100, 12, 60, 180, 500, 700, 900, 80, "Pink", false, 0, 0));
				board.add(new Railroad("Elk Camp Gondola", 15, 25, 50, 100, 200, 100, 200, false));
				board.add(new Property("Granby Ranch", 16, 180, 100, 14, 70, 200, 550, 750, 950, 90, "Orange", false, 0, 0));
				board.add(new BoardSpace("Community Chest", 17));
				board.add(new Property("Arapahoe Basin", 18, 180, 100, 14, 70, 200, 550, 750, 950, 90, "Orange", false, 0, 0));
				board.add(new Property("Beaver Creek", 19, 200, 100, 16, 80, 220, 600, 800, 1000, 100, "Orange", false, 0, 0));
				board.add(new BoardSpace("Free Parking", 20));
				board.add(new Property("Keystone", 21, 220, 150, 18, 90, 250, 700, 875, 1050, 110, "Red", false, 0, 0));
				board.add(new BoardSpace("Chance Card", 22));
				board.add(new Property("Loveland", 23, 220, 150, 18, 90, 250, 700, 875, 1050, 110, "Red", false, 0, 0));
				board.add(new Property("Monarch", 24, 240, 150, 20, 100, 300, 750, 925, 1100, 120, "Red", false, 0, 0));
				board.add(new Railroad("Gondola One", 25, 25, 50, 100, 200, 100, 200, false));
				board.add(new Property("Powderhorn", 26, 260, 150, 22, 110, 330, 800, 975, 1150, 130, "Yellow", false, 0,  0));
				board.add(new Property("Purgatory", 27, 260, 150, 22, 110, 330, 800, 975, 1150, 130, "Yellow", false, 0, 0));
				board.add(new Utility("Snowmaking", 28, 150, 0, false));
				board.add(new Property("Winter Park", 29, 280, 150, 24, 120, 360, 850, 1025, 1200, 140, "Yellow", false, 0, 0));
				board.add(new BoardSpace("Go To Jail", 30));
				board.add(new Property("Crested Butte", 31, 300, 200, 26, 130, 390, 900, 1100, 1275, 150, "Green", false, 0, 0));
				board.add(new Property("Copper Mountain", 32, 300, 200, 26, 130, 390, 900, 1100, 1275, 150, "Green", false, 0 ,0));
				board.add(new BoardSpace("Community Chest", 33));
				board.add(new Property("Telluride", 34, 320, 200, 28, 150, 450, 1000, 1200, 1400, 160, "Green", false, 0, 0));
				board.add(new Railroad("Silver Queen Gondola", 35, 25, 50, 100, 200, 100, 200, false));
				board.add(new BoardSpace("Unfortunate Occurences", 36));
				board.add(new Property("Snowmass Mountain", 37, 350, 200, 35, 175, 500, 1100, 1300, 1500, 175, "Dark Blue", false, 0, 0));
				board.add(new BoardSpace("IKON Pass", 38));
				board.add(new Property("Aspen Mountain", 39, 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, "Dark Blue", false, 0, 0));
			}
	}
