package homework.adapter.class_a;

import homework.adapter.interface_a.Animal;
import homework.adapter.interface_a.Swimer;

public class Dog implements Animal, Swimer {
    private final String swim;

    public Dog(String swim) {
        this.swim = swim;
    }

    @Override
    public String getSwim() {
        return swim;
    }

    @Override
    public String voic() {
        return "WowWoW";
    }

    @Override
    public String run() {
        return "RunRun";
    }



}
