package homework.proxy.class_p;


import homework.proxy.interface_p.fly;

public class Су_35 implements fly {
    private Cy_31 cy_31;

    private void lazyInitCy_31(){
        if(cy_31 == null){
            cy_31 = new Cy_31();
        }
    }

    @Override
    public void up() {
        lazyInitCy_31();
        cy_31.up();
    }

    @Override
    public void down() {
        lazyInitCy_31();
        cy_31.down();
    }

    public void left(){
        lazyInitCy_31();
        cy_31.right();
    }
    public void right(){
        lazyInitCy_31();
        cy_31.right();
    }

    public void piupiu(){
        System.out.println("Ракета пошла");
    }
}
