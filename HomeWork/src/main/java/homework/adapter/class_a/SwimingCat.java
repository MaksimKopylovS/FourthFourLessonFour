package homework.adapter.class_a;

import homework.adapter.interface_a.Swimer;

public class SwimingCat extends Cat implements Swimer {


    public SwimingCat(String swim) {
        super(swim);
    }

    @Override
    public String getSwim(){
        return super.getSwim() + " Кот плывёт";
    }

    @Override
    public String voic() {
        return "MeuMeu";
    }
}
