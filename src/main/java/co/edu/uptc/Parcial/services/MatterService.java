package co.edu.uptc.Parcial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.edu.uptc.Parcial.entities.Matter;
import co.edu.uptc.Parcial.repositories.MatterRepository;

@Service
public class MatterService {

    public MatterRepository matterRepository;

    public MatterService ( MatterRepository matterRepository){

        this.matterRepository = matterRepository;
    }

    public Matter addMatter(Matter matter){

        return matterRepository.save(matter);
    }

    public List<Matter> getMatters(){

        return matterRepository.findAll();
    }

    public Matter findMatter(int id){

        Optional<Matter> find = matterRepository.findById(id); 

        if(find.isPresent()){
            return find.get();
        }
        return null;
        
    }

    public Matter updateMatter(Matter matter){

        if(findMatter(matter.getCode())!=null){

            return matterRepository.save(matter);
        }
        return null;
    }

    public Matter removeMatter(int id){
        
        Matter matter=findMatter(id);
        if(findMatter(id)!=null){
             matterRepository.delete(matter);
        }

        return matter;
    }
    
}
