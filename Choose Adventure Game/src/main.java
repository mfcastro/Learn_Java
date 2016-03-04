import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		CreatePlayer();
		DoYouWantToRead();
		AreYouHungry();
		Goodbye();
		
		
	}
	public static void CreatePlayer(){
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your name: " );
		String playerName = scan.next();
		Player player = new Player(playerName); 
		
		System.out.println("Hello " + player.PlayerName + "!");
	}
	
	public static void FoodTime(boolean hungry){
		TimeToEat TimeToEat = new TimeToEat();
		
		while(hungry){
			Scanner scan = new Scanner(System.in);
			String meal;
			System.out.println("Would you like to have breakfast [b], lunch [l], dinner [d]? ");
			String mealTime = scan.next();
			System.out.println();
			
		if(mealTime.equals("breakfast") || mealTime.equals("b")){
				TimeToEat.Breakfast();
		}
		else if (mealTime.equals("lunch") || mealTime.equals("l")){
				TimeToEat.Lunch();
		}
		else if (mealTime.equals("dinner") || mealTime.equals("d")){
				TimeToEat.Dinner();
		}
		else{
			System.out.println("No time to eat!");
		}
		
		System.out.println("_____________________________________");		
		TimeToEat.stillHungry();
		}
		
	}

	public static void AreYouHungry(){
	boolean hungry = true;
	Scanner scan = new Scanner(System.in);
	System.out.println("Are you hungry? [y/n]");
	String hunger = scan.next();
	
	if(hunger.equals("y") || hunger.equals("yes")){
		
		FoodTime(hungry);
	}
}



public static void DoYouWantToRead(){
	Scanner scan = new Scanner(System.in);
	Library myBooks = new Library();
	
	System.out.println("Do you want to read? [y/n] ");
	String read = scan.next();
	
	if (read.equals("y")){
		myBooks.SelectBook();
	}
}


public static void Goodbye(){
	System.out.println("_______Have a good day!_______");
}
}


