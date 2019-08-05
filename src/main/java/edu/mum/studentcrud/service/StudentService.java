package edu.mum.studentcrud.service;

import edu.mum.studentcrud.domin.Student;
import edu.mum.studentcrud.repository.StudentRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();

    public Student findById(String theId);

    public void deleteById(String stuId);
    public void save(Student stud);



}
