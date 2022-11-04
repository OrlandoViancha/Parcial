package co.edu.uptc.Parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uptc.Parcial.entities.Relationship;

public interface RelationshipRepository extends JpaRepository<Relationship,Integer> {
    
}
