package Visitor;

import Visitor.islemler.CovidHastaSayisiVisitor;
import Visitor.saglikbakanligi.*;

public class App {

    public static void main(String[] args) {
        Hasta hasta = new Hasta("Ahmeet", EnumHastalik.COVID, EnumHastaDurumu.AGIRHASTA);
        Hasta hasta1 = new Hasta("Mehmet", EnumHastalik.COVID, EnumHastaDurumu.AGIRHASTA);
        Hasta hasta2 = new Hasta("Veli", EnumHastalik.COVID, EnumHastaDurumu.AGIRHASTA);
        Hasta hasta3 = new Hasta("Ayse", EnumHastalik.COVID, EnumHastaDurumu.AGIRHASTA);

        Hastane capa = new Hastane("Çapa");
        capa.hastaEkle(hasta);
        capa.hastaEkle(hasta1);
        capa.hastaEkle(hasta2);
        capa.hastaEkle(hasta3);

        Il istanbul = new Il("İstnabul");
        istanbul.hastaneEkle(capa);

        Ulke turkiye = new Ulke("Türkiye");
        turkiye.ilEkle(istanbul);

        raporUlke(turkiye);
    }

    private static void raporUlke(Ulke ulke) {
        CovidHastaSayisiVisitor hastaSayisiVisitor = new CovidHastaSayisiVisitor();
        String hastaSayisi = hastaSayisiVisitor.visitUlke(ulke);

        System.out.println("Hasta sayisi : " + hastaSayisi);

    }
}
