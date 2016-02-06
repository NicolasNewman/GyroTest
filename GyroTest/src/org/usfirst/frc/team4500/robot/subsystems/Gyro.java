package org.usfirst.frc.team4500.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.ADXRS450_Gyro; 



/**
 *
 */
public class Gyro extends Subsystem {
	
	ADXRS450_Gyro gyro;
	
	
	double Kp = 0.03;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	gyro = new ADXRS450_Gyro();
    	double angle = gyro.getAngle();
    	
    	while(true){
    	System.out.println(angle);
    	}
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void gyroMethod()
    {
            // Gyro on Analog Channel 1
    }
    
    
}

