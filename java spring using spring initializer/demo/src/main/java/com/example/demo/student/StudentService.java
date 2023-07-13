package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentJpaRepository studentJpaRepository;

    @Autowired
    public StudentService(StudentJpaRepository studentJpaRepository) {
        this.studentJpaRepository = studentJpaRepository;
    }


    public List<Student> getStudent(){

        return studentJpaRepository.findAll();
    }

    public void addNewStudent(Student s){
        studentJpaRepository.save(s);
        System.out.println(s);
    }

    public Student getStudentById(long id){
       return studentJpaRepository.findById(id).orElse(null);
    }
}
