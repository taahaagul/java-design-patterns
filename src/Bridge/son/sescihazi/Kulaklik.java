package Bridge.son.sescihazi;

public class Kulaklik implements SesCihazi{
    @Override
    public void sesiCal(String ses) {
        System.out.println("Kulaklik ses caliyor --> " + ses);
    }
}
