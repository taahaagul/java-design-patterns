package Strategy;

public class App {
    public static void main(String[] args) {
        Ogrenci sayisalOgr = new Ogrenci(EnumBolum.SAYISAL);
        System.out.println(sayisalOgr.getOncelikSiralamasi());
    }
}
