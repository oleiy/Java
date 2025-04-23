package Tasks.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Ksiegarnia {
    private List<Ksiazka> dostepneKsiazki = new ArrayList<>();
    private List<Klient> klienci = new ArrayList<>();

    public void dodajKsiazke(Ksiazka ksiazka) {
        dostepneKsiazki.add(ksiazka);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void wyswietlDostepneKsiazki() {
        System.out.println("Dostepne ksiazki:");
        for (Ksiazka ksiazka : dostepneKsiazki) {
            ksiazka.viewData();
            System.out.println();
        }
    }

}
