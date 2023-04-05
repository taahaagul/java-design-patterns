package Interpreter;

public class KusDili {

    private EnumDil dil;

    public KusDili(){
        dil = EnumDil.KUS;
    }
    public String turkceyeCevir(String soz) {
        String[] kelimeler = soz.split(" ");
        String turkce = "";

        for(String kelime : kelimeler){
            String turkceKelime = kelimeyiTurkceyeCevir(kelime);
            turkce = turkce + " " + turkceKelime;
        }
        return turkce;
    }

    private String kelimeyiTurkceyeCevir(String kelime) {
        String kelimeAyarlayici = kelime;
        String heceleri = hecele(kelimeAyarlayici);
        String[] heceList = heceleri.split("-");
        String kelimeninTurkcesi = hecelrdenKelimeBul(heceList);
        return kelimeninTurkcesi;
    }

    private String hecelrdenKelimeBul(String[] heceList) {
        int i = 0;
        String turkceKelime = "";
        for(String hece : heceList){
            if(i % 2 == 0){
                turkceKelime = turkceKelime + hece;
            }
            i++;
        }
        return turkceKelime;
    }

    private String hecele(String kelimeAyarlayici) {

        String hecelenmisHali = "";
        while (kelimeAyarlayici.length() > 0){
            String hece = getHece(kelimeAyarlayici);
            hecelenmisHali = hecelenmisHali + hece + "-";
            kelimeAyarlayici = kelimeAyarlayici.replaceFirst(hece, "");
        }
        return hecelenmisHali;
    }

    private String getHece(String kelime) {
        int boyut = dil.getEk().length() ;
        if(kelime.length() < 2){
            boyut = kelime.length();
        }
        String substring = kelime.substring(0, boyut);
        return substring;
    }
}
