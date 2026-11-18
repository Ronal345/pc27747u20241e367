package com.campuslab.platform.u20241e367.reservations.application.commandservice;

import com.campuslab.platform.u20241e367.reservations.application.commands.CreateReservationCommand;
import com.campuslab.platform.u20241e367.reservations.domain.model.aggregates.EquipmentReservation;

public interface EquipmentReservationCommandService
{
    EquipmentReservation handle(CreateReservationCommand command);



}
