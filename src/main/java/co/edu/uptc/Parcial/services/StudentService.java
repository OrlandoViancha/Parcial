package co.edu.uptc.Parcial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.edu.uptc.Parcial.entities.Student;
import co.edu.uptc.Parcial.repositories.StudentRepository;
@Service
public class StudentService {


    public StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){

        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        
        return studentRepository.save(student);
    }
    
    public List<Student> getStudents(){

        return studentRepository.findAll();
        
    }

    public Student findStudent(int id){

        Optional<Student> find = studentRepository.findById(id); 

        if(find.isPresent()){
            return find.get();
        }
        return null;
        
    }

    public Student updateStudent(Student student){

        if(findStudent(student.getId())!=null){

            return studentRepository.save(student);
        }
        return null;
    }

    public Student removeStudent(int id){
        
        Student student=findStudent(id);
        if(findStudent(id)!=null){
             studentRepository.delete(student);
        }

        return student;
    }

    
}
