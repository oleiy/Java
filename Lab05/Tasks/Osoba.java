package Tasks;

public class Osoba {

    String imie;
    String nazwisko;
    int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba() {
    }

    public void viewData() {
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek);
    }

}