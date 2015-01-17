package org.usfirst.frc.team3946.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3946.robot.Robot;

/**
 *
 */
public class  DriveWithJoystick extends Command {

    public DriveWithJoystick() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(Robot.oi.getXboxController());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; // Runs until interrupted
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}