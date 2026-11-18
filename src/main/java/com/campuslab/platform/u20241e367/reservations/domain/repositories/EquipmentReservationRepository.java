package com.campuslab.platform.u20241e367.reservations.domain.repositories;

import com.campuslab.platform.u20241e367.reservations.domain.model.aggregates.EquipmentReservation;
import com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects.ReservationCode;

import java.util.List;
import java.util.Optional;

public interface EquipmentReservationRepository {

    Optional<EquipmentReservation> findById(Long id);
    EquipmentReservation save(EquipmentReservation reservation);
    boolean existsById(Long id);
    boolean existsByReservationCode(ReservationCode code);
    Optional<EquipmentReservation> findByLemonadeIdentifier(ReservationCode code);
    List<EquipmentReservation> findAll();

}
