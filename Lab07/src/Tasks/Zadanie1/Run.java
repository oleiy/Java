package Tasks.Zadanie1;


import Tasks.InputData;

import java.util.ArrayList;
import java.util.List;

public class Run {

    InputData inputData = new InputData();
    List<Pojazd> pojazdy = new ArrayList<>();

    public void start() {
        pojazdy.add(new RowerElektryczny(1, true, "Treck", 100));
        pojazdy.add(new SamochodElektryczny(2, true, "Tesla"));
        pojazdy.add(new Samochod(3, true, "Toyota", "RAV4", 2, 5, "SUV"));

    }

    public void menu() {
        while (true) {
            System.out.println("======= MENU =======");
            System.out.println("1. Wyświetl wszystkie pojazdy");
            System.out.println("2. Wyświetl konkretny pojazd (ID)");
            System.out.println("3. Dodaj pojazd");
            System.out.println("4. Edytuj pojazd (ID)");
            System.out.println("5. Oblicz koszt wynajmu pojazdu (ID)");
            System.out.println("6. Zamknij");
            System.out.print("Wybierz opcję: ");
            int option = inputData.InputInt();

            switch (option) {
                case 1:
                    showAll();
                    break;
                case 2:
                    showById();
                    break;
                case 3:
                    addVehicle();
                    break;
                case 4:
                    editVehicle();
                    break;
                case 5:
                    calculateCost();
                    break;
                case 6:
                    close();
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            }
            System.out.println();
        }
    }

    private void close() {
        System.out.println("Zamykanie programu...");
        System.exit(0);
    }

    private void calculateCost() {
        System.out.println("======= OBLICZ KOSZT =======");
        System.out.print("Podaj ID pojazdu: ");
        int id = inputData.InputInt();
        System.out.print("Podaj liczbę godzin: ");
        int liczbaGodzin = inputData.InputInt();

        // Dodaj logikę obliczania kosztu wynajmu pojazdu
        double koszt = 0; // Przykładowa wartość, zastąp rzeczywistym obliczeniem
        System.out.println("Koszt wynajmu: " + koszt);
    }

    private void editVehicle() {
        System.out.println("======= EDYTUJ POJAZD =======");
        System.out.print("Podaj ID pojazdu do edycji: ");
        int id = inputData.InputInt();
        System.out.print("Podaj nową markę pojazdu: ");
        String marka = inputData.InputString();
        System.out.print("Czy pojazd jest dostępny? (true/false): ");
        boolean czyDostepny = inputData.InputBoolean();

        // Dodaj logikę edytowania pojazdu w bazie danych lub liście
        System.out.println("Tasks.Zadanie1.Pojazd zaktualizowany pomyślnie!");
    }

    private void addVehicle() {
        System.out.println("======= DODAJ POJAZD =======");
        System.out.print("Podaj ID pojazdu: ");
        int id = inputData.InputInt();
        System.out.print("Podaj markę pojazdu: ");
        String marka = inputData.InputString();
        System.out.print("Czy pojazd jest dostępny? (true/false): ");
        boolean czyDostepny = inputData.InputBoolean();

        // Dodaj logikę dodawania pojazdu do bazy danych lub listy
        System.out.println("Tasks.Zadanie1.Pojazd dodany pomyślnie!");
    }

    private void showById() {
        System.out.print("Podaj ID pojazdu: ");
    }

    private void showAll() {
        System.out.println("======= WSZYSTKIE POJAZDY =======");
        }

}


