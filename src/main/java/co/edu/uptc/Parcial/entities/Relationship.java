package co.edu.uptc.Parcial.entities;


import javax.persistence.*;


@Entity
@Table(name = "student_has_matter")
public class Relationship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne( fetch = FetchType.LAZY )
    private Student student;

    @ManyToOne( fetch = FetchType.LAZY )
    private Matter matter;

    public Student getStudent() {

        return this.student;
    }

    public void setStudent(Student student) {

        this.student=student;
    }

    public Matter getMatter() {
        return this.matter;
    }

    public void setMatter(Matter matter) {

        this.matter=matter;

    }


    
}   
