package Command;

import java.math.BigDecimal;

public class HesapMakinesi {

    public static BigDecimal islem(Islem islem, BigDecimal sayi1, BigDecimal sayi2){
        BigDecimal sonuc = islem.islem(sayi1, sayi2);
        return sonuc;
    }
}
