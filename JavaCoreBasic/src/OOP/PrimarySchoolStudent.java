package OOP;

public class PrimarySchoolStudent extends Student {
    //ghi đè phương thức
    @Override
    public void run() {
        System.out.println("Primary school student is running...");
    }

    //nạp chồng phương thức
    public void run(int i) {
        System.out.println("Primary school student is running at " + i + " km/h");
    }
    public static void main(String[] args) {
        Student student = new PrimarySchoolStudent();//biến của lớp cha tham chiếu đến đối tượng lớp con -> đa hình
        student.sleep();
        student.gender = "Male";//thuộc tính protected của lớp cha
        student.age = 23;//thuộc tính default của lớp cha
        student.eat();
        student.run();
//        student.run(6); Không thể gọi vì lớp cha không có phương thức như vậy
        PrimarySchoolStudent primarySchoolStudent = new PrimarySchoolStudent();
        primarySchoolStudent.run(6);
    }
}
