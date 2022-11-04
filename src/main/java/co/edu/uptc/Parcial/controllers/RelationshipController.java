package co.edu.uptc.Parcial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.Parcial.entities.Relationship;
import co.edu.uptc.Parcial.services.RelationshipService;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping(value = "/relationship")
public class RelationshipController {

    private RelationshipService relationshipService;

    public RelationshipController(RelationshipService relationshipService){

        this.relationshipService = relationshipService;
    }

    
    @GetMapping
    public List<Relationship> getRelationships(@RequestBody Relationship relationship) {
        return relationshipService.getRelationships();
    }

    @PostMapping
    public Relationship addRelationship(@RequestBody Relationship relationship) {
        return relationshipService.addRelationship(relationship);
    }
    
    
    
}
