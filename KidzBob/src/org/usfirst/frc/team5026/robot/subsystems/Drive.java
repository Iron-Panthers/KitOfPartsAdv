package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Hardware;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
	
	private Hardware hardware;
	private RobotDrive drive;
	
	public Drive() {
		hardware = Robot.hardware;
		drive = new RobotDrive(hardware.leftDriveMotors, hardware.rightDriveMotors);
	}

	@Override
	protected void initDefaultCommand() {
		hardware.leftDriveMotors.set(0);
		hardware.rightDriveMotors.set(0);
	}
	
	public void setMotors(int speed) {
		hardware.leftDriveMotors.set(speed);
		hardware.rightDriveMotors.set(speed);
	}
	
	public void driveWithJoystick() {
		drive.arcadeDrive(hardware.roboJoystick);
	}
	
	public void stopMotors() {
		hardware.leftDriveMotors.set(0);
		hardware.rightDriveMotors.set(0);
	}

}
