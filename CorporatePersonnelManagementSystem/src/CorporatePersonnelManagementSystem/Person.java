package CorporatePersonnelManagementSystem;

public abstract class Person {

    protected String name;
    protected String surname;
    protected String GitHubNickname;
    private int SalaryPerHour;

    public Person(String name, String surname, String gitHubNickname, int salaryPerHour) {
        this.name = name;
        this.surname = surname;
        GitHubNickname = gitHubNickname;
        SalaryPerHour = salaryPerHour;
    }

    public int getSalaryPerHour() {
        return SalaryPerHour;
    }
}



