package CorporatePersonnelManagementSystem;

public class Manager extends Person implements PersonnelTasks {

    InputData input = new InputData();
    private String department;

    public Manager(String name, String surname, String gitHubNickname, int salaryPerHour, String department) {
        super(name, surname, gitHubNickname, salaryPerHour);
        this.department = department;
    }

    public void addMember(){
        System.out.println("Enter the name of the new member: ");
        String name = input.InputString();
        System.out.println("Enter the surname of the new member: ");
        String surname = input.InputString();
        System.out.println("Enter the GitHub nickname of the new member: ");
        String gitHubNickname = input.InputString();
        System.out.println("Enter the salary per hour of the new member: ");
        int salaryPerHour = input.InputInt();
        System.out.println("Enter the degree of the new member: ");
        String degree = input.InputString();
        System.out.println("Enter the programming language of the new member: ");
        String language = input.InputString();
        Programmer newMember = new Programmer(name, surname, gitHubNickname, salaryPerHour, language, degree);
        System.out.println("New member added successfully!");
    }

    @Override
    public void work() {
        System.out.println("Create a project for your team");
        System.out.println("Enter the project name: ");
        String projectName = input.InputString();
        System.out.println("Enter the project content: ");
        String projectContent = input.InputString();
        System.out.println("Enter the project duration: ");
        int projectDuration = input.InputInt();
        System.out.println("Project added successfully!");
        Project project = new Project(projectName, projectContent, projectDuration);
        System.out.println("Your team will work with the project: "+projectName);
    }

    @Override
    public int calculateSalary(int salaryPerHour) {
        System.out.println("Enter the number of hours worked: ");
        int hoursWorked = input.InputInt();
        return salaryPerHour * hoursWorked;
    }


}
