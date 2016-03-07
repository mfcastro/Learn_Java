import java.util.Scanner;
import java.lang.Math;

public class ControlRobot {

	public void MainMenu(Robot robot){
		System.out.println("MAIN -> Move [m], Turn on/off [o], Display Battery Life [b], Charge [c] Exit [x]");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();

		if(answer.equals("m")){
			MovementMenu(robot);
		}
		else if(answer.equals("o")){

			if(robot.On == true){
				robot.TurnOff();
			}
			else if(robot.On == false){
				robot.TurnOn();
			}
			MainMenu(robot);
		}
		else if (answer.equals("b")){
			robot.DisplayPowerLevel();
			MainMenu(robot);
		}
		else if(answer.equals("c")){
			robot.Recharge(robot);
			MainMenu(robot);
		}
		else if(answer.equals("x")){
			System.out.println("-----------------------------");
			System.exit(0);
		}
		else{
			System.out.println("Invalid Entry");
			MainMenu(robot);
		}
	}

	public  int MoveForward(Robot robot){
		double rand = Math.random();
		
		if(rand > 0.8){
			System.out.println("2 steps forward");
			System.out.println("Battery - 2%");
			return robot.BatteryLevel -=2;
		}
		if(0.5 < rand && rand<= 0.8 ){
			System.out.println("10 steps forward");
			System.out.println("Battery - 10%");
			return robot.BatteryLevel -=10;
		}
		if(0.2 < rand && rand<= 0.5 ){
			System.out.println("15 steps forward");
			System.out.println("Battery - 15%");
			return robot.BatteryLevel -=15;
		}
		if(0.02 < rand && rand<= 0.2 ){
			System.out.println("5 steps forward");
			System.out.println("Battery - 5%");
			return robot.BatteryLevel -=5;
		}
		else{
			System.out.println("Got stuck. No steps taken");
			return 0;
		}

	}

	public  int MoveBackward(Robot robot){
		double rand = Math.random();
		
		if(rand > 0.8){
			System.out.println("2 steps backwards");
			System.out.println("Battery - 2%");
			return robot.BatteryLevel -=2;
		}
		if(0.5 < rand && rand<= 0.8 ){
			System.out.println("14 steps backwards");
			System.out.println("Battery - 14%");
			return robot.BatteryLevel -=14;
		}
		if(0.2 < rand && rand<= 0.5 ){
			System.out.println("7 steps backwards");
			System.out.println("Battery - 7%");
			return robot.BatteryLevel -=7;
		}
		if(0.02 < rand && rand<= 0.2 ){
			System.out.println("5 steps backwards");
			System.out.println("Battery - 5%");
			return robot.BatteryLevel -=5;
		}
		else{
			System.out.println("Got stuck. No steps taken");
			return 0;
		}
		
		
		
	}	

	public void MovementMenu(Robot robot){
		Boolean move = true;
		while (move){
			Scanner scan = new Scanner(System.in);
			System.out.println("MOVE -> Move Forward [w]; Move BackWards [s]; Display Battery Life [b] Exit [x]");
			String control = scan.next();

			if(robot.BatteryLevel == 0 || robot.BatteryLevel < 0 ){
				robot.BatteryDead(robot);
				move = false;
			}
			else if(robot.On == false){
				System.out.println("Turn on "+robot.Name+" the Robot!");
				MainMenu(robot);
			}
			else if(control.equals("w")){
				MoveForward(robot);
			}
			else if(control.equals("s")){
				MoveBackward(robot);
			}
			else if(control.equals("b")){
				robot.DisplayPowerLevel();
			}
			else if(control.equals("x")){
				move = false;	
				MainMenu(robot);
			}
			else{
				System.out.println("Invalid Entry");
			}
		}
	}

	public void RechargeMenu(Robot robot){

		System.out.println("Do you want to recharge now? [y/n]");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();

		if(answer.equals("y")){
			robot.Recharge(robot);
		}
		else if(answer.equals("n")){
			MainMenu(robot);
		}
		else{
			System.out.println("Invalid Answer");
			RechargeMenu(robot);
		}

	}


}
