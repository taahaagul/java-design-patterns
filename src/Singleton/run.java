package Singleton;

public class run {
    public static void main(String[] args) {

        Preferences instance = Preferences.getInstance();
        Preferences instance1 = Preferences.getInstance();
        Preferences instance2 = Preferences.getInstance();
        Preferences instance3 = Preferences.getInstance();
        Preferences instance4 = Preferences.getInstance();
        Preferences instance5 = Preferences.getInstance();
        Preferences instance6 = Preferences.getInstance();

        instance.helloSingleton();
        instance1.helloSingleton();
        instance2.helloSingleton();
        instance3.helloSingleton();
        instance4.helloSingleton();
        instance5.helloSingleton();
        instance6.helloSingleton();



    }
}
