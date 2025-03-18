package Tasks;

public class Run {

    InputData inputData = new InputData();
    TasksLab03 tasksLab03 = new TasksLab03();

    public void RunMain(){
        Menu();
    }

    private void Menu(){
        System.out.println("1. Task 1: ");
        System.out.println("2. Task 2: ");
        System.out.println("3. Task 3: ");
        System.out.println("4. Task 4: ");
        System.out.println("5. Task 5: ");
        System.out.println("6. Exit");
        System.out.println("Select a task: ");

        int choose = inputData.InputInt();
        switch (choose){
            case 1: Task1Run(); break;
            case 2: Task2Run(); break;
            case 3: Task3Run(); break;
            case 4: Task4Run(); break;
            case 5: Task5Run(); break;
            case 6: CloseProgram(); break;
            default: System.out.println("Błędne dane. Wybierz ponownie."); break;
        }
    }

    private void Task1Run(){
        int i = 0, points = 0;
        System.out.println("Podaj ile studentów znajduje się w grupie laboratoryjnej: ");
        int n = inputData.InputInt();
        while(i<n){
            System.out.println("Podaj liczbe punktów: ");
            points += inputData.InputInt();
            i++;
        }
        System.out.println("Średnia punktów tej grupy wynosi: "+tasksLab03.Task1(points,n));
    }

    private void Task2Run(){

        int sumPos = 0;
        int sumNeg = 0;

        for(int i = 1; i<=10; i++){
            System.out.println("Podaj "+i+". liczbę: ");
            int x = inputData.InputInt();
            if(x < 0){
                sumNeg += x;
            } else {
                sumPos += x;
            }
        }
        System.out.println("Suma liczb dodatnich: "+sumPos);
        System.out.println("Suma liczb ujemnych: "+sumNeg);

    }

    private void Task3Run(){
        System.out.println("Podaj n: ");
        int n = inputData.InputInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Podaj wyraz ciągu: ");
            array[i] = inputData.InputInt();
        }
        System.out.println("Suma liczb parzystych tego ciągu wynosi: "+tasksLab03.Task3(array, n));
    }

    private void Task4Run(){
        int[] array = RandomValue.RandomValue(-10,45,5);
        int n = 5;
        System.out.println("Wylosowany ciąg: ");
        for(int i = 0; i<n; i++){
            System.out.println(array[i]);
        }
        System.out.println("Suma parzystych liczb ciągu: "+tasksLab03.Task4(array,n));

    }

    private void Task5Run(){
        System.out.println("Podaj słowo: ");
        String word = inputData.InputString();

        if(tasksLab03.Task5(word)){
            System.out.println("Słowo "+word+" jest palindromem");
        }else{
            System.out.println("Słowo "+word+" nie jest palindromem");
        }
    }

    private void CloseProgram(){
        System.out.println("Dziękujemy za skorzystanie z programu, możesz zamknąć okno!");
    }

}

