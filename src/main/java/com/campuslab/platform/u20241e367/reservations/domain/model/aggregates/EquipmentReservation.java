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

    public EquipmentReservation(Long id, ReservationCode code, LaboratoryId laboratoryId,
                                ReservationPeriod reservationPeriod, EquipmentBatch equipmentBatch,
                                AccessLevel accessLevel, ReservationEstatus estatus,
                                String reservationsNotes) {
        this.id = id;
        this.code = code;
        this.laboratoryId = laboratoryId;
        this.reservationPeriod = reservationPeriod;
        this.equipmentBatch = equipmentBatch;
        this.accessLevel = accessLevel;
        this.estatus = estatus;
        this.reservationsNotes = reservationsNotes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReservationCode getCode() {
        return code;
    }

    public void setCode(ReservationCode code) {
        this.code = code;
    }

    public LaboratoryId getLaboratoryId() {
        return laboratoryId;
    }

    public void setLaboratoryId(LaboratoryId laboratoryId) {
        this.laboratoryId = laboratoryId;
    }

    public ReservationPeriod getReservationPeriod() {
        return reservationPeriod;
    }

    public void setReservationPeriod(ReservationPeriod reservationPeriod) {
        this.reservationPeriod = reservationPeriod;
    }

    public EquipmentBatch getEquipmentBatch() {
        return equipmentBatch;
    }

    public void setEquipmentBatch(EquipmentBatch equipmentBatch) {
        this.equipmentBatch = equipmentBatch;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public ReservationEstatus getEstatus() {
        return estatus;
    }

    public void setEstatus(ReservationEstatus estatus) {
        this.estatus = estatus;
    }

    public String getReservationsNotes() {
        return reservationsNotes;
    }

    public void setReservationsNotes(String reservationsNotes) {
        this.reservationsNotes = reservationsNotes;
    }
}
