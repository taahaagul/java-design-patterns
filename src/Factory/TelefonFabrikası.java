package Factory;

public class TelefonFabrikası {

    public static ITelefon getTelefon(String model, String batarya, int en, int boy){
        ITelefon telefon;
        if("S8".equalsIgnoreCase(model)){
            return telefon = new S8(model, batarya, en, boy);
        }else if("Note8".equalsIgnoreCase(model))
            return telefon = new Note8(model, batarya, en, boy);
        else
            throw new RuntimeException("Bu modelin üretimi yapılmamaktadır. ");
    }
}
