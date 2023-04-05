package Observer;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);
        BigDecimal anlikSicaklik = BigDecimal.valueOf(22);

        Termometre termometre = new Termometre(minSicaklik, maxSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        termometre.ekle(anne);
        termometre.ekle(baba);

        termometre.setAnlikSicaklik(anlikSicaklik);

    }
}
