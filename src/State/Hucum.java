package State;

public class Hucum implements Konsol {
    @Override
    public void kareBas() {
        System.out.println("Şut çekiyor");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Ara pas veriliyor");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Orta açıyor");
    }

    @Override
    public void xBas() {
        System.out.println("Pas veriyor");
    }
}
