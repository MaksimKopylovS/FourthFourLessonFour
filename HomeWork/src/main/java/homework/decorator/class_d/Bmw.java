package homework.decorator.class_d;

import homework.decorator.interface_d.Car;

public class Bmw implements Car {
       private String madeIn;

    @Override
    public void run() {
        System.out.println("Поехали");
    }

    @Override
    public void breaks() {
        System.out.println("Останавились");
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
