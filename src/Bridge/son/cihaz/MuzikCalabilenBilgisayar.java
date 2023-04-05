package Bridge.son.cihaz;

import Bridge.son.Muzik;
import Bridge.son.muzikcalar.MuzikCalar;
import Bridge.son.sescihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {
    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    public void muzikCal(Muzik muzik){
        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
