package com.campuslab.platform.u20241e367.reservations.domain.model.aggregates;

import com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects.*;

public class EquipmentReservation {

    private Long id;
    private ReservationCode code;
    private LaboratoryId laboratoryId;
    private ReservationPeriod reservationPeriod;
    private EquipmentBatch equipmentBatch;
    private AccessLevel accessLevel;
    private ReservationEstatus estatus;
    private String reservationsNotes;



}
