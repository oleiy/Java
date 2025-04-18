import BazaStudentow.Baza;
import Tasks.Osoba;
import Tasks.Student;

public class Main {

    public static void main(String[] args) {

        Baza baza = new Baza();
        InputData inputData = new InputData();

        Osoba osoba1 = new Osoba("Jan", "Kowalski", 30);
        Osoba osoba2 = new Osoba("Anna", 25);
        Osoba osoba3 = new Osoba();

        osoba1.viewData();
        osoba2.viewData();
        osoba3.viewData();

        Student student1 = new Student("Piotr");
        Student student2 = new Student("Maria", "Kowalska");
        Student student3 = new Student("Tomasz", "Nowak", 123456);
        Student student4 = new Student ("Zofia", "Wójcik", 654321, "Informatyka", 2);

        student1.viewData();
        student2.viewData();
        student3.viewData();
        student4.viewData();

        //MENU
        int option;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Edytuj studenta");
            System.out.println("3. Usuń studenta");
            System.out.println("4. Wyświetl studenta");
            System.out.println("5. Wyświetl wszystkich studentów");
            System.out.println("6. Wyjście");
            System.out.println("Podaj numer opcji: ");
            option = inputData.InputInt();
            switch (option) {
                case 1:
                    System.out.println("Dodawanie studenta: ");
                    System.out.print("Podaj indeks: ");
                    int index = inputData.InputInt();
                    System.out.print("Imię: ");
                    String imie = inputData.InputString();
                    System.out.print("Nazwisko: ");
                    String nazwisko = inputData.InputString();
                    System.out.print("Numer indeksu: ");
                    int nr_indeksu = inputData.InputInt();
                    System.out.print("Specjalność: ");
                    String specjalnosc = inputData.InputString();
                    System.out.print("Rok studiów: ");
                    int rok_studiow = inputData.InputInt();
                    baza.InsertStudentInIndex(index, imie, nazwisko, nr_indeksu, specjalnosc, rok_studiow);
                    break;
                case 2:
                    System.out.println("Edytowanie studenta: ");
                    System.out.print("Podaj indeks: ");
                    int indexEdit = inputData.InputInt();
                    System.out.print("Imię: ");
                    String imieEdit = inputData.InputString();
                    System.out.print("Nazwisko: ");
                    String nazwiskoEdit = inputData.InputString();
                    System.out.print("Numer indeksu: ");
                    int nr_indeksuEdit = inputData.InputInt();
                    System.out.print("Specjalność: ");
                    String specjalnoscEdit = inputData.InputString();
                    System.out.print("Rok studiów: ");
                    int rok_studiowEdit = inputData.InputInt();
                    baza.EditStudentInIndex(indexEdit, imieEdit, nazwiskoEdit, nr_indeksuEdit, specjalnoscEdit, rok_studiowEdit);
                    break;
                case 3:
                    System.out.println("Usuwanie studenta:");
                    System.out.print("Podaj indeks: ");
                    index = inputData.InputInt();
                    baza.DeleteStudentInIndex(index);
                    break;
                case 4:
                    System.out.println("Wyświetlanie studenta:");
                    System.out.print("Podaj indeks: ");
                    index = inputData.InputInt();
                    baza.ViewStudentInIndex(index);
                    break;
                case 5:
                    System.out.println("Wyświetlanie wszystkich studentów:");
                    baza.ViewAllStudents();
                    break;
                case 6:
                    System.out.println("Zakończono działania programu");
                    return;
                default:
                    System.out.println("Nie wybrano żadnej opcji");
            }
        }while(option!=6);
    }

}
