package TestOOP;

import OOP.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        //Khác package chỉ truy cập được thuộc tính public
        student.address = "Hà Nội";
    }
}
