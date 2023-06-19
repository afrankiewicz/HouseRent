package com.house.rental;

import com.house.property.PropertyRepository;
import com.house.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class RentalService {

    private final RentalRepository rentalRepository;
    private final PropertyRepository propertyRepository;
    private final UserService userService;

    public RentalService(RentalRepository rentalRepository, PropertyRepository propertyRepository, UserService userService) {
        this.rentalRepository = rentalRepository;
        this.propertyRepository = propertyRepository;
        this.userService = userService;
    }

    public RentalDto rentProperty(RentalDto rentalDto, String email) {
//        PropertyDto propertyDto = propertyRepository.findById(rentalDto.getPropertyId())
//                .orElseThrow(() -> new BadRequestException(
//                        String.format("Property with id '%s' does not exist.", rentalDto.getPropertyId())))
//                .toDto();
        rentalDto.setTenantId(userService.getUserByEmail(email).getId());

        return rentalRepository.save(rentalDto.toModel()).toDto();
    }
}
