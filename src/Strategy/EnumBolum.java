package Strategy;

public enum EnumBolum {
    SOZEL("Sözel"),
    SAYISAL("Sayisal"),
    ESITAGIRLIK("Esit Agirlik");
    private String bolum;

    EnumBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return bolum;
    }
}
