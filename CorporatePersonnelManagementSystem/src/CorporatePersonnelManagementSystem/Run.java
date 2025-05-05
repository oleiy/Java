package CorporatePersonnelManagementSystem;

public class Run {

    InputData inputData = new InputData();
    Manager manager = new Manager("John", "Doe", "johndoe", 50, "Team A");
    Programmer programmer = new Programmer("Jane", "Smith", "janesmith", 40, "Java", "Junior");
    Project project = new Project("Project A", "Project content", 30);

    public void RunMain() {
        mainMenu();
    }

    public void mainMenu() {
        while (true) {
            System.out.println("Welcome to the Corporate Personnel Management System");
            System.out.println(" ====== MAIN MENU ====== ");
            System.out.println("1. Manager");
            System.out.println("2. Programmer");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            int choice = inputData.InputInt();

            switch (choice) {
                case 1:
                    ManagerMenu();
                    break;
                case 2:
                    ProgrammerMenu();
                    break;
                case 3:
                    CloseProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
    }

    private void CloseProgram() {
        System.out.println("Exiting the program...");
        System.exit(0);
    }

    private void ProgrammerMenu() {
        while (true) {
            System.out.println(" ====== PROGRAMMER MENU ====== ");
            System.out.println("1. Work on Task");
            System.out.println("2. Calculate your salary");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            int choice = inputData.InputInt();

            switch (choice) {
                case 1:
                    programmer.work();
                    break;
                case 2:
                    int salary = programmer.calculateSalary(programmer.getSalaryPerHour());
                    System.out.println("Your salary is: " + salary);

                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void ManagerMenu() {
        while (true) {
            System.out.println(" ====== MANAGER MENU ====== ");
            System.out.println("1. Create a project");
            System.out.println("2. Add member to team");
            System.out.println("3. Calculate your salary");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            int choice = inputData.InputInt();

            switch (choice) {
                case 1:
                    manager.work();
                    break;
                case 2:
                    manager.addMember();
                    break;
                case 3:
                    int salary = manager.calculateSalary(manager.getSalaryPerHour());
                    System.out.println("Your salary is: " + salary);
                    break;
                case 4:
                    mainMenu();
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}


