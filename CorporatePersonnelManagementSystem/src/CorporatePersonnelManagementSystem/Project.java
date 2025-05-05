package CorporatePersonnelManagementSystem;

public class Project {
    private String projectName;
    private String projectContent;
    private int projectDuration;

    public Project(String projectName, String projectContent, int projectDuration) {
        this.projectName = projectName;
        this.projectContent = projectContent;
        this.projectDuration = projectDuration;
    }

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }
}
