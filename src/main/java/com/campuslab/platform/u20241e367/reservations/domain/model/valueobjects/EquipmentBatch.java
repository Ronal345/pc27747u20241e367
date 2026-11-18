package com.campuslab.platform.u20241e367.reservations.domain.model.valueobjects;

public record EquipmentBatch(int quantity, String unit) {
    public EquipmentBatch{
        if(quantity < 0 && unit.isBlank()){
            throw new IllegalArgumentException("quantity should't be 0 and unit aren't blank");
        }
    }

    public EquipmentBatch addUnits(int additionalQuantity){

        EquipmentBatch equipmentBatch = new EquipmentBatch(quantity + additionalQuantity, unit);
        if (additionalQuantity == 0){
            throw new IllegalArgumentException("Aditional quantity should be larger ");
        }
        return new EquipmentBatch(additionalQuantity +1, unit);
    }
}
