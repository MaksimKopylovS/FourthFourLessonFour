package homework.proxy.class_p;

import homework.proxy.interface_p.fly;

public class Cy_31 implements fly {

    @Override
    public void up() {
        System.out.println("Полёт вверх");
    }

    @Override
    public void down() {
        System.out.println("Полёт вниз");
    }

    public void left(){
        System.out.println("Полёт в лево");
    }
    public void right(){
        System.out.println("Полёт в право");
    }
}
