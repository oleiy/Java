package Tasks;

import Tasks.Zadanie2.Samochod;
import Tasks.Zadanie2.SamochodOsobowy;
import Tasks.Zadanie3.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Zadanie 1
        /*Punkt p1 = new Punkt(2, 3);
        Punkt p2 = new Punkt(4, 5);
        Punkt p3 = new Punkt(6, 7);

        p1.opis();
        p2.zeruj();
        p3.przesun(2,3);

        Figura f1 = new Figura(p2);
        Figura f2 = new Figura("czerwony");
        Figura f3 = new Figura(p1);

        Prostokat prostokat1 = new Prostokat(2,3);
        prostokat1.przesun(3.0,5.0);*/

        //Zadanie 2
        /*Samochod s1 = new Samochod();
        Samochod s2 = new Samochod("BMW", "X5","SUV","czarny", 2020, 50000);

        SamochodOsobowy so1 = new SamochodOsobowy();

        so1.viewData();
        s1.viewData();*/

        //Zadanie 3

        Ksiegarnia ksiegarnia = new Ksiegarnia();

        Ksiazka ksiazka1 = new Ksiazka("Dom woskowych zabawek", "Jan Kowalski", "Wydawnictwo ABC", 2020, 29.99);
        Podrecznik podrecznik1 = new Podrecznik("Matematyka", "Anna Nowak", "Wydawnictwo XYZ", 2021, 49.99, "Matematyka", 2);
        Powiesc powiesc1 = new Powiesc("Wielka powiesc", "Jan Nowak", "Wydawnictwo ABC", 2022, 39.99, "Historia", 3, "Thriller");
        Klient klient1 = new Klient("Jan", "Kowalski", List.of(ksiazka1, podrecznik1, powiesc1));
        klient1.kupKsiazke(ksiazka1);

    }
}