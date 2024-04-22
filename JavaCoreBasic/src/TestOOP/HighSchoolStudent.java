package TestOOP;

import OOP.Student;

public class HighSchoolStudent extends Student {
    public static void main(String[] args) {
        Student student2 = new HighSchoolStudent();
//        student2.gender = "Female";
//        student2 sẽ không truy cập được thuộc tính, phương thức protected của lớp cha do tính đóng gói

        HighSchoolStudent student = new HighSchoolStudent();

        student.gender = "Male";//truy cập thuộc tính protected từ lớp cha khác package
        student.eat();//truy cập phương thức protected từ lớp cha khác package

        student.run();// phương thức public
        student.address = "Vĩnh Phúc";// thuộc tính public
    }
}
