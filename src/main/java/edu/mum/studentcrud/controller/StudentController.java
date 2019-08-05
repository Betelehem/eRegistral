package edu.mum.studentcrud.controller;

import edu.mum.studentcrud.domin.Student;
import edu.mum.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String findAll(){
                List<Student> students = studentService.findAll();
        return "list";
    }
    @GetMapping("students/{studId}")
    public Student getStudent(@PathVariable String studId){
        Student stud=studentService.findById(studId);
        if(stud== null){
             throw new RuntimeException("Strudent Id not found" +studId);
        }
        return stud;
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){

        //student.setId(null);
        studentService.save(student);
        return "newstudent";

    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        studentService.save(student);
        return  "editstudent";
    }

    @DeleteMapping("/students/{studId}")
    public String deleteStudent(@PathVariable String studId) {
        Student student = studentService.findById(studId);
        if (student == null) {
            throw new RuntimeException("Student id not found" );
        }
        studentService.deleteById(studId);
        return "deletestudent";
    }
    }




