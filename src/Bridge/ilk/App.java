package Bridge.ilk;

public class App {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - gülümse", " zZz zZz zZzz  zZzzZzzz");
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.muzikCal(muzik);
    }
}
