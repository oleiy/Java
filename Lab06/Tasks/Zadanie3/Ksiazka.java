package Tasks.Zadanie3;

public class Ksiazka {
    public String tytul;
    private String autor;
    private String wydawnictwo;
    private int rokWydania;
    private double cena;

    public Ksiazka(String tytul, String autor, String wydawnictwo, int rokWydania, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
        this.cena = cena;
    }

    public void viewData(){
        System.out.println("Dane ksiazki:");
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Wydawnictwo: " + wydawnictwo);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Cena: " + cena);
    }

}


