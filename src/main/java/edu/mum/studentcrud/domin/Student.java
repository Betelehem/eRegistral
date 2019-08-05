package edu.mum.studentcrud.domin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    @Column(name="stud_id")
    String studentId;
    @Column(name="stud_num")
    String studentNumber;
    @Column(name="first_name")
    String firstname;
    @Column(name="middle_name")
    String middlename;
    @Column(name="last_name")
    String lastname;
    @Column(name="stud_gpa")
    double cgpa;
    @Column(name="enrollment_Date")
    String enrolnmentDate;
    @Column(name="is_International")
    String isInternational;

    public Student(){

    }

    public Student(String studentId, String studentNumber, String firstname, String middlename, String lastname, double cgpa, String enrolnmentDate, String isInternational) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.cgpa = cgpa;
        this.enrolnmentDate = enrolnmentDate;
        this.isInternational = isInternational;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getEnrolnmentDate() {
        return enrolnmentDate;
    }

    public void setEnrolnmentDate(String enrolnmentDate) {
        this.enrolnmentDate = enrolnmentDate;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }
}
