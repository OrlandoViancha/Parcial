package co.edu.uptc.Parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uptc.Parcial.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
