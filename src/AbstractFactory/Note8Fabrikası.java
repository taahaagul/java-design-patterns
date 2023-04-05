package AbstractFactory;

public class Note8Fabrikası  implements TelefonFactory{
    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model, batarya, en, boy);
    }
}
