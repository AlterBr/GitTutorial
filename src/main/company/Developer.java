package main.company;

public class Developer {
    private String firstName;
    private String lastName;
    private String specialty;
    private Integer salary;
    private Team team;

    public Developer() {
    }

    public Developer(String firstName, String lastName, String specialty, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nSpecialty: " + specialty +
                "\nSalary: " + salary +
                "\nTeam: " + team.getTeamName();
    }
}
