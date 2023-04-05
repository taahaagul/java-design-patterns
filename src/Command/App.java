package Command;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);
        BigDecimal sonuc = HesapMakinesi.islem(new ToplamaCommand(), sayi1, sayi2);
        System.out.println(sonuc);
    }
}
