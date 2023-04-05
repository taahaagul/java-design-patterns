package State;

public class App {
    public static void main(String[] args) {
        Oyun oyun = new Oyun();

        oyun.xBas();
        oyun.ucgen();
        oyun.kare();

        oyun.topuKaptir();

        oyun.xBas();
        oyun.kare();
        oyun.topuKap();
    }
}
