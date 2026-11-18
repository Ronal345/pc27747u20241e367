package com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects;

public record ReservationCode(String code) {
    public ReservationCode{
        if (code == null) {
            throw new IllegalArgumentException("Reservation code value cannot be null");
        }
    }
}
