package State;

public class Oyun {

    private Konsol konsol;

    public Oyun() {
        System.out.println("Oyun Basladi");
        konsol = new Hucum();
    }

    public void ucgen(){
        konsol.ucgenBas();
    }
    public void kare(){
        konsol.kareBas();
    }
    public void yuvarlak(){
        konsol.yuvarlakBas();
    }
    public void xBas(){
        konsol.xBas();
    }
    public void topuKap(){
        System.out.println("Top Kapıldı. Hücüma çıkılıyor..");
        konsol = new Hucum();
    }
    public void topuKaptir(){
        System.out.println("Top kaptirildi. Allahini seven defansa gelsin");
        konsol = new Defans();
    }
}
