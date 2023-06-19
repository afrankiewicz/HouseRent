package com.house.property;

import com.house.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;
    private UserService userService;

    public PropertyService(PropertyRepository propertyRepository, UserService userService) {
        this.propertyRepository = propertyRepository;
        this.userService = userService;
    }

    public PropertyDto addProperty(PropertyDto property, String email) {
        property.setOwner(userService.getUserByEmail(email));
        return propertyRepository.save(property.toModel()).toDto();
    }


}
