package Bridge.son.cihaz;

import Bridge.son.Muzik;
import Bridge.son.muzikcalar.MuzikCalar;
import Bridge.son.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar{
    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar){
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor.. ");
        super.muzikCal(muzik);
    }
}
