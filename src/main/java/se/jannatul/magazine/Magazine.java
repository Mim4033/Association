package se.jannatul.magazine;

public class Magazine {
    private String name;
    private int cost;
    private String publisher;

    public Magazine (String name, int cost, String  publisher) {
        this.name = name;
        this.cost = cost;
        this.publisher = publisher;

    }


    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;

    }
}

