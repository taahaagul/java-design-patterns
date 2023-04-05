package Decorator;

public class RaporApp {
    public static void main(String[] args) {
        String icerik = getRaporIcerik();
        DuzRapor duzRapor = new DuzRapor(icerik);
        CizgiliRaporDecorator cizgili = new CizgiliRaporDecorator(duzRapor);
        KucukRaporDecorator kucuk = new KucukRaporDecorator(cizgili);
        ImzaliRaporDecoratorI imzali = new ImzaliRaporDecoratorI(kucuk);
        String metin = imzali.getMetin();
        System.out.println(metin);
    }

    private static String getRaporIcerik() {
        String icerik = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem  " +
                "\naccusantium doloremque laudantium, totam rem aperiam eaque ipsa, quae ab " +
                "\nillo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo." +
                "\n Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, " +
                "\nsed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt," +
                "\n neque porro quisquam est, qui dolorem ipsum, quia dolor sit amet consectetur " +
                "\nadipisci[ng] velit, sed quia non numquam [do] eius modi tempora inci[di]dunt, ut " +
                "\nlabore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis " +
                "\nducimus, qui blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores" +
                "\n et quas molestias excepturi sint, obcaecati cupiditate non provident, similique sunt " +
                "\nin culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et" +
                "\n harum quidem rerum facilis est et expedita distinctio.";

        return icerik;
    }

}
