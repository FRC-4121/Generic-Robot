/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ChangeTeleopSpeed;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	//Define joystick objects and joystick button functions
	public Joystick leftJoy, rightJoy;
	public Button changeDriveSpeed;

	public OI() {

		//Joystick Configuration

		//Create new joystick objects
		leftJoy = new Joystick(0); //Only needed for WCD
		rightJoy = new Joystick(1);

		/* Joystick Button Layout
		 * 1: Trigger
		 * 2: Side Button
		 * 3-6: Buttons on Joystick
		 * 7-12: Keypad on Base
		 */

		//Initialize Joystick buttons
		changeDriveSpeed = new JoystickButton(rightJoy, 2);

		//Configure Joystick button commands
		changeDriveSpeed.whenPressed(new ChangeTeleopSpeed());
	
	}
  
}
