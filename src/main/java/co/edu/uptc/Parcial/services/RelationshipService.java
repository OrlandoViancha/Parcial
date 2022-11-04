package co.edu.uptc.Parcial.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uptc.Parcial.entities.Relationship;
import co.edu.uptc.Parcial.repositories.RelationshipRepository;

@Service
public class RelationshipService {
    

    private RelationshipRepository relationshipRepository;


    public RelationshipService(RelationshipRepository relationshipRepository){

        this.relationshipRepository = relationshipRepository;
    }

    public List<Relationship> getRelationships(){

        return relationshipRepository.findAll();
    }

    public Relationship addRelationship(Relationship relationship){

        return relationshipRepository.save(relationship);
    }
}
