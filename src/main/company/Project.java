package main.company;

public class Project {
    public static void main(String[] args) {
        Developer developer = new Developer("Nikita", "Svetlakov", "Java", 3_000);

        System.out.println("Developer Information:\n");
        System.out.println(developer.toString());
    }
}
