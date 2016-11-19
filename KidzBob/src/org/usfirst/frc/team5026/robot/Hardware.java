package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.TalonSRX;

public class Hardware {
	
	public TalonSRX leftDriveMotors;
	public TalonSRX rightDriveMotors;
	
	public Hardware() {
		leftDriveMotors = new TalonSRX(9797);
		rightDriveMotors = new TalonSRX(3652);
	}

}
