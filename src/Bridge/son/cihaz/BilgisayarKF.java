package Bridge.son.cihaz;

import Bridge.son.Muzik;
import Bridge.son.muzikcalar.Fizy;
import Bridge.son.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar{
    public BilgisayarKF() {
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar calisti. ");
        super.muzikCal(muzik);
    }
}
