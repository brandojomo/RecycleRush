package org.usfirst.frc.team3946.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public interface RobotMap {
	
	// Speed Controllers
	int driveLeftTalon = 1;				//T1
	int driveRightTalon = 2;			//T2
	int driveStrafeTalon = 3;			//T3
	int liftTalon1 = 4;					//T4
	int liftTalon2 = 5;					//T5
	int t6 = 6;							//T6
	
	// Relays
	int spike1 = 1;					//SPK1
	int spike2 = 2;					//SPK2 +blue -common
	int spike3 = 3;					//SPK3 +red -green
	
	// Digital IOs
	int lCurbFeeler = 1;
	int rCurbFeeler = 2;
	int topLS = 3;
	int upperLS = 4;
	int bottomLS = 5;
	int lowerLS = 6;
	int cTouch = 7;
	int rTouch = 8;
	int lTouch = 9;
	
	// Analog IOs
	int driveGyro = 0;
	int liftPot = 1;				//POT
	int lRangeF = 2;				//RF1
	int rRangeF = 3;				//RF2
}
