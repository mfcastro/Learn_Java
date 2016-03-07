import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Object player = CreatePlayer();
		DoYouWantToRead(player);
		AreYouHungry(player);
		Goodbye(player);
		


	}
	
	public static Object CreatePlayer(){
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your name: " );
		String playerName = scan.next();
		
		Player player = new Player(playerName); 

		System.out.println("Hello " + player.PlayerName + "!");
		System.out.println("Health: " + player.PlayerHealth);
		System.out.println("IQ: "+ player.IQ);
		System.out.println("___________________________");
		System.out.println();
		return player;
	}


	public static void AreYouHungry(Object player){
		boolean hungry = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you hungry? [y/n]");
		String hunger = scan.next();

		if(hunger.equals("y") || hunger.equals("yes")){

			TimeToEat.FoodTime(hungry, player);
		}
		else if(hunger.equals("n") || hunger.equals("no")){
			Goodbye(player);
		}
		else{
			System.out.println("Invalid Answer");
			AreYouHungry(player);
		}
	}


	public static void DoYouWantToRead(Object player){
		Scanner scan = new Scanner(System.in);
		Library myBooks = new Library();

		System.out.println("Do you want to read? [y/n] ");
		String read = scan.next();

		if (read.equals("y")){
			myBooks.AvailableBooks(player);
		}
	}


	public static void Goodbye(Object player){
		System.out.println("_______Have a good day!_______");
		System.out.println("Health: " + ((Player)player).PlayerHealth + " IQ: "+ ((Player)player).IQ);
		System.exit(0);
	}
}


