package com.house.rental;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class RentalDto {

    private Long id;

    @NotNull
    private Date from;

    @NotNull
    private Date until;

    @NotNull
    private Long propertyId;

    private Long tenantId;

    public RentalDto(Long id, Date from, Date until, Long propertyId, Long tenantId) {
        this.id = id;
        this.from = from;
        this.until = until;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
    }

    public RentalModel toModel() {
        return new RentalModel(id, from, until, propertyId, tenantId);
    }

    public Long getId() {
        return id;
    }

    public Date getFrom() {
        return from;
    }

    public Date getUntil() {
        return until;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}
