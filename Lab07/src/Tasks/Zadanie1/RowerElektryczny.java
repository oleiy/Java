package Tasks.Zadanie1;

public class RowerElektryczny extends Pojazd implements Elektryczny {
    private int poziomNaładowania;

    public RowerElektryczny(int id, boolean czyDostepny, String marka, int poziomNaładowania) {
        super(id, czyDostepny, marka);
        this.poziomNaładowania = poziomNaładowania;
    }

    @Override
    public int poziomNaładowania() {
        return poziomNaładowania;
    }

    @Override
    public void naładujAkumulator() {
        poziomNaładowania = 100;
        System.out.println("Akumulator naładowany do 100%");
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin*25;
    }
}
