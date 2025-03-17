package Tasks;

import java.util.Random;

public class Run {

    InputData inputData = new InputData();
    TasksLab01 tasksLab01 = new TasksLab01();
    Random random = new Random();

    //Startup method for Main
    public void RunMain(){
        Menu();
    }

    //Method for Menu
    private void Menu(){
        System.out.println("1. Task 1: ");
        System.out.println("1. Task 2: ");
        System.out.println("1. Task 3: ");
        System.out.println("1. Task 4: ");
        System.out.println("1. Task 5: ");
        System.out.println("1. Task 6: ");
        System.out.println("1. Task 7: ");
        System.out.println("8. Exit");
        System.out.println("Select a task: ");

        int choose = inputData.InputInt();
        switch (choose){
            case 1: Task1Run(); break;
            case 2: Task2Run(); break;
            case 3: Task3Run(); break;
            case 4: Task4Run(); break;
            case 5: Task5Run(); break;
            case 6: Task6Run(); break;
            case 7: Task7Run(); break;
            //case 8: tasksLab01.CloseProgram(); break;
            default: System.out.println("Błędne dane. Wybierz ponownie."); break;
        }

    }

    //Startup method for Task1
    private void Task1Run(){
        System.out.println("Podaj imię: ");
        String name = inputData.InputString();
        System.out.println("Podaj wiek: ");
        int age = inputData.InputInt();
        System.out.println(tasksLab01.Task1(name, age));
    }

    //Startup method for Task2
    private void Task2Run(){
        System.out.println("Podaj liczbe: ");
        double value1 = inputData.InputDouble();
        System.out.println("Podaj liczbe: ");
        double value2 = inputData.InputDouble();
        tasksLab01.Task2(value1, value2);

    }

    //Startup method for Task3
    private void Task3Run(){
    System.out.println("Podaj liczbe: ");
    int value = inputData.InputInt();
    if(tasksLab01.Task3(value)){
        System.out.println("Liczba jest parzysta");
    }
    else {
        System.out.println("Liczba jest nieparzysta");
    }
    }

    //Startup method for Task4
    private void Task4Run() {
        System.out.println("Podaj liczbe ");
        int value = inputData.InputInt();
        tasksLab01.Task4(value);
        if (tasksLab01.Task4(value)) {
            System.out.println("Liczba jest podzielna przez 3 i 5");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3 i 5");
        }
    }

    //Startup method for Task5
    private void Task5Run(){
        System.out.println("Podaj liczbe ");
        int value = inputData.InputInt();
        System.out.println("Liczba podniesiona do potęgi 3 wynosi: " + tasksLab01.Task5(value));
    }

    //Startup method for Task6
    private void Task6Run(){
        System.out.println("Podaj liczbe ");
        double value = inputData.InputDouble();
        System.out.println("Pierwiastek kwadratowy liczby wynosi: " + tasksLab01.Task6(value));
    }

    //Startup method for Task7
    private void Task7Run(){
        System.out.println("Podaj początkową wartość przedziału ");
        int a = inputData.InputInt();
        System.out.println("Podaj końcową wartość przedziału ");
        int b = inputData.InputInt();

        int num1 = RandomInt(a,b);
        int num2 = RandomInt(a,b);
        int num3 = RandomInt(a,b);

        if (tasksLab01.Task7(num1, num2, num3)) {
            System.out.println("Możliwe jest zbudowanie trójkąta prostokątnego z boków o długościach: " + num1 + ", " + num2 + ", " + num3);
        } else {
            System.out.println("Nie możliwe jest zbudowanie trójkąta prostokątnego z boków o długościach: " + num1 + ", " + num2 + ", " + num3);
        }
    }


    //Random numbers method
    private int RandomInt(int a, int b){
        return (random.nextInt(b-a+1)+1);
    }

}