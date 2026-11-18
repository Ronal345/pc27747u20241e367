package com.campuslab.platform.u20241e367.reservations.infrastructure.adapters;

import com.campuslab.platform.u20241e367.reservations.domain.model.aggregates.EquipmentReservation;
import com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects.ReservationCode;
import com.campuslab.platform.u20241e367.reservations.domain.repositories.EquipmentReservationRepository;

import java.util.List;
import java.util.Optional;

public class EquipmentReservationPersistenceAdapter implements EquipmentReservationRepository {
    @Override
    public boolean existsById(Long id) {

        return false;
    }

    @Override
    public Optional<EquipmentReservation> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public EquipmentReservation save(EquipmentReservation reservation) {
        return null;
    }

    @Override
    public boolean existsByReservationCode(ReservationCode code) {
        return false;
    }

    @Override
    public Optional<EquipmentReservation> findByLemonadeIdentifier(ReservationCode code) {
        return Optional.empty();
    }

    @Override
    public List<EquipmentReservation> findAll() {
        return List.of();
    }
}
