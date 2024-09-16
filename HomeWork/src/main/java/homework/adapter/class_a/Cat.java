package homework.adapter.class_a;

import homework.adapter.interface_a.Animal;

public class Cat implements Animal {
    private final String swim;

    public String getSwim(){
        return swim;
    }

    public Cat(String swim) {
        this.swim = swim;
    }

    @Override
    public String voic() {
        return "MeyMey";
    }

    @Override
    public String run() {
        return "Jump Jump";
    }
}
