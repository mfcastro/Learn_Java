import java.util.Scanner;

public class TimeToEat {

	
	public static void FoodTime(boolean hungry, Object player){
		while(hungry){
			Scanner scan = new Scanner(System.in);
			String meal;
			System.out.println("Would you like to have breakfast [b], lunch [l], dinner [d]? ");
			String mealTime = scan.next();
			System.out.println();

			if(mealTime.equals("breakfast") || mealTime.equals("b")){
				Breakfast(player);
			}
			else if (mealTime.equals("lunch") || mealTime.equals("l")){
				Lunch(player);
			}
			else if (mealTime.equals("dinner") || mealTime.equals("d")){
				Dinner(player);
			}
			else{
				System.out.println("No time to eat!");
			}

			System.out.println("_____________________________________");		
			stillHungry();
		}

	}

	/////BREAKFAST/////////////		
	public static void Breakfast(Object player){
		Scanner scan = new Scanner(System.in);
		boolean wantBreakfast = true;

		System.out.println("What would you like to eat for breakfast?" );
		System.out.print("MENU -> Eggs[e], Yogurt[y], or Toast[t]: ");

		String meal = scan.next();
		System.out.println();

		BreakfastMenu(meal, player);

		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("Do you want more breakfast? [y/n] ");
		System.out.println();

		meal = scan.next();

		if( meal.equals("y")){
			Breakfast(player);
		}
		else if (meal.equals("n")){
			wantBreakfast = false;
		}
	} 	

	/////LUNCH/////////////		
	public static void Lunch(Object player){
		Scanner scan = new Scanner(System.in);
		String meal;

		System.out.println("What would you like to eat for lunch?");
		System.out.print("MENU -> Soup[s], Sandwich[w], or Taco[t]: ");

		meal = scan.next();
		System.out.println();

		LunchMenu(meal, player);

		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("Do you want more lunch? [y/n] ");
		System.out.println();

		meal = scan.next();

		if( meal.equals("y")){
			Lunch(player);
		}
	}

	/////DINNER/////////////		
	public static void Dinner(Object player){
		Scanner scan = new Scanner(System.in);
		String meal;

		System.out.println("What would you like to eat for dinner?");
		System.out.print("MENU -> Pizza[p], Burger[b], or Pasta[s]: ");
		meal = scan.next();
		System.out.println();

		DinnerMenu(meal, player);

		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("Do you want more dinner? [y/n] ");
		System.out.println();

		meal = scan.next();

		if( meal.equals("y")){
			Dinner(player);
		}


	}

	/////BREAKFAST MENU/////////////		
	public static void BreakfastMenu(String meal, Object player){
		switch(meal){
		case "e":
		case "egg":	
			System.out.println("One order of eggs coming right up!");
			((Player) player).Eat(15);

			break;
		case "y":
		case "yogurt":	
			System.out.println("Yogurt coming real fast!");
			((Player) player).Eat(10);
			break;
		case "t":
		case "toast":	
			System.out.println("A toast to you sir!");
			((Player) player).Eat(5);
			break;	
		default:
			System.out.println("We do not have that!");
			
		}
	}

	/////LUNCH MENU/////////////		
	public static void LunchMenu(String meal, Object player){
		switch(meal){
		case "s":
		case "soup":	
			System.out.println("One order of the soup of the day!");
			((Player) player).Eat(15);
			break;
		case "w":
		case "sandwich":	
			System.out.println("One sandwich coming up!");
			((Player) player).Eat(15);
			break;
		case "t":
		case "taco":	
			System.out.println("Un Taco!");
			((Player) player).Eat(12);
			break;	
		default:
			System.out.println("We do not have that!");
		}
	}

	/////DINNER MENU/////////////		
	public static void DinnerMenu(String meal, Object player){
		switch(meal){
		case "p":
		case "pizza":	
			System.out.println("Pizza coming!");
			((Player) player).Eat(20);
			break;
		case "b":
		case "burger":	
			System.out.println("One burger with fries!");
			((Player) player).Eat(17);
			break;
		case "s":
		case "pasta":	
			System.out.println("Pasta to go!");
			((Player) player).Eat(16);
			break;	
		default:
			System.out.println("We do not have that!");
		}
	}

	///////STIL HUNGRY//////////
	public static void stillHungry(){
		Scanner scan = new Scanner(System.in);
		String meal;
		System.out.println();
		boolean hungry = true;
		System.out.println("Are you still hungry y/n? ");
		meal = scan.next();

		if(meal.equals("n") || meal.equals("no")){
			main.Goodbye();
			System.exit(0);

		}
		else if(meal.equals("y") || meal.equals("yes")){
			System.out.println("___________________________");
			System.out.println();
		}

	}
}
