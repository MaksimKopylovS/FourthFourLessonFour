package homework.proxy.class_p;

import homework.proxy.interface_p.fly;

public class BalloonFly implements fly {
    @Override
    public void up() {
        System.out.println("Полёт вверх");
    }

    @Override
    public void down() {
        System.out.println("Пспуск вниз");
    }
}
