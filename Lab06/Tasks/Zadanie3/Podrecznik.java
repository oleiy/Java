package Tasks.Zadanie3;

public class Podrecznik extends Ksiazka {
    private String przedmiot;
    private int poziom;

    public Podrecznik(String tytul, String autor, String wydawnictwo, int rokWydania, double cena, String przedmiot, int poziom) {
        super(tytul, autor, wydawnictwo, rokWydania, cena);
        this.przedmiot = przedmiot;
        this.poziom = poziom;
    }

    public void viewData(){
        System.out.println("Dane podrecznika:");
        super.viewData();
        System.out.println("Przedmiot: " + przedmiot);
        System.out.println("Poziom: " + poziom);
    }

}



