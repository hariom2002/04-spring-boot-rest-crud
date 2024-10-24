package com.spring_boot_rest_crud.rest_crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    List<Student> studentList = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> GetStudents(){


        studentList.add(new Student("Hari", "patel"));
        studentList.add(new Student("John ", "Doe"));

        return studentList;

    }

    @GetMapping("/students/{studentId}")
    public Student GetStudents(@PathVariable int studentId){

        if ( (studentId >= studentList.size()) || (studentId < 0) ) {
            throw new StudentNotFoundError("Student id not found - " + studentId);
        }

        return studentList.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentError> handleException(StudentNotFoundError exc) {
        StudentError error = new StudentError();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setError(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }



}
