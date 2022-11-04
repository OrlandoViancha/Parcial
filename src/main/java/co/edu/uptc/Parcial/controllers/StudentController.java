package co.edu.uptc.Parcial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.Parcial.entities.Student;
import co.edu.uptc.Parcial.services.StudentService;


@RestController
@RequestMapping(value = "/student")
public class StudentController{

    private StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService= studentService;
    }

    


    @GetMapping
    public List<Student>getStudents(){

        return studentService.getStudents();
    }

    @PostMapping

    public Student addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }

    @PutMapping(value = "/{id}")
    public Student updateStudent(@PathVariable int id,@RequestBody Student student){

        return studentService.updateStudent(student);
    }

    @DeleteMapping(value="/{id}")

    public Student deleteStudent(@PathVariable int id){

        return studentService.removeStudent(id);
    }

}
