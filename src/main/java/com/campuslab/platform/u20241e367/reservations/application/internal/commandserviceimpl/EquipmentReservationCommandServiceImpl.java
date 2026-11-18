package com.campuslab.platform.u20241e367.reservations.application.internal.commandserviceimpl;

import com.campuslab.platform.u20241e367.reservations.application.commands.CreateReservationCommand;
import com.campuslab.platform.u20241e367.reservations.application.commandservice.EquipmentReservationCommandService;
import com.campuslab.platform.u20241e367.reservations.domain.model.aggregates.EquipmentReservation;

public class EquipmentReservationCommandServiceImpl implements EquipmentReservationCommandService {
    @Override
    public EquipmentReservation handle(CreateReservationCommand command) {


        return null;
    }
}
