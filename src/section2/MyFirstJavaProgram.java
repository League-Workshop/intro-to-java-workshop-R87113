package section2;

import java.awt.Color;
import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot chappie=new Robot();
		chappie.penDown();
		chappie.setSpeed(300);
		for(int i=0;i<200;i++) {
		chappie.move(100);
		chappie.turn(90);
		chappie.move(100);
		
	}
}
}