package Factory;

public class TelefonBayi {
    public static void main(String[] args) {
        ITelefon s8 = TelefonFabrikası.getTelefon("s8", "3000mah", 4, 6);
        ITelefon note8 = TelefonFabrikası.getTelefon("Note8", "4000mah", 5, 8);

        System.out.println(s8.toString());
        System.out.println(note8.toString());
    }
}
