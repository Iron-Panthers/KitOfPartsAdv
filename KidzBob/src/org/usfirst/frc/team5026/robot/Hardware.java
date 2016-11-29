package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TalonSRX;

public class Hardware {
	
	public TalonSRX leftDriveMotors;
	public TalonSRX rightDriveMotors;
	
	public DigitalInput driveSwitch;
	
	public Joystick roboJoystick;
	
	public Hardware() {
		leftDriveMotors = new TalonSRX(Constants.leftMotorPort);
		rightDriveMotors = new TalonSRX(Constants.rightMotorPort);
		
		roboJoystick = new Joystick(Constants.joystickPort);
		
		driveSwitch = new DigitalInput(Constants.limitSwitchChannel);
	}

}
