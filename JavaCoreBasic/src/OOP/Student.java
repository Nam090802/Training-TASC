package OOP;

public class Student {
    private String name;
    int age;
    protected String gender;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Student() {
    }

    private void learn() {
        System.out.println("Student is learning...");
    }

    void sleep() {
        System.out.println("Student is sleeping...");
    }

    protected void eat() {
        System.out.println("Student is eating...");
    }
    public void run() {
        System.out.println("Student is running...");
    }

    public static void main(String[] args) {
        Student student = new Student();
        //thuộc tính và phương thức private chỉ được truy cập trong lớp đó
        student.name = "Nam";
        student.learn();
    }
}
