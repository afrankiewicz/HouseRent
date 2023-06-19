package com.house.property;

import com.house.user.UserDto;
import com.house.user.UserModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class PropertyDto {

    private Long id;

    @NotBlank(message = "Location must be provided")
    private String city;

    @NotNull(message = "Price of the property must be provided")
    private Double pricePerNight;

    @NotNull(message = "Size of the property must be provided")
    private Integer noOfPeople;

    private UserDto owner;

    private UserDto tenant;

    public PropertyDto(Long id, String city, Double pricePerNight, Integer noOfPeople, UserDto owner, UserDto tenant) {
        this.id = id;
        this.city = city;
        this.pricePerNight = pricePerNight;
        this.noOfPeople = noOfPeople;
        this.owner = owner;
        this.tenant = tenant;
    }

    public PropertyModel toModel() {
        UserModel tenant = this.tenant == null ? null : this.tenant.toModel();
        return new PropertyModel(id, city, pricePerNight, noOfPeople, owner.toModel(), tenant);
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }

    public Integer getNoOfPeople() {
        return noOfPeople;
    }

    public UserDto getOwner() {
        return owner;
    }

    public UserDto getTenant() {
        return tenant;
    }

    public void setOwner(UserDto owner) {
        this.owner = owner;
    }

    public void setTenant(UserDto tenant) {
        this.tenant = tenant;
    }
}
