// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climber extends SubsystemBase {

  private final CANSparkMax climber = new CANSparkMax(Constants.ClimberPort, MotorType.kBrushless);

  /** Creates a new Climber. */
  public Climber() {
    climber.restoreFactoryDefaults();

    climber.setInverted(Constants.ClimberInvert);
  }

  public void liftClimber() {
    climber.set(Constants.liftClimberSpeed);
  }

  public void lowerClimber() {
    climber.set(Constants.lowerClimberSpeed);
  }

  public void stop() {
    climber.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
