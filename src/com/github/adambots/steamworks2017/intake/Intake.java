package com.github.adambots.steamworks2017.intake;

import org.usfirst.frc.team245.robot.Actuators;
import org.usfirst.frc.team245.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Intake {
	public static double SPEED = 0.8;
	
	/*
	 * Runs intakeMotor
	 * @param intakeButon
	 * */
	public static void intake(boolean intakeButton){
		if (intakeButton){
			Actuators.getIntakeMotor().set(SPEED);
		} else {
			Actuators.getIntakeMotor().set(Constants.MOTOR_STOP);
		}
	}
}