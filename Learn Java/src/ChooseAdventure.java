import java.util.Scanner;

public class ChooseAdventure {
	
	public static void main(String[] args) {
		areYouHungry();
		
	}

//Start of food function	
	public static void foodTime(boolean hungry){
		while(hungry){
			Scanner scan = new Scanner(System.in);
			String meal;
			System.out.println("Would you like to have breakfast [b], lunch [l], dinner [d]? ");
			String mealTime = scan.next();
			System.out.println();
			
		if(mealTime.equals("breakfast") || mealTime.equals("b")){
				breakfast();
		}
		else if (mealTime.equals("lunch") || mealTime.equals("l")){
				lunch();
		}
		else if (mealTime.equals("dinner") || mealTime.equals("d")){
				dinner();
		}
		else{
			System.out.println("No time to eat!");
		}
		
		System.out.println("_____________________________________");		
		stillHungry();
		}
		
	}
//end food function	

/////BREAKFAST/////////////		
public static void breakfast(){
	Scanner scan = new Scanner(System.in);
	boolean wantBreakfast = true;
	
	System.out.println("What would you like to eat for breakfast?" );
	System.out.print("MENU -> Eggs[e], Yogurt[y], or Toast[t]: ");
	
	String meal = scan.next();
	System.out.println();

	breakfastMenu(meal);
	
	System.out.println("-----------------------------");
	System.out.println();
	System.out.print("Do you want more breakfast? [y/n] ");
	System.out.println();
	
	meal = scan.next();
	
	if( meal.equals("y")){
		breakfast();
	}
	else if (meal.equals("n")){
		wantBreakfast = false;
		
	}
} 	

/////LUNCH/////////////		
public static void lunch(){
	Scanner scan = new Scanner(System.in);
	String meal;
	
	System.out.println("What would you like to eat for lunch?");
	System.out.print("MENU -> Soup[s], Sandwich[w], or Taco[t]: ");
	
	meal = scan.next();
	System.out.println();

	lunchMenu(meal);
	
	System.out.println("-----------------------------");
	System.out.println();
	System.out.print("Do you want more lunch? [y/n] ");
	System.out.println();
	
	meal = scan.next();
	
	if( meal.equals("y")){
		lunch();
	}
}

/////DINNER/////////////		
public static void dinner(){
	Scanner scan = new Scanner(System.in);
	String meal;
	
	System.out.println("What would you like to eat for dinner?");
	System.out.print("MENU -> Pizza[p], Burger[b], or Pasta[s]: ");
	meal = scan.next();
	System.out.println();
	
	dinnerMenu(meal);
	
	System.out.println("-----------------------------");
	System.out.println();
	System.out.print("Do you want more dinner? [y/n] ");
	System.out.println();
	
	meal = scan.next();
	
	if( meal.equals("y")){
		dinner();
	}
	

}

/////BREAKFAST MENU/////////////		
public static void breakfastMenu(String meal){
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
public static void lunchMenu(String meal){
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
public static void dinnerMenu(String meal){
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



public static void areYouHungry(){
	boolean hungry = true;
	Scanner scan = new Scanner(System.in);
	System.out.println("Are you hungry? [y/n]");
	String hunger = scan.next();
	
	if(hunger.equals("y") || hunger.equals("yes")){
		
		foodTime(hungry);
	}
	else{
		System.out.println("_______Have a good day!_______");
		hungry = false;
		
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
		//areYouHungry();
		System.out.println("_______Have a good day!_______");
		System.exit(0);
		return;
	}
	else if(meal.equals("y") || meal.equals("yes")){
		System.out.println("___________________________");
		System.out.println();
	}

}



}
