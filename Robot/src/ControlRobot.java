import java.util.Scanner;

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
			robot.Recharge();
			MainMenu(robot);
		}
		else if(answer.equals("x")){
			System.out.println("-----------------------------");
			System.exit(0);
		}
		else{
			MainMenu(robot);
		}
	}

	public  int MoveForward(Robot robot){
		System.out.println("Battery - 10%");
		return robot.BatteryLevel -=10;

	}

	public  int MoveBackward(Robot robot){
		System.out.println("Battery - 5%");
		return robot.BatteryLevel -=5;
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
				System.out.println("Turn on your Robot!");
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
		}
	}

	public void RechargeMenu(Robot robot){

		System.out.println("Do you want to recharge now? [y/n]");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();

		if(answer.equals("y")){
			robot.Recharge();
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
