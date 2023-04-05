package AbstractFactory;

public class TelefonBayisi {
    public static void main(String[] args) {
        S8Fabrikası s8Fabrikası = new S8Fabrikası();
        ITelefon s8 = s8Fabrikası.getTelefon("s8", "3000mah", 5, 7);

        Note8Fabrikası note8Fabrikası = new Note8Fabrikası();
        ITelefon note8 = note8Fabrikası.getTelefon("Note8", "4000mah", 6, 9);

        System.out.println(s8);
        System.out.println(note8);
    }
}
