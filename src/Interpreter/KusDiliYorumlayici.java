package Interpreter;

public class KusDiliYorumlayici implements Yorumlayici {
    @Override
    public String yorumla(String soz) {
        KusDili kusDili = new KusDili();
        String turkce = kusDili.turkceyeCevir(soz);
        return turkce;
    }
}
