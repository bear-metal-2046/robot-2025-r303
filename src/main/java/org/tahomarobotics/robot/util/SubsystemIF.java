package org.tahomarobotics.robot.util;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class SubsystemIF extends SubsystemBase {
    public SubsystemIF initialize() { return this; }
    public void onDisabledInit() {}
    public void onAutonomousInit() {}
    public void onTeleopInit() {}

    public abstract double getEnergyUsed();

    public abstract double getTotalCurrent();
}