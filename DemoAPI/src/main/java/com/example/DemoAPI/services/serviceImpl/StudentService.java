package com.example.DemoAPI.services.serviceImpl;

import com.example.DemoAPI.models.Student;
import com.example.DemoAPI.services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@org.springframework.stereotype.Service
public class StudentService implements Service<Student, Long> {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Nguyễn Công Nam", 22, "nam02tl@gmail.com"));
        students.add(new Student(2L, "Đèo Thị Thủy", 22, "thuy@gmail.com"));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Optional<Student> findById(Long id) {

        return students.stream().filter(student -> student.getID().equals(id)).findFirst();
    }


    @Override
    public boolean deleteById(Long id) {
        return students.removeIf(student -> student.getID().equals(id));
    }

    @Override
    public Optional<Student> update(Long id, Student updateStudent) {
        return findById(id).map(student -> {
            student.setName(updateStudent.getName());
            student.setAge(updateStudent.getAge());
            student.setEmail(updateStudent.getEmail());
            return student;
        });
    }

    @Override
    public Student save(Student newStudent) {
        students.add(newStudent);
        return newStudent;
    }
}
