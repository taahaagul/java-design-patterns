package Facade.Gecikme;

import Facade.DateUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class GecikmeZammiHesaplamaService {

    private GecikmeZammiOraniEnityService gecikmeZammiOraniEnityService;

    public GecikmeZammiHesaplamaService(){
        gecikmeZammiOraniEnityService = new GecikmeZammiOraniEnityService();
    }


    public BigDecimal gecikmeZammiHesapla(BigDecimal tutar, Date vadeTarihi){
        BigDecimal gecikmeZammi = BigDecimal.ZERO;
        if(vadeTarihi.compareTo(new Date()) > 0){
            return gecikmeZammi;
        }
        
        gecikmeZammi = gecikmeZamminiHesapla(tutar, vadeTarihi);
        return gecikmeZammi;
    }

    private BigDecimal gecikmeZamminiHesapla(BigDecimal tutar, Date vadeTarihi) {
        BigDecimal gecikmeZammiOrani = gecikmeZammiOraniEnityService.getGecikmeZammiOrani();
        Date gununTarihi = DateUtil.getGununTarihi();
        long gunFarkiL = DateUtil.gunFarkiHesapla(vadeTarihi, gununTarihi);

        BigDecimal gunFarki = BigDecimal.valueOf(gunFarkiL);
        BigDecimal gecikmeZammi = gecikmeZammiOrani.multiply(gunFarki).multiply(tutar);
        gecikmeZammi = gecikmeZammi.setScale(2, RoundingMode.HALF_DOWN);

        if(gecikmeZammi.compareTo(BigDecimal.ZERO) > 0){
            System.out.println("Bilgi : Gecikme zammi hesaplandi");
            System.out.println("Gecikme Zammi : " + gecikmeZammi);
        }
        return gecikmeZammi;
    }
}
