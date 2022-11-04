package co.edu.uptc.Parcial.entities;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name="matters")

public class Matter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int code;

    @Column(length =45, nullable = false)
    private String description;

    @Column(length =45, nullable = false)
    private String credits;

    @OneToMany(mappedBy = "matter")
    @JsonIgnore
    private List<Relationship> relationship;

    public Matter(List<Relationship> relationship) {
        this.relationship = relationship;
    }

    public Matter(int code, String description, String credits){

        this.code = code;
        this.description = description;
        this.credits = credits;
    }

    public int getCode(){

        return this.code;

    }

    public void setCode(int code){

        this.code=code;
    }
   
    public String getDescription(){
        
        return this.description;
    }

    public void setDescription(String description){

        this.description = description;
    }

    public String getCredits(){

        return this.credits;
    }

    public void setCredits(String credits){
        this.credits = credits;
    }

   
}
