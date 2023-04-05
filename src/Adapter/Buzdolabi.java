package Adapter;

public class Buzdolabi implements ElektrikliEvAletleri{

    private int volt;

    public Buzdolabi(){
        this.volt = 220;
    }
    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Buzdolabi calisiyor..");
        return volt;
    }

}
