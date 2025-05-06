package Tasks.Zadanie1;

public class Samochod extends Pojazd {
    private String model;
    private int pojemnoscSilnika;
    private int liczbaMiejsc;
    private String typNadwozia;

    public Samochod(int id, boolean czyDostepny, String marka, String model, int pojemnoscSilnika, int liczbaMiejsc, String typNadwozia) {
        super(id, czyDostepny, marka);
        this.model = model;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.liczbaMiejsc = liczbaMiejsc;
        this.typNadwozia = typNadwozia;
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin * 30;
    }
}
