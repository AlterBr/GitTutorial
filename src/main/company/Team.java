package main.company;

import java.util.*;

public class Team {
    private String teamName;
    private List<Developer> developers;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public void addDeveloperToTeam(Developer developer) {
        this.developers.add(developer);
    }

    public void removeDeveloperFromTeam(Developer developer) {
        this.developers.remove(developer);
    }

    public void showTeam() {
        System.out.println(developers);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", developers=" + developers +
                '}';
    }
}
