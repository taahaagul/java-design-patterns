package Bridge.ilk;

public class Spotify {

    public String muzikCal(Muzik muzik){
        System.out.println("Spotify " + muzik + " şarkısını çalıyor. ");
        return muzik.getSes();
    }
}
