package learn.project.springboot.domain;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}