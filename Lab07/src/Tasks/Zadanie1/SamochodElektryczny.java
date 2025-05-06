package Tasks.Zadanie1;

public class SamochodElektryczny extends Pojazd implements Elektryczny {

    private int poziomNaładowania;

    public SamochodElektryczny(int id, boolean czyDostepny, String marka) {
        super(id, czyDostepny, marka);
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin*50;
    }

    @Override
    public int poziomNaładowania() {
        return poziomNaładowania;
    }

    @Override
    public void naładujAkumulator() {

    }

}
