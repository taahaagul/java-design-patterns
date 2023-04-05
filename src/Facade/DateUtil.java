package Facade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date getGununTarihi() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String dataStr = format.format(new Date());
        Date date = null;
        try {
            date = format.parse(dataStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    public static long gunFarkiHesapla(Date ilkTarih, Date sonTarih){
        long gunKatsayisi = 24 * 60 * 60 * 1000;

        long ilk = ilkTarih.getTime();
        long son = sonTarih.getTime();

        long gunFarki = (son / gunKatsayisi) - (ilk / gunKatsayisi);

        return gunFarki;
    }
}
