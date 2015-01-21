package org.usfirst.frc.team930.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;


public class Robot extends SampleRobot {

	Joystick stick;
	RobotDrive drive;
	CANTalon tal1;
	CANTalon tal2;
	CANTalon tal3;
	CANTalon tal4;
	

	public Robot() {
		tal1 = new CANTalon(1);
		tal2 = new CANTalon(2);
		tal3 = new CANTalon(3);
		tal4 = new CANTalon(4);
		stick = new Joystick(0);

		drive = new RobotDrive(tal3, tal1, tal4, tal2);
		drive.setInvertedMotor(MotorType.kFrontLeft, true);
		drive.setInvertedMotor(MotorType.kRearLeft, true);
		drive.setInvertedMotor(MotorType.kRearRight, true);
	}

	public void autonomous() {

	}

	
	 // Runs the motors with arcade steering.
	 
	public void operatorControl() {

		while (isOperatorControl() && isEnabled()) {

			
			drive.arcadeDrive(stick);
		}
	}

	
	public void test() {
	}
}
