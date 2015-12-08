package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.TogglePickupMotors;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PickupMotors extends Subsystem {
    
    // Put methods for controlling this subsystem
    Talon pickUpMotor = new Talon(RobotMap.pickUpMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TogglePickupMotors());
    }
    public void Start() {
    	pickUpMotor.set(.5);
    }
    public void Stop() {
    	pickUpMotor.set(0);
    }
    public void Toggle() {
    	if (pickUpMotor.get() > 0) {
    		Stop();
    	}
    	else {
    		Start();
    	}
    }
}

