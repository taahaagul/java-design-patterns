package ChainOfResponsibility;

public class App {

    public static void main(String[] args) {
        KargoSirketi sbmKargo = SbmKargo.getKargoSirketi();
        sbmKargo.kargola(EnumIl.KARS);
    }
}
