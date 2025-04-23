package Tasks.Zadanie2;

import Tasks.InputData;

public class SamochodOsobowy extends Samochod{
    private double waga;
    private double pojemnoscSilnika;
    private int iloscMiejsc;

    public SamochodOsobowy() {
        super();
        InputData inputData = new InputData();
        do {
            System.out.println("Waga (2 - 4.5 tony): ");
            this.waga = inputData.InputDouble();
            if (waga < 2 || waga > 4.5) {
                System.out.println("Waga niezgodna ze standardem! Spróbuj ponownie.");
            }
        } while (waga < 2 || waga > 4.5);

        // Pojemność silnika
        do {
            System.out.println("Pojemność silnika (0.8 - 3.0 litra): ");
            this.pojemnoscSilnika = inputData.InputDouble();
            if (pojemnoscSilnika < 0.8 || pojemnoscSilnika > 3.0) {
                System.out.println("Pojemność silnika niezgodna ze standardem! Spróbuj ponownie.");
            }
        } while (pojemnoscSilnika < 0.8 || pojemnoscSilnika > 3.0);
            System.out.println("Ilość miejsc: ");
            this.iloscMiejsc = inputData.InputInt();
    }

    @Override
    public void viewData() {
        super.viewData();
        System.out.println("Waga: "+waga);
        System.out.println("Pojemnosc silnika: "+pojemnoscSilnika);
        System.out.println("Ilosc osob: "+iloscMiejsc);
    }
}
