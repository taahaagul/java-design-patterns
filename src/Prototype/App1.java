package Prototype;

import java.util.Date;

public class App1 {
    public static void main(String[] args) {
        GenelEnityService genelEnityService = new GenelEnityService();

        Date ilkTarih = new Date();
        Belge belge1 = genelEnityService.findBelgeById(1L);
        Belge belgeClone = null;
        try {
            belgeClone = belge1.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Date sonTarih = new Date();

        belgeClone.setAdi("Günlük");
        belgeClone.setVeri("Sevgili Günlük");
        belgeClone.getBelgeTuru().setAdi("Kişisel 2");

        long saniyeFarki = (sonTarih.getTime() / 1000) - (ilkTarih.getTime() / 1000);
        System.out.println("Geçen süre : " + saniyeFarki);
        System.out.println(belge1);
        System.out.println(belgeClone);
    }
}
