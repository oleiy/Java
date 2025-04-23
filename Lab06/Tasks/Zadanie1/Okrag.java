package Tasks.Zadanie1;

public class Okrag extends Figura{

    Punkt srodek;
    double promien;

    public void getPowierzchnia(){
        double pow = Math.PI * promien * promien;
        System.out.println("Powierzchnia okregu: " + pow);
    }
    public void getSrednica(){
        double srednica = 2 * promien;
        System.out.println("Srednica okregu: " + srednica);
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void wSrodku(Punkt p){
        double odleglosc = Math.sqrt(Math.pow((srodek.x - p.x), 2) + Math.pow((srodek.y - p.y), 2));
        if(odleglosc < promien){
            System.out.println("Punkt znajduje sie w srodku okregu");
        }else{
            System.out.println("Punkt nie znajduje sie w srodku okregu");
        }
    }

    public Okrag() {
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }
}
