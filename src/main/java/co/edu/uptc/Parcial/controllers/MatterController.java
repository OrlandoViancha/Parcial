package co.edu.uptc.Parcial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.Parcial.entities.Matter;
import co.edu.uptc.Parcial.services.MatterService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value="/matter")
public class MatterController {

    public MatterService matterService;

    public MatterController(MatterService matterService) {

        this.matterService = matterService;
    }

    @GetMapping

    public List<Matter> getMatters(){
        
        return matterService.getMatters();
    }

    @PostMapping

    public Matter addMatter(@RequestBody Matter matter){

        return matterService.addMatter(matter);
    }

    @PutMapping(value="/{id}")
    public Matter updateMatter(@PathVariable int id, @RequestBody Matter matter) {
        //TODO: process PUT request
        
        return matterService.updateMatter(matter);
    }
    
    @DeleteMapping(value="/{id}")
    public Matter deleteMatter(@PathVariable int id){

        return matterService.removeMatter(id);
    }
}
