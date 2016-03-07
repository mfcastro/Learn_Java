import java.util.Scanner;
import java.lang.Math;
public class main {

	public static void main(String[] args) {
		System.out.println("Welcome to Robot Simulator!");
		
		boolean simulatorOn = true;
		//Robot robot = new Robot("Rob");
		//robot.MainMenu(robot);
		
		while(simulatorOn){
			CreateRobot ron = new CreateRobot();
			String robotType = ron.SelectRobotType();
			String name = ron.NameRobot();
			
			if(robotType.equals("r")){
				Robot robot = new Robot(name);
				robot.MainMenu(robot);
			}
			else if(robotType.equals("h")){
				humanoid humanoid = new humanoid(name);
				humanoid.MainMenu(humanoid);
			}
			else if(robotType.equals("m")){
				MilitaryRobot milRob = new MilitaryRobot(name);
				milRob.MainMenu(milRob);
			}
			else{
				System.out.println("The type of robot does not exist");
			}
			simulatorOn = false;
		}
	}
}
