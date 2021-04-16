package homework.bridge.class_b;

import homework.bridge.interface_b.Car;

public class MiniCar implements Car {

    private int motor;

    @Override
    public void gas() {
        System.out.println("MiniCar поехал");
    }

    @Override
    public void breaks() {
        System.out.println("MiniCar остановился");
    }

    @Override
    public int motor(int motor) {
        this.motor = motor;
        return motor;
    }

    @Override
    public int getMotor() {
        return motor;
    }


}
