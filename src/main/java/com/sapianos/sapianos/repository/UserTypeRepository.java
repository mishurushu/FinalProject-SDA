package com.sapianos.sapianos.repository;


import com.sapianos.sapianos.models.UserType;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.Map;

public interface UserTypeRepository extends CrudRepository<UserType, Integer> {

    Map<Integer, UserType> userTypeMap = new HashMap<Integer, UserType>();

     default UserType edit(UserType userType){
        int userTypeId = userType.getTypeId();
        if(userTypeMap.get(userTypeId) != null){
            userTypeMap.put(userTypeId, userType);
            return userTypeMap.get(userTypeId);
        }
        return null;
    }

}
