package Tasks.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private List<Ksiazka> kupioneKsiazki = new ArrayList<>();

    public Klient(String imie, String nazwisko, List<Ksiazka> kupioneKsiazki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kupioneKsiazki = kupioneKsiazki;
    }

    public void kupKsiazke(Ksiazka ksiazka) {
        kupioneKsiazki.add(ksiazka);
        System.out.println("Kupiono ksiazke: " + ksiazka.tytul);
    }

    public void viewData(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Kupione ksiazki: ");
        for (Ksiazka ksiazka : kupioneKsiazki) {
            ksiazka.viewData();
            System.out.println();
        }
    }

}

