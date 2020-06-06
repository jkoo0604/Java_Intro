public class Project {
    String name;
    String description;
    public Project() {
        this.name = "project name tbd";
        this.description = "description tba";
    }

    public Project(String name) {
        this.name = name;
        this.description = "description tba";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch() {
        return this.name + ": " + this.description;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }
}