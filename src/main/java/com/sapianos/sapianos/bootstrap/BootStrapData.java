package com.sapianos.sapianos.bootstrap;

import com.sapianos.sapianos.models.*;
import com.sapianos.sapianos.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final UserTypeRepository userTypeRepository;
    private final UserRepository userRepository;
    private final DeliveryRepository deliveryRepository;
    private final DescriptionRepository descriptionRepository;
    private final ProductRepository productRepository;

    public BootStrapData(UserTypeRepository userTypeRepository, UserRepository userRepository, DeliveryRepository
            deliveryRepository, DescriptionRepository descriptionRepository, ProductRepository productRepository) {
        this.userTypeRepository = userTypeRepository;
        this.userRepository = userRepository;
        this.deliveryRepository = deliveryRepository;
        this.descriptionRepository = descriptionRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        UserType cook = new UserType("cook");
        UserType consumer = new UserType("consumer");
        User user1 = new User("Petre Maius", cook);
        User user2 = new User("Andrei Alexandru", consumer);
        Delivery delivery = new Delivery("Protugalia", "Lisabona","Vanilia",
                4 , 12082020);
        Description description = new Description();
        Product product = new Product("Galuste cu prume",description,22,user1,user2,delivery);
     /*   userTypeRepository.save(cook);
        userTypeRepository.save(consumer);
        userRepository.save(user1);
        userRepository.save(user2);
        deliveryRepository.save(delivery);
        descriptionRepository.save(description);
        productRepository.save(product);

        System.out.println("Count test: " + userTypeRepository.count());
        System.out.println("Count test: " + userRepository.count());
        System.out.println("Count test: " + deliveryRepository.count());
        System.out.println("Count test: " + descriptionRepository.count());
        System.out.println("Count test: " + productRepository.count());*/

    }
}
