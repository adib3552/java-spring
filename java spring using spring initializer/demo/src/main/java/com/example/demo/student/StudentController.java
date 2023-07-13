package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    //private final StudentService studentService=new StudentService();

    //dependency injection

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> showStudent(){
        return studentService.getStudent();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student s){
        studentService.addNewStudent(s);

    }

    @GetMapping("api/v1/student/{id}")
    public Student showStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }
}
