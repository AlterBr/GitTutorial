package main.company;

public class Skill {
    private String technologyName;

    public Skill() {
    }

    public Skill(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    @Override
    public String toString() {
        return "Technology: " + this.technologyName;
    }
}
