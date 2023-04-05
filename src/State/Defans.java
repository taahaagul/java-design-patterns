package State;

public class Defans implements Konsol {
    @Override
    public void kareBas() {
        System.out.println("Müdahele ediliyor");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Kaleci açılıyor");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Kayarak müdahele ediliyor");
    }

    @Override
    public void xBas() {
        System.out.println("Press yapılır");
    }
}
