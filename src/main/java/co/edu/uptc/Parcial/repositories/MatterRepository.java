package co.edu.uptc.Parcial.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uptc.Parcial.entities.Matter;

@Repository
public interface MatterRepository extends JpaRepository<Matter,Integer>{

   
    
}
