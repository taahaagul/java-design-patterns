package AbstractFactory;

public class S8Fabrikası implements TelefonFactory {
    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
         return new S8(model, batarya, en, boy);
    }
}
