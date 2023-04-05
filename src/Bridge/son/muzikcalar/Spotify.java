package Bridge.son.muzikcalar;

import Bridge.son.Muzik;

public class Spotify implements MuzikCalar{

    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " şarkısını çalıyor");
        return muzik.getSes();
    }
}
