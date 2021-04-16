package homework.composite;

import homework.bridge.interface_b.Car;

import java.util.ArrayList;
import java.util.List;

public class Garagh {
    private List<Car> carList;

    public Garagh(){
        carList = new ArrayList<>();
    }

    public void addGaragToCar(Car car){
        carList.add(car);
    }
    public void delGaraghToGaragh(Car car){
        carList.remove(car);
    }
}
