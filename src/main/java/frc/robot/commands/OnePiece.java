package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANRollerSubsystem;

public class OnePiece extends SequentialCommandGroup { 
    public OnePiece(CANDriveSubsystem drivebase, CANRollerSubsystem effector){
        addCommands(
            new RunCommand(()->drivebase.driveArcade(0.4, 0), drivebase).withTimeout(4),
            new RunCommand(()->effector.runRoller(0.5, 0), effector).withTimeout(2)
        );
    }
}
