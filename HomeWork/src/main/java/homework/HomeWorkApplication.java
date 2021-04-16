package homework;

import homework.adapter.class_a.Dog;
import homework.adapter.class_a.SwimingCat;
import homework.adapter.interface_a.Swimer;
import homework.bridge.class_b.BigCar;
import homework.bridge.class_b.DriverMiniCar;
import homework.bridge.class_b.MiniCar;
import homework.bridge.interface_b.Car;
import homework.bridge.interface_b.Driver;
import homework.composite.Btr;
import homework.composite.Fura;
import homework.composite.Garagh;
import homework.composite.Tractor;
import homework.decorator.class_d.Bmw;
import homework.decorator.class_d.Bmw_Fly;
import homework.decorator.class_d.Bmw_Swiming;
import homework.fasad.class_f.*;
import homework.proxy.class_p.Су_35;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkApplication {

    public static void main(String[] args) {

        //Патерн Адаптер
        {
            Dog sharik = new Dog("Шарик попыл");
            SwimingCat barsik = new SwimingCat("Барсик Поплыл");
            System.out.println(barsik.getSwim() + " " + barsik.voic());

            List<Swimer> swimerList = new ArrayList<>();
            swimerList.add(sharik);
            swimerList.add(barsik);
        }

        //Патерн Мост
        {
            Car car = new MiniCar();
            Car bigCar = new BigCar();
            car.motor(16);
            bigCar.motor(40);
            Driver driver = new DriverMiniCar(car);
            driver.toRun();
            driver.toBreake();
            driver = new DriverMiniCar(bigCar);
            driver.toRun();
            driver.toBreake();
        }

        //Патерн Компоновщик
        {
            Car btr = new Btr();
            Car fura = new Fura();
            Car tractor = new Tractor();
            Garagh garagh = new Garagh();

            garagh.addGaragToCar(btr);
            garagh.addGaragToCar(fura);
            garagh.addGaragToCar(tractor);
        }

        //Патерн Декоратор
        {
            homework.decorator.interface_d.Car car = new Bmw();
            car = new Bmw_Fly(car);
            car.run();
            car.breaks();
            car = new Bmw_Swiming(car);
            car.run();
            car.breaks();
        }
        // Патерн Фасад
        {
             Nozh nozh = new Nozh();
             Pasitizhi pasitizhi = new Pasitizhi();
             Pila pila = new Pila();
             Shilo shilo = new Shilo();

             SwidishNozh swidishNozh = new SwidishNozh(nozh, pasitizhi, pila, shilo);
             swidishNozh.goSwdishNozh();
        }
        //Патерн Proxy
        {
            Су_35 cy_35 = new Су_35();
            cy_35.up();
            cy_35.down();
            cy_35.left();
            cy_35.piupiu();
            cy_35.right();
        }
    }


}
