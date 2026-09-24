package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop() {
        telemetry.addData("Lx", gamepad1.left_stick_x);
        telemetry.addData("Ly", -gamepad1.left_stick_y);
        telemetry.addData("Rx", gamepad1.right_stick_x);
        telemetry.addData("Ry", -gamepad1.right_stick_y);
        telemetry.addData("X", gamepad1.a);
        telemetry.addData("[]", gamepad1.b);
        telemetry.addData("Square", gamepad1.circle);
        telemetry.addData("Triangle", gamepad1.cross);
    }
}
