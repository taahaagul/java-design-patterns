package Interpreter;

public class App {
    public static void main(String[] args) {
        String kusSozu = "Sacadıcık Bahadır Memiş Cacık yedi ";
        KusDiliYorumlayici kusDiliYorumlayici = new KusDiliYorumlayici();
        String turkce = kusDiliYorumlayici.yorumla(kusSozu);
        System.out.println(turkce);
    }
}
