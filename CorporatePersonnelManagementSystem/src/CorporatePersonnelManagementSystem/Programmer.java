package CorporatePersonnelManagementSystem;

public class Programmer extends Person implements PersonnelTasks{
    InputData input = new InputData();

    private String degree;
    private String language;
    private Project project;

    public Programmer(String name, String surname, String gitHubNickname, int salaryPerHour, String language, String degree) {
        super(name, surname, gitHubNickname, salaryPerHour);
        this.language = language;
        this.degree = degree;
    }

    @Override
    public void work() {
        if(project != null){
            System.out.println("You are working on the project: " + project.getProjectName());
            System.out.println("Project content: " + project.getProjectContent());
            System.out.println("Project duration: " + project.getProjectDuration() + " days");
        } else {
            System.out.println("You are not assigned to any project yet.");
        }
    }

    @Override
    public int calculateSalary(int salaryPerHour) {
        System.out.println("Enter the number of hours worked: ");
        int hoursWorked = input.InputInt();
        return salaryPerHour * hoursWorked;
    }


}
