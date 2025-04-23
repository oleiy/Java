package Tasks.Zadanie3;

public class Powiesc extends Podrecznik{
    private String gatunek;

    public Powiesc(String tytul, String autor, String wydawnictwo, int rokWydania, double cena, String przedmiot, int poziom, String gatunek) {
        super(tytul, autor, wydawnictwo, rokWydania, cena, przedmiot, poziom);
        this.gatunek = gatunek;
    }

    public void viewData(){
        System.out.println("Dane powiesci:");
        super.viewData();
        System.out.println("Gatunek: " + gatunek);
    }

}
