package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.ToggleBelt;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ConveyorBelt extends Subsystem {
    
	public Relay belt = new Relay(RobotMap.spike1);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ToggleBelt());
    }
    
    public void Start(){
    	belt.set(Relay.Value.kOn);
    }
   
    public void Stop(){
    	belt.set(Relay.Value.kOff);
    }
    
    public void Toggle(){
    	if (belt.get() == Relay.Value.kOn) {
    		Stop();
    	} else {
    		Start();
    	}
    }
}
