package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveRobotWithJoystick extends Command {
	
	
	public DriveRobotWithJoystick() {
		requires(Robot.robotDrive);
		requires(Robot.driveSwitch);
	}

	@Override
	protected void initialize() {
		Robot.robotDrive.stopMotors();
	}

	@Override
	protected void execute() {
		int passingValue = 6;
		int numberOfTrues = 0;
		if(Robot.driveSwitch.getPressed()) {
			numberOfTrues += 1;
		} else {
			numberOfTrues = 0;
		}
		if(numberOfTrues == passingValue) {
			if(Robot.driveSwitch.toggled) {
				Robot.driveSwitch.toggled = false;
			} else {
				Robot.driveSwitch.toggled = true;
			}
		}
		if(Robot.driveSwitch.toggled) {
			Robot.robotDrive.driveWithJoystick();
		}
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.robotDrive.stopMotors();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
