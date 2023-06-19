package com.house.rental;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "rentals")
public class RentalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date from;

    @Column(nullable = false)
    private Date until;

    @Column(nullable = false)
    private Long propertyId;

    @Column(nullable = false)
    private Long tenantId;

    public RentalModel(Long id, Date from, Date until, Long propertyId, Long tenantId) {
        this.id = id;
        this.from = from;
        this.until = until;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
    }

    public RentalDto toDto(){
        return new RentalDto(id, from, until, propertyId, tenantId);
    }
}
