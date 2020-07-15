package com.sapianos.sapianos.repository;

import com.sapianos.sapianos.models.Delivery;
import com.sapianos.sapianos.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.Map;

public interface DeliveryRepository extends CrudRepository<Delivery, Integer> {

    Map<Integer, Delivery> deliveryMap = new HashMap<>();

    default Delivery edit(Delivery delivery){
        int deliveryId = delivery.getDeliveryId();
        if(deliveryMap.get(deliveryId) != null){
            deliveryMap.put(deliveryId, delivery);
            return deliveryMap.get(deliveryId);
        }
        return null;
    }

}
