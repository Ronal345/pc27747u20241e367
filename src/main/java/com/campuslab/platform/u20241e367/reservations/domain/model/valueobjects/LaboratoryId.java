package com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects;

import java.util.UUID;

public record LaboratoryId(UUID id) {
    public LaboratoryId{
        if(id == null){
            throw new IllegalArgumentException("id cannot be null");
        }
    }
}
