package Decorator;

public class ImzaliRaporDecoratorI extends RaporDecorator {
    public ImzaliRaporDecoratorI(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();
        String imzaliMetin = RaportUtil.sonaImzaliMetinEkle(metin);
        return imzaliMetin;
    }
}
