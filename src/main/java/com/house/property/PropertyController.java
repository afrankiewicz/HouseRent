package com.house.property;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

import static com.house.HouseRentApplication.AUTH_USER_EMAIL;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public PropertyDto addProperty(@Valid @RequestBody PropertyDto property, Principal principal) {
        return propertyService.addProperty(property, AUTH_USER_EMAIL);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeProperty() {
//        propertyService.removeProperty()
    }
}
