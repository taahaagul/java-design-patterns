package Visitor.saglikbakanligi;

public interface Visitor {
    String visitHastene(Hastane hastane);
    String visitIl(Il il);
    String visitUlke(Ulke ulke);
}
