package com.sapianos.sapianos.repository;

import com.sapianos.sapianos.models.Description;
import com.sapianos.sapianos.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.Map;

public interface DescriptionRepository extends CrudRepository<Description, Integer> {

    Map<Integer, Description> descriptionMap = new HashMap<>();

    default Description edit(Description description){
        int descriptionId = description.getDescriptionId();
        if(descriptionMap.get(descriptionId) != null){
            descriptionMap.put(descriptionId, description);
            return descriptionMap.get(descriptionId);
        }
        return null;
    }

}
