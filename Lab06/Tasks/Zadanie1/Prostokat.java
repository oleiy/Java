package Tasks.Zadanie1;

public class Prostokat extends Figura {
    public double wys=0, szer=0;

    public Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;
    }

    public double getPowierzchnia() {
        return (szer * wys);
    }

    public Prostokat(String kolor, double wys, double szer) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    public void przesun(double x, double y) {
        this.punkt.x += x;
        this.punkt.y += y;
    }
}