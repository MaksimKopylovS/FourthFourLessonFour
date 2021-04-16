package homework.decorator.class_d;

import homework.decorator.interface_d.Car;

public class Bmw_M implements Car {
    private Car car;

    protected Bmw_M(Car car){
        this.car = car;
    }


    @Override
    public void run() {
        car.run();
    }

    @Override
    public void breaks() {
        car.breaks();
    }
}
