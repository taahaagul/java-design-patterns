package Decorator;

import java.util.ArrayList;
import java.util.List;

public class RaportUtil {
    public static String getCizgiliMetin(String metin) {
        String[] satirList = metin.split("\n");
        String cizgiliMetin = "";
        
        for(String eachSatir : satirList){
            String cizgiliSatir = herSatiraBirCizgiEkle(eachSatir);
            cizgiliMetin = cizgiliMetin + cizgiliSatir;
        }
        return cizgiliMetin;
    }

    private static String herSatiraBirCizgiEkle(String eachSatir) {
        String yeniSatir;
        if(eachSatir.trim().length() == 0){
            yeniSatir = "\n";
        }else{
            yeniSatir = "\n- " + eachSatir;
        }
        return yeniSatir;
    }

    public static String metniSigdir(String metin, int genislik) {
        String kucukSatirMetin = "";
        String[] satirList = metin.split("\n");

        for(String eachSatir : satirList){
            if(eachSatir.length() <= genislik){
                //Aynen Ekle
                kucukSatirMetin = ekleVeYeniSatiraGec(kucukSatirMetin, eachSatir);
            }
            else{
                //Küçült ve Öyle Ekle

                List<String> parcalanmisList = parcala(eachSatir, genislik);
                for(String eachYeniSatir : parcalanmisList){
                    kucukSatirMetin = ekleVeYeniSatiraGec(kucukSatirMetin, eachYeniSatir);
                }
            }
        }
        return kucukSatirMetin;
    }

    private static List<String> parcala(String eachSatir, int genislik) {
        List<String> parcaliSatirList = new ArrayList<>();
        for (int i = 0; i <= eachSatir.length() / 30; i++){
            int ilkHane = genislik + i;
            int sonHane = ilkHane + genislik;

            if(sonHane > eachSatir.length())
                sonHane = eachSatir.length();

            String parcaliSatir = eachSatir.substring(ilkHane, sonHane);

            if(parcaliSatir.trim().length() > 0)
                parcaliSatirList.add(parcaliSatir);

        }
        return parcaliSatirList;
    }

    private static String ekleVeYeniSatiraGec(String anaMetin, String eklenecekMetin) {
        return anaMetin + eklenecekMetin + "\n";
    }

    public static String sonaImzaliMetinEkle(String metin) {
        String imza = "\n\n + \t\t\t\t\t\t imza : ";
        return metin + imza;
    }
}
