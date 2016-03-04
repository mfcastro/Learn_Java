import java.util.Scanner;

public class TimeToEat {

	
	public static void FoodTime(boolean hungry){
		while(hungry){
			Scanner scan = new Scanner(System.in);
			String meal;
			System.out.println("Would you like to have breakfast [b], lunch [l], dinner [d]? ");
			String mealTime = scan.next();
			System.out.println();

			if(mealTime.equals("breakfast") || mealTime.equals("b")){
				Breakfast();
			}
			else if (mealTime.equals("lunch") || mealTime.equals("l")){
				Lunch();
			}
			else if (mealTime.equals("dinner") || mealTime.equals("d")){
				Dinner();
			}
			else{
				System.out.println("No time to eat!");
			}

			System.out.println("_____________________________________");		
			stillHungry();
		}

	}

	/////BREAKFAST/////////////		
	public static void Breakfast(){
		Scanner scan = new Scanner(System.in);
		boolean wantBreakfast = true;

		System.out.println("What would you like to eat for breakfast?" );
		System.out.print("MENU -> Eggs[e], Yogurt[y], or Toast[t]: ");

		String meal = scan.next();
		System.out.println();

		BreakfastMenu(meal);

		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("Do you want more breakfast? [y/n] ");
		System.out.println();

		meal = scan.next();

		if( meal.equals("y")){
			Breakfast();
		}
		else if (meal.equals("n")){
			wantBreakfast = false;
		}
	} 	

	/////LUNCH/////////////		
	public static void Lunch(){
		Scanner scan = new Scanner(System.in);
		String meal;

		System.out.println("What would you like to eat for lunch?");
		System.out.print("MENU -> Soup[s], Sandwich[w], or Taco[t]: ");

		meal = scan.next();
		System.out.println();

		LunchMenu(meal);

		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("Do you want more lunch? [y/n] ");
		System.out.println();

		meal = scan.next();

		if( meal.equals("y")){
			Lunch();
		}
	}

	/////DINNER/////////////		
	public static void Dinner(){
		Scanner scan = new Scanner(System.in);
		String meal;

		System.out.println("What would you like to eat for dinner?");
		System.out.print("MENU -> Pizza[p], Burger[b], or Pasta[s]: ");
		meal = scan.next();
		System.out.println();

		DinnerMenu(meal);

		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("Do you want more dinner? [y/n] ");
		System.out.println();

		meal = scan.next();

		if( meal.equals("y")){
			Dinner();
		}


	}

	/////BREAKFAST MENU/////////////		
	public static void BreakfastMenu(String meal){
		switch(meal){
		case "e":
		case "egg":	
			System.out.println("One order of eggs coming right up!");
			break;
		case "y":
		case "yogurt":	
			System.out.println("Yogurt coming real fast!");
			break;
		case "t":
		case "toast":	
			System.out.println("A toast to you sir!");
			break;	
		default:
			System.out.println("We do not have that!");
		}
	}

	/////LUNCH MENU/////////////		
	public static void LunchMenu(String meal){
		switch(meal){
		case "s":
		case "soup":	
			System.out.println("One order of the soup of the day!");
			break;
		case "w":
		case "sandwich":	
			System.out.println("One sandwich coming up!");
			break;
		case "t":
		case "taco":	
			System.out.println("Un Taco!");
			break;	
		default:
			System.out.println("We do not have that!");
		}
	}

	/////DINNER MENU/////////////		
	public static void DinnerMenu(String meal){
		switch(meal){
		case "p":
		case "pizza":	
			System.out.println("Pizza coming!");
			break;
		case "b":
		case "burger":	
			System.out.println("One burger with fries!");
			break;
		case "s":
		case "pasta":	
			System.out.println("Pasta to go!");
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
