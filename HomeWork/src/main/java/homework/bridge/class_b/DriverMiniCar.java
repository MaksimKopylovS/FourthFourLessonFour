package homework.bridge.class_b;

import homework.bridge.interface_b.Car;
import homework.bridge.interface_b.Driver;

public class DriverMiniCar implements Driver {
    private Car car;

    public DriverMiniCar(Car car){
        this.car = car;
    }

    @Override
    public void toRun() {
        car.gas();
    }

    @Override
    public void toBreake() {
        car.breaks();
    }

    @Override
    public int getMotor() {
        return car.getMotor();
    }
}
