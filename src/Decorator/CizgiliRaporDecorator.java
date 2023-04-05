package Decorator;

public class CizgiliRaporDecorator extends RaporDecorator {
    public CizgiliRaporDecorator(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();
        String cizgiliMetin = RaportUtil.getCizgiliMetin(metin);

        return cizgiliMetin;
    }
}
