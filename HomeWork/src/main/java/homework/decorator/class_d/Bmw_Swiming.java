package homework.decorator.class_d;

import homework.decorator.interface_d.Car;

public class Bmw_Swiming extends Bmw{

    public Bmw_Swiming(Car car){
        
    }

    @Override
    public void run() {
        super.run();
        swiming();
    }

    @Override
    public void breaks() {
        super.breaks();
    }

    public void swiming(){
        System.out.println("Машина поплыла");
    }
}
