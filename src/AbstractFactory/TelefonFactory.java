package AbstractFactory;

public interface TelefonFactory {
    ITelefon getTelefon(String model, String batarya, int en, int boy);
}
