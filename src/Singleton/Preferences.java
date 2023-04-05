package Singleton;

public class Preferences {
    private static Preferences instance = null;

    private Preferences() {
        System.out.println("I'm created");
    }

    private synchronized static void createInstance(){
        if(instance == null){
            instance = new Preferences();
        }
    }

    public static Preferences getInstance(){
        if(instance == null)
            createInstance();
        return instance;
    }

    public void helloSingleton(){
        System.out.println("Hello I'm a singleton");
    }
}
