/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team63.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Talon CAN IDs
	public static final int DRIVELEFTMASTER = 3;
	public static final int DRIVELEFTSLAVE = 4;
	public static final int DRIVERIGHTMASTER = 1;
	public static final int DRIVERIGHTSLAVE = 2;	
	public static final int LIFT = 5;
	
	//Spark PWM Channels
	public static final int CLAWLEFT = 6;
	public static final int CLAWRIGHT = 7;
	public static final int CLIMBWINCH = 8;
	
	//Solenoid Mappings
	public static final int PCM1_CANID = 6;
	public static final int CLIMBARM_UP = 1;
	public static final int CLIMBARM_DOWN = 3;
	public static final int CLIMBCLAMPLOCK_OPEN = 6;
	public static final int CLIMBCLAMPLOCK_CLOSE = 7;
	public static final int CLAW_CLOSE_SOLENOID = 2;
	public static final int CLAW_OPEN_SOLENOID = 0;
	public static final int SHIFTER_HIGH = 4;
	public static final int SHIFTER_LOW = 5;
	
	//Claw
	public static final double BOX_IN_SPEED = -0.4;
	public static final double BOX_OUT_SPEED = 0.4;
	public static final int INFRARED_SENSOR_CHANNEL = 0;
	
	//Climb
	public static final double CLIMB_UP_SPEED = -1.0;
	public static final double CLIMB_DOWN_SPEED = 1.0;
	
    //Drive constants
	private static final double DRIVE_WHEEL_DIAMETER = 6;
	public static final double DRIVE_WHEEL_CIRCUMFERENCE = DRIVE_WHEEL_DIAMETER*Math.PI; //inches
	public static final double DRIVE_TRACK = 25; //inches between centerlines of left and right wheels
	public static final double DRIVE_ENCODER_PPR = 4096; //native units per rotation
	public static final int TIMOUT_MS = 10; //ms to wait for talon timeout, literally doesn't matter
	public static final int VELOCITY_CONTROL_SLOT = 0;
	public static final double DRIVE_F = 0.5683;
	public static final double DRIVE_P = 0.5;
	public static final double DRIVE_I = 0.003;
	public static final double DRIVE_D = 35.0;
	public static final int DRIVE_IZONE = 200;
	public static final int DRIVE_CRUISE = 1600;
	public static final int DRIVE_ACCEL = 1600;
	public static final int DRIVE_RIZONE = 200;
	public static final int DRIVE_RCRUISE = 800;
	public static final int DRIVE_RACCEL = 1600;
	public static final double OFF_BALANCE_THRESHOLD_DEGREES = 20;
	public static final double On_BALANCE_THRESHOLD_DEGREES = 10;
	
	//Lift constantsrs1
	public static final double LIFT_INCHES_PER_UNIT = 0.000033;
//	public static final double MAX_LIFT_DISPLACEMENT_INCHES = 79; //6969
	//public static final int MAX_LIFT_DISPLACEMENT_UNITS = (int)(MAX_LIFT_DISPLACEMENT_INCHES / LIFT_INCHES_PER_UNIT);
	public static final double BOX_HEIGHT_INCHES = 11;
	public static final double MAX_LIFT_ADJUST_SPEED = 10; //inches per second
	   
    //Vision
    public static final double POWER = -1.07436389463682;
    public static final double XCOEFF = 11834.7562904465;
    public static final double intercept = -4.40793976463289;
    
    //Digital Inputs
    public static final int AUTO_SWITCH_1 = 0;
	public static final int AUTO_SWITCH_2 = 1;
	public static final int AUTO_SWITCH_3 = 2;
	public static final int LIMIT_SWITCH_HOOK = 4;
	public static final int LIMIT_SWITCH_LIFT = 3;
}
