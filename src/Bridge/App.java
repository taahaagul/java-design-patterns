package Bridge;

import Bridge.son.Muzik;
import Bridge.son.cihaz.BilgisayarKF;
import Bridge.son.cihaz.Telefon;
import Bridge.son.muzikcalar.Fizy;
import Bridge.son.muzikcalar.Spotify;
import Bridge.son.sescihazi.Kulaklik;

public class App {

    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - gülümse " , "ZzzzzZZzZZzzZZZzZ");
        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("*****************************");

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("*****************************");

        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(muzik);
    }
}
