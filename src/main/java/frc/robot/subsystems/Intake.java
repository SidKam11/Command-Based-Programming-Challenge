// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
 
  /** Creates a new Intake. */
  
  private final CANSparkMax roller = new CANSparkMax(Constants.RollerPort, MotorType.kBrushless);

  public Intake() {
    roller.restoreFactoryDefaults();

    roller.setInverted(Constants.RollerInvert);

  }

  public void intake() {
    roller.set(Constants.IntakeSpeed);
  }

  public void outtake() {
    roller.set(Constants.OuttakeSpeed);
  }
  
  public void stop() {
    roller.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
