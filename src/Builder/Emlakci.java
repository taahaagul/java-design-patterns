package Builder;

public class Emlakci {
    public static void main(String[] args) {
        Ev ev1 = new Ev();
        ev1.setIl("İstanbul");
        ev1.setIlce("Ataşehir");
        ev1.setMahalle("Atatürk");
        ev1.setOdaSayisi(3);
        ev1.setBinaYili(2010);
        ev1.setHasKlima(true);

        printEv(ev1);
    }

    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi -->" + ev);
    }
}
