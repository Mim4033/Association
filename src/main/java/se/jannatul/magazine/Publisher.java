package se.jannatul.magazine;

public class Publisher {
    private String name;
    private Magazine magazine;
    public Publisher(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
