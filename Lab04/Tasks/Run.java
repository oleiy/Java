package Tasks;
import java.util.Arrays;

public class Run {

    InputData inputData = new InputData();
    TasksLab04 tasksLab04 = new TasksLab04();

    public void RunMain(){
        Menu();
        }

    public void Menu(){
        System.out.println("1. Task 1: ");
        System.out.println("2. Task 2: ");
        System.out.println("3. Task 3: ");
        System.out.println("4. Task 4: ");
        System.out.println("5. Task 5: ");
        System.out.println("6. Task 6: ");
        System.out.println("7. Task 7: ");
        System.out.println("8. Exit");
        System.out.println("Select a task: ");

        int choose = inputData.InputInt();
        switch (choose){
            case 1: Task1Run(); break;
            case 2: Task2Run(); break;
            case 3: Task3Run(); break;
            case 4: Task4Run(); break;
            //case 5: Task5Run(); break;
            //case 6: Task6 Run(); break;
            //case 7: Task7 Run(); break;
            //case 8: CloseProgram(); break;
            default: System.out.println("Błędne dane. Wybierz ponownie."); break;
        }
    }

    private void Task1Run(){
        System.out.println("Podaj ilość elementów tablicy: ");
        int n = inputData.InputInt();
        int[] tab = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Podaj element tablicy nr " + (i + 1) + ":");
            tab[i] = inputData.InputInt();
        }
        System.out.println("Elementy tablicy: ");
        for(int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }

        tasksLab04.Task1(tab);

    }

    private void Task2Run(){

        System.out.println("Podaj nieparzystą liczbę elementów pierwszej tablicy: ");
        int n = inputData.InputInt();
        while(n % 2 == 0){
            System.out.println("Liczba jest parzysta! Wprowadź liczbę nieparzystą: ");
            n = inputData.InputInt();
       }
        int[] tab1 = new int[n];
        System.out.println("Podaj parzystą liczbę elementów drugiej tablicy: ");
        int m = inputData.InputInt();
        while (m % 2 == 1) {
            System.out.println("Liczba jest nieparzysta! Wprowadź liczbę parzystą: ");
            m = inputData.InputInt();
        }
        int[] tab2 = new int[m];

        for(int i = 0; i < tab1.length; i++){
            System.out.println("Podaj element pierwszej tablicy nr " + (i + 1) + ": ");
            tab1[i] = inputData.InputInt();
        }
        System.out.println("Pomyślnie uzupełniono pierwsza tablica.");

        for(int i = 0; i < tab2.length; i++){
            System.out.println("Podaj element drugiej tablicy nr " + (i + 1) + ": ");
            tab2[i] = inputData.InputInt();
        }
        System.out.println("Pomyślnie uzupełniono drugą tablica.");
        tasksLab04.Task2(tab1, tab2);

    }

    private void Task3Run() {
        String[] tab = {"what", "are", "you", "looking", "for"};
        tasksLab04.Task3(tab);
    }

    private void Task4Run() {
        String[] tab = new String[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj słowo nr " + (i + 1) + ": ");
            tab[i] = inputData.InputString();
        }
        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("\nElementy tablicy po transformacji: ");
        tasksLab04.Task4(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");

        }
    }

    private void Task5Run() {
        System.out.println("Sortowanie Bąbelkowe:");

        int[] array = {-2, 8, 665, -1200, 48215, 0, 1};
        System.out.println("Tablica przed sortowaniem:\n"+Arrays.toString(array));

        int[] sorted_array = tasksLab04.Task5(array);
        System.out.println("Tablica po sortowaniu:\n"+Arrays.toString(sorted_array));

    }

    private void Task6Run() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj liczbę do tablicy: ");
            array[i] = inputData.InputInt();
        }

        System.out.println("Tablica przed !:\n"+Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = tasksLab04.Task6(array[i]);
        }
        System.out.println("Tablica po !:\n"+Arrays.toString(array));

    }

    private void Task7Run() {
        String[] array1 = {"cos", "ktos", "gdzies"};
        String[] array2 = {"cos", "ktos", "gdzies"};

        System.out.println("Tablica 1: "+Arrays.toString(array1));
        System.out.println("Tablica 2: "+Arrays.toString(array2));

        if(tasksLab04.Task7(array1,array2)){
            System.out.println("tablice są identyczne");
        }else{
            System.out.println("tablice się różnią");
        }
    }

    private void CloseProgram(){
        System.out.println("Dziękujemy za skorzystanie z programu, możesz zamknąć okno");
    }

}

