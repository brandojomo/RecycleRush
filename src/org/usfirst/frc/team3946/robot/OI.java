package org.usfirst.frc.team3946.robot;

import libraries.XboxController;

import org.usfirst.frc.team3946.robot.commands.DriveToCrate;
import org.usfirst.frc.team3946.robot.commands.BoxPiston;
import org.usfirst.frc.team3946.robot.commands.drive.*;
import org.usfirst.frc.team3946.robot.commands.lift.*;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public XboxController driveController = new XboxController(0);
	public XboxController liftController = new XboxController(1);
		
    public OI() {
   		driveController.setDeadband(0.2);
   		liftController.setDeadband(0.2);
    	
    	// Drive Control Buttons
    	Button slowGear = new JoystickButton(driveController, XboxController.LeftBumper);
	    	slowGear.whenPressed(new SlowGear());
    	
    	// Lift Control Buttons
	    Button lowerLift = new JoystickButton(driveController, XboxController.LeftTrigger);
	    Button raiseLift = new JoystickButton(driveController, XboxController.RightTrigger);
	    Button switchOverride = new JoystickButton(driveController, XboxController.RightBumper);
			lowerLift.whileActive(new ElevateWithTriggers());                      
			raiseLift.whileActive(new ElevateWithTriggers());
			switchOverride.whenPressed(new SwitchOverride());
		
		// Wing Control Buttons
			
		// Autonomous Buttons
	    Button driveToCrate = new JoystickButton(driveController, XboxController.A);
	    	driveToCrate.whileHeld(new DriveToCrate());
	    Button solenoid = new JoystickButton(driveController, XboxController.X);
	    	solenoid.whileHeld(new BoxPiston());
//	    Button alignToStack = new JoystickButton(driveController, XboxController.Y);
//	    	alignToStack.whenPressed(new AlignToStack());
			
        // SmartDashboard Buttons			
        SmartDashboard.putData("Enable Slide", new SlideDrivingCommand());
        SmartDashboard.putData("Enable Arcade", new ArcadeDrivingCommand());
    }
    
    public XboxController getDriveController() {
    	return driveController;
    }
    
    public XboxController getLiftController() {
    	return liftController;
    }
}