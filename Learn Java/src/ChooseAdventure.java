import java.util.Scanner;
 
public class ChooseAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you hungry? [y/n]");
		String hunger = scan.next();
		
		if(hunger.equals("y")){
			boolean hungry = true;
			food(true);
		}
		else{
			System.out.println("_______Have a good day!_______");
		}
		
		

	}

//Start of food function	
	public static void food(boolean hungry){
		while(hungry){
			Scanner scan = new Scanner(System.in);
			String meal;
			System.out.println("Is it breakfast [b], lunch [l], dinner [d]? ");
			String mealTime = scan.next();
			System.out.println();
		
		if(mealTime.equals("breakfast") || mealTime.equals("b")){
			System.out.println("What would you like to eat for breakfast?" );
			System.out.print("MENU -> Eggs[e], Yogurt[y], or Toast[t]: ");
			meal = scan.next();
			System.out.println();
			
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
		else if (mealTime.equals("lunch") || mealTime.equals("l")){
			System.out.println("What would you like to eat for lunch?");
			System.out.print("MENU -> Soup[s], Sandwich[w], or Taco[t]: ");
			meal = scan.next();
			System.out.println();

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
		
		else if (mealTime.equals("dinner") || mealTime.equals("d")){
			System.out.println("What would you like to eat for dinner?");
			System.out.print("MENU -> Pizza[p], Burger[b], or Pasta[s]: ");
			meal = scan.next();
			System.out.println();

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
		else{
			System.out.println("No time to eat!");
		}
		
	
		System.out.println();
		System.out.println("Are you still hungry y/n? ");
		meal = scan.next();
		
		if(meal.equals("n")){
			System.out.println("_______Have a good day!_______");
			hungry = false;
		}
		else if(meal.equals("y")){
		System.out.println("___________________________");
		System.out.println();
		}
		
		
		}
		
	}
//end food function	
	

}
