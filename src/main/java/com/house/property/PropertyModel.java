package com.house.property;

import com.house.user.UserDto;
import com.house.user.UserModel;
import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class PropertyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private Double pricePerNight;

    @Column(nullable = false)
    private Integer noOfPeople;

    @ManyToOne
    private UserModel owner;

    @ManyToOne
    private UserModel tenant;

    public PropertyModel(Long id, String city, Double pricePerNight, Integer noOfPeople, UserModel owner, UserModel tenant) {
        this.id = id;
        this.city = city;
        this.pricePerNight = pricePerNight;
        this.noOfPeople = noOfPeople;
        this.owner = owner;
        this.tenant = tenant;
    }

    public PropertyDto toDto() {
        UserDto tenant = this.tenant == null ? null : this.tenant.toDto();
        return new PropertyDto(id, city, pricePerNight, noOfPeople, owner.toDto(), tenant);
    }
}
