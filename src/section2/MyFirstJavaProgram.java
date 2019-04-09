package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot bob = new Robot ();
		bob.setSpeed(100);
		bob.penDown();
		for(int i = 0; i < 4; i++) {
		bob.move(100);
		bob.turn(90);
		}
	}
}
