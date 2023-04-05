package Strategy;

public class Ogrenci {
    private EnumBolum bolum;
    private SinavStratejisi sinavStratejisi;

    public Ogrenci(EnumBolum bolum) {
        this.bolum = bolum;

        if(bolum == null){
            throw new NullPointerException("Bölüm boş olamaz!");
        }

        switch (bolum){
            case SOZEL:
                sinavStratejisi = new SozelStratejisi();
                break;
            case SAYISAL:
                sinavStratejisi = new SayisalStratejisi();
                break;
            case ESITAGIRLIK:
                sinavStratejisi = new EsitAgirlikStratejisi();
                break;
            default:
                break;
        }
    }

    public String getOncelikSiralamasi(){
        System.out.println(bolum + " için strateji : ");

        String siralama = "Önce " + sinavStratejisi.getBirinci() + " çöz. \n" +
                "Sonra " + sinavStratejisi.getIkinci() + " çöz. \n" +
                "Daha Sonra " + sinavStratejisi.getUcuncu() + " çöz \n" +
                "En son " + sinavStratejisi.getDorduncu() + " çöz";

        return siralama;
    }

}
