package se.jannatul.magazine;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("Voge", 120, "Anna");

        System.out.println(magazine.getName() +" "+ magazine.getCost() +" " + magazine.getPublisher());
        magazine.setName("Diary");
        magazine.setCost(2000);
        magazine.setPublisher("Banna");
        System.out.println(magazine.getName() +" "+ magazine.getCost() +" " + magazine.getPublisher());

    }

}
