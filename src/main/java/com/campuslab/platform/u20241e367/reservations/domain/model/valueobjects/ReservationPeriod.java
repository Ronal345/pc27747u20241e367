package com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects;

import java.time.LocalDate;
import java.util.Objects;

public record ReservationPeriod(LocalDate startDate, LocalDate endDate) {

    public ReservationPeriod {
        Objects.requireNonNull(startDate, "startDate must not be null");
        Objects.requireNonNull(endDate, "endDate must not be null");
        if (!endDate.isAfter(startDate)) {
            throw new IllegalArgumentException("endDate must be after startDate");
        }
    }


    public boolean contains(LocalDate checkDate) {
        if (checkDate == null) {
            throw new IllegalArgumentException("checkDate must not be null");
        }
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("startDate and endDate must not be null");
        }

        return !checkDate.isBefore(startDate) && !checkDate.isAfter(endDate);
    }

}
