package homework.decorator.class_d;

import homework.decorator.interface_d.Car;

import java.util.Calendar;

public class Bmw_Fly extends Bmw {
    Car car;

    public Bmw_Fly(Car car){
        this.car = car;
    }

    @Override
    public void run() {
        car.run();
        fly();
    }

    @Override
    public void breaks() {
        car.breaks();
    }

    public void fly(){
        System.out.println("Машина летит");
    }
}
