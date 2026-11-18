package com.campuslab.platform.u20241e367.reservations.application.commands;

import com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects.*;

public record CreateReservationCommand(
        Long id,
        ReservationCode code,
        LaboratoryId laboratoryId,
        ReservationPeriod reservationPeriod,
        EquipmentBatch equipmentBatch,
        AccessLevel accessLevel,
        ReservationEstatus estatus,
        String reservationsNotes
) {
}
