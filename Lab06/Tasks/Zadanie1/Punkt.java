package Tasks.Zadanie1;

public class Punkt {
    public int x;
    public int y;

    public Punkt() {
    }

    public Punkt(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zeruj(){
        this.x = 0;
        this.y = 0;
    }
    public void opis(){
        System.out.println("Tasks.Zadanie1.Punkt: "+this.x+" "+this.y);
    }
    public void przesun(int x, int y){
        this.x += this.x;
        this.y += this.y;
    }
}
