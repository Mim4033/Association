package se.jannataggretion;

public class main {
    public static void main(String[] args) {

        Student student = new Student("Alice");
        Course course = new Course("Phython");
        System.out.println(student.getName() + " " + course.getName());

        student.setName("Marly");
        course.setName("Java");
        System.out.println(student.getName() + " " + course.getName());


    }

}
