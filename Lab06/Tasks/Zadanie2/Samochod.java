package Tasks.Zadanie2;
import Tasks.InputData;

public class Samochod {

    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rokProdukcji;
    private int przebieg;

    public Samochod(){
        InputData inputData = new InputData();
        System.out.println("Marka: ");
        this.marka = inputData.InputString();
        System.out.println("Model: ");
        this.model = inputData.InputString();
        System.out.println("Nadwozie: ");
        this.nadwozie = inputData.InputString();
        System.out.println("Kolor: ");
        this.kolor = inputData.InputString();
        System.out.println("Rok produkcji: ");
        this.rokProdukcji = inputData.InputInt();
        System.out.println("Przebieg: ");
        this.przebieg = inputData.InputInt();

    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int przebieg, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.rokProdukcji = rokProdukcji;
    }

    public void viewData(){
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Nadwozie: "+nadwozie);
        System.out.println("Kolor: "+kolor);
        System.out.println("Rok produkcji: "+rokProdukcji);
        System.out.println("Przebieg: "+przebieg);
    }


}
