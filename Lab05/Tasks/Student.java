package Tasks;

public class Student {

    String imie;
    String nazwisko;
    int nr_indeksu;
    String specjalnosc;
    int rok_studiow;

    public Student(String imie) {
        this.imie = imie;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, String nazwisko, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, String specjalnosc, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = specjalnosc;
        this.rok_studiow = rok_studiow;
    }

    public void viewData() {
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Nr indeksu: " + nr_indeksu +
                " Specjalnosc: " + specjalnosc + " Rok studiow: " + rok_studiow);
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public int getNrIndeksu() {
        return nr_indeksu;
    }
    public void setNrIndeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }
    public String getSpecjalnosc() {
        return specjalnosc;
    }
    public void setSpecjalnosc(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }
    public int getRokStudiow() {
        return rok_studiow;
    }
    public void setRokStudiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }

}
