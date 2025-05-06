package Tasks.Zadanie1;

public abstract class Pojazd {
    private int id;
    private boolean czyDostepny = true;
    private String marka;

    public Pojazd(int id, boolean czyDostepny, String marka) {
        this.id = id;
        this.czyDostepny = czyDostepny;
        this.marka = marka;
    }

    public void wypożycz() {
        if (czyDostepny) {
            czyDostepny = false;
            System.out.println("Tasks.Zadanie1.Pojazd wypożyczony.");
        } else {
            System.out.println("Tasks.Zadanie1.Pojazd niedostępny.");
        }
    }

    public void zwróć() {
        czyDostepny = true;
        System.out.println("Tasks.Zadanie1.Pojazd zwrócony.");
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Dostępność: " + (czyDostepny ? "Dostępny" : "Niedostępny"));
        System.out.println("Marka: " + marka);
    }

    public abstract double obliczKoszt(int liczbaGodzin);

}


