package homework.bridge.class_b;

import homework.bridge.interface_b.Car;

public class BigCar implements Car {

    private int motor;

    @Override
    public void gas() {
        System.out.println("BigCar поехал");
    }

    @Override
    public void breaks() {
        System.out.println("BigCar остановился");
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
