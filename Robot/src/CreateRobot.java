import java.util.Scanner;

public class CreateRobot{
	
	public String SelectRobotType(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Standard Robot [r] , Humanoid [h] , Military [m]");
		String selection = scan.next();
		return selection;
	}
	public String NameRobot(){
		Scanner scan = new Scanner(System.in);
		System.out.print("What name do you want to give your robot? ");
		String name = scan.next();
		return name;
	}
}
