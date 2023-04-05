package Memento;

import Mediator.Halci;

public class App {
    public static void main(String[] args) {
        Hafiza hafiza = new Hafiza();

        NotePad notePad = new NotePad();
        notePad.ekle("B");
        notePad.ekle("A");
        notePad.ekle("H");
        notePad.ekle("A");

        NotePadMemento baha = notePad.kaydet();
        hafiza.ekle(baha);
        notePad.yazdir();

        notePad.ekle("DIR");
        NotePadMemento bahadir = notePad.kaydet();
        hafiza.ekle(bahadir);

        notePad.ekle(".");

        notePad.yazdir();
        notePad.geriDon(hafiza.sonVersiyonuGetir());
        notePad.yazdir();
        notePad.geriDon(hafiza.sonVersiyonuGetir());
        notePad.yazdir();

    }
}
