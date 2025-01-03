package org.tahomarobotics.robot;

import edu.wpi.first.math.geometry.Translation2d;

import static org.tahomarobotics.robot.chassis.ChassisConstants.*;

public final class RobotMap {
        public final static int PIGEON = 0;

        public final static SwerveModuleDescriptor FRONT_LEFT_MOD = new SwerveModuleDescriptor(
                "Front Left", FRONT_LEFT_OFFSET, 1, 11, 21);
        public final static SwerveModuleDescriptor FRONT_RIGHT_MOD = new SwerveModuleDescriptor(
                "Front Right", FRONT_RIGHT_OFFSET, 2, 12, 22);
        public final static SwerveModuleDescriptor BACK_LEFT_MOD = new SwerveModuleDescriptor(
                "Back Left", BACK_LEFT_OFFSET, 3, 13, 23);
        public final static SwerveModuleDescriptor BACK_RIGHT_MOD = new SwerveModuleDescriptor(
                "Back Right", BACK_RIGHT_OFFSET, 4, 14, 24);

        public static final int ELEVATOR_RIGHT_MOTOR = 5;
        public static final int ELEVATOR_LEFT_MOTOR = 6;

        public static final int MECHANISM_MOTOR_1 = 7;
        public static final int MECHANISM_MOTOR_2 = 8;

        public record SwerveModuleDescriptor(String moduleName, Translation2d offset, int driveId, int steerId, int encoderId) { }
}
