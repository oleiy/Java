package Tasks.Zadanie1;

public class Kwadrat extends Prostokat{
    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public Kwadrat(String kolor, double wys, double szer) {
        super(kolor, wys, szer);
    }

    public double getWys(){
        return wys;
    }
    public double getSzer(){
        return szer;
    }
    public void setWys(double wys){
        this.wys = wys;
    }
    public void setSzer(double szer){
        this.szer = szer;
    }
}
