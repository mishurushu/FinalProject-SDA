package com.sapianos.sapianos.repository;

import com.sapianos.sapianos.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.Map;

public interface UserRepository extends CrudRepository<User, Integer> {

    Map<Integer,User > userMap = new HashMap<>();

     default User edit(User user){
         int userId = user.getUserId();
         if(userMap.get(userId) != null){
             userMap.put(userId,user);
             return userMap.get(userId);
         }
         return null;
     }

}
