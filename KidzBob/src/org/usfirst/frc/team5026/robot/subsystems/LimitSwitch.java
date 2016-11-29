package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Hardware;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LimitSwitch extends Subsystem {
	
	public boolean toggled;
	private Hardware hardware;
	
	public LimitSwitch() {	
		hardware = Robot.hardware;
		toggled = true;
	}

	@Override
	protected void initDefaultCommand() {}
	
	
	public boolean getPressed() {
		return hardware.driveSwitch.get();
	}
	
	
	
	

}
