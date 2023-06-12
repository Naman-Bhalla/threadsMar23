package com.scaler.lld.machinecoding.parkinglot.strategies.spotassignmentstrategy;

import com.scaler.lld.machinecoding.parkinglot.models.*;

import java.util.Optional;

public class RandomSpotAssignmentStrategy
implements SpotAssignmentStrategy {

    @Override
    public Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) {
        for (ParkingFloor parkingFloor: parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot: parkingFloor.getParkingSpots()) {
                if (parkingSpot.getSpotStatus().equals(SpotStatus.AVAILABLE) &&
                parkingSpot.getSupportedVehicles().contains(vehicleType)) {
                    return Optional.of(parkingSpot);
                }
            }
        }

        return Optional.empty();
    }
}
