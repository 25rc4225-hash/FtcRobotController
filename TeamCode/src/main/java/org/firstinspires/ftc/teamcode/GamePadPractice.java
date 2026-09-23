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
        telemetry.addData("a", gamepad1.a);
        telemetry.addData("b", gamepad1.b);
    }
}
