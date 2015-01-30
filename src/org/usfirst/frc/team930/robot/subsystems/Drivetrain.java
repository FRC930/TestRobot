package org.usfirst.frc.team930.robot.subsystems;

import org.usfirst.frc.team930.robot.OI;
import org.usfirst.frc.team930.robot.commands.Drive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	CANTalon talon1 = new CANTalon(1);
	CANTalon talon2 = new CANTalon(2);
	CANTalon talon3 = new CANTalon(3);
	CANTalon talon4 = new CANTalon(4);
	OI oi = OI.getInstance();
	
	RobotDrive drive = new RobotDrive(talon1, talon2, talon3, talon4);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
    
    public void arcade(double x, double y){
    	drive.arcadeDrive(x, y);
    	
    }
    
}

