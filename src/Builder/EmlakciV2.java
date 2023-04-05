package Builder;

public class EmlakciV2 {
    public static void main(String[] args) {
        Ev ev1 = EvBuilder.startBuild("İstanbul", "Ümraniye", "Tatlısu", 2008)
                .setOdaSayisi(3)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .build();

        printEv(ev1);
    }

    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi -->" + ev);
        System.out.println();
    }
}
