package Iterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Matematik");
        Iterator soruIterator = kitap.getSoruIterator();
        while (soruIterator.hasNext()){
            Soru soru = (Soru) soruIterator.next();
            System.out.println(soru.getSoruNo());
        }

        Fasikul fasikul = new Fasikul("Matematik Fasikul");
        SoruIterator soruIterator1 = fasikul.getSoruIterator();
        while (soruIterator1.hasNext()){
            Soru soru = (Soru) soruIterator1.next();
            System.out.println(soru.getSoruNo());
        }
    }

}

