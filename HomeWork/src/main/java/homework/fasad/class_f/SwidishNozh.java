package homework.fasad.class_f;

public class SwidishNozh {
    private Nozh nozh;
    private Pasitizhi pasitizhi;
    private Pila pila;
    private Shilo shilo;

    public SwidishNozh(Nozh nozh, Pasitizhi pasitizhi, Pila pila, Shilo shilo){
        this.nozh = nozh;
        this.pasitizhi = pasitizhi;
        this.pila = pila;
        this.shilo = shilo;
    }

    public void goSwdishNozh(){
        nozh.goNozh();
        pasitizhi.goPasitizhi();
        pila.goPila();
        shilo.goShilo();
    }
}
