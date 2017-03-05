package main;

public class Technology {
    private String technologyName;

    public Technology() {
    }

    public Technology(String technologyName) {
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
