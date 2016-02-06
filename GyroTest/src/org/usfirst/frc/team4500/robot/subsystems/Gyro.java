package org.usfirst.frc.team4500.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.ADXRS450_Gyro; 
import edu.wpi.first.wpilibj.Encoder;



/**
 *
 */
public class Gyro extends Subsystem {
	
	ADXRS450_Gyro gyro;
	Encoder encoder;
	
	
	double Kp = 0.03;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	gyro = new ADXRS450_Gyro();
    	encoder = new Encoder(0, 1);
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void gyroMethod()
    {
    	double angle = gyro.getAngle();
    	SmartDashboard.putNumber("Gyro", angle);
    	double encoderRaw = encoder.getRaw();
    	SmartDashboard.putNumber("Encoder", encoderRaw);
    }
    
    
}

