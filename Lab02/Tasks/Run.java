package Tasks;

public class Run {

    InputData inputData = new InputData();
    TasksLab02 tasksLab02 = new TasksLab02();

    public void RunMain(){
        Menu();
    }

    private void Menu(){
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
            case 5: Task5Run(); break;
            case 6: Task6Run(); break;
            //case 7: Task7Run(); break;*/
           // case 8: tasksLab02.CloseProgram(); break;
            default: System.out.println("Błędne dane. Wybierz ponownie."); break;
        }

    }

    private void Task1Run(){

        System.out.println("Podaj a: ");
        int a = inputData.InputInt();
        System.out.println("Podaj b: ");
        int b = inputData.InputInt();
        System.out.println("Podaj c: ");
        int c = inputData.InputInt();
        System.out.println("Podaj wartość x: ");
        int x = inputData.InputInt();
        System.out.println("Wartość wielomianu "+a+"x^2+"+b+"x+"+c+" dla x równego "+x+" wynosi: "+tasksLab02.Task1(a,b,c,x));
    }

    private void Task2Run(){

        System.out.println("Podaj wartość x: ");
        double x = inputData.InputDouble();
        tasksLab02.Task2(x);
    }

    private void Task3Run(){
        System.out.println("Podaj wartość x: ");
        double x = inputData.InputDouble();
        System.out.println("Podaj wartość y: ");
        double y = inputData.InputDouble();
        System.out.println("Podaj wartość z: ");
        double z = inputData.InputDouble();
        System.out.println("Wartości przed sortowaniem: x = "+x+", y = "+y+", z = "+z);
        tasksLab02.Task3(x,y,z);
    }

    private void Task4Run(){
        System.out.println("Czy pada deszcz? Jeżeli TAK wpisz: true, jeżeli NIE wpisz: false");
        boolean rain = inputData.InputBoolean();
        System.out.println("Czy jest autobus? Jeżeli TAK wpisz: true, jeżeli NIE wpisz: false");
        boolean bus = inputData.InputBoolean();
        tasksLab02.Task4(rain, bus);
    }

    private void Task5Run(){
        System.out.println("Czy jest zniżka? Jeżeli TAK wpisz: true, jeżeli NIE wpisz: false");
        boolean discount = inputData.InputBoolean();
        System.out.println("Czy dostałeś podwyżkę? Jeżeli TAK wpisz: true, jeżeli NIE wpisz: false");
        boolean raise = inputData.InputBoolean();
        tasksLab02.Task5(discount, raise);
    }

    private void Task6Run(){
        System.out.println("--- Kalkulator ---");
        System.out.println("ID: 1 - Dodawanie");
        System.out.println("ID: 2 - Odejmowanie");
        System.out.println("ID: 3 - Iloczyn");
        System.out.println("ID: 4 - Iloraz");
        System.out.println("ID: 5 - Reszta z dzielenia");
        System.out.println("Które działanie chcesz wykonać podaj ID: ");
        int id = inputData.InputInt();
        System.out.println("Podaj pierwszą liczbę: ");
        int a = inputData.InputInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = inputData.InputInt();
        System.out.println("Wynik wybranego działania "+tasksLab02.Task6(id,a,b));

    }

}
