package BazaStudentow;
import Tasks.Student;

public class Baza {

    Student[] studenci = new Student[100];

    public void SetStudent(Student student) {
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = new Student("", "", 0, "", 0);
        }
    }

    public void InsertStudentInIndex(int index, String imie, String nazwisko, int nr_indeksu, String specjalnosc, int rok_studiow) {
        if(index >= 0 && index < studenci.length){
            studenci[index] = new Student(imie, nazwisko, nr_indeksu, specjalnosc, rok_studiow);
            System.out.println("Student dodany pomyślnie");
        } else {
            System.out.println("Podano nie właściwy indeks");
        }
    }

    public void EditStudentInIndex(int index, String imie, String nazwisko, int nr_indeksu, String specjalnosc, int rok_studiow) {
        if(index >= 0 && index < studenci.length){
            studenci[index] = new Student(imie, nazwisko, nr_indeksu, specjalnosc, rok_studiow);
            System.out.println("Student zaaktualizowany pomyślnie");
        } else {
            System.out.println("Brak studenta pod podanym indeksem!");
        }
    }

    public void DeleteStudentInIndex(int index) {
        if(index >= 0 && index < studenci.length){
            studenci[index] = null;
            System.out.println("Student usunięty pomyślnie");
        } else {
            System.out.println("Brak studenta pod podanym indeksem!");
        }
    }

    public void ViewStudentInIndex(int index) {
        if(index >= 0 && index < studenci.length){
            if(studenci[index] != null){
                studenci[index].viewData();
            } else {
                System.out.println("Brak studenta pod podanym indeksem!");
            }
        } else {
            System.out.println("Brak studenta pod podanym indeksem!");
        }
    }
    public void ViewAllStudents() {
        for (int i = 0; i < studenci.length; i++) {
            if(studenci[i] != null){
                studenci[i].viewData();
            } else {
                System.out.println("Brak studenta pod podanym indeksem!");
            }
        }
    }

}



