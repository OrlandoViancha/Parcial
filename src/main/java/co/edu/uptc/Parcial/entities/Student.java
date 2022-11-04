package co.edu.uptc.Parcial.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private int id;

    @Column(length =20, nullable = false)
    private String lastname;

    @Column(length =20, nullable = false)
    private String name;

    @Column(length =20, nullable = false)
    private LocalDate birthday;

    @Column(length =20, nullable = false)
    private String phone;
    
    @OneToMany(mappedBy = "student")
    
    private List<Relationship> relationship;

    public Student(List<Relationship> relationship) {

        this.relationship = relationship;
    }

    public Student(int id,String lastname,String name,LocalDate birthday,String phone) {

        this.id = id;
        this.name=name;
        this.lastname=lastname;
        this.phone=phone;
        this.birthday= birthday;
    }

    public int getId(){

        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getLastName(){
        return this.lastname;

    }
    public void setLastName(String lastname){

        this.lastname= lastname;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        
        this.name=name;

    }

    public LocalDate getBirthday(){

        return this.birthday;
    }

    public void setBirthday(LocalDate birthday){

        this.birthday= birthday;
    }
}
