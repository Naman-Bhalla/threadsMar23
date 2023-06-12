package com.scaler.lld.machinecoding.parkinglot.strategies.spotassignmentstrategy;

import com.scaler.lld.machinecoding.parkinglot.models.Gate;
import com.scaler.lld.machinecoding.parkinglot.models.ParkingLot;
import com.scaler.lld.machinecoding.parkinglot.models.ParkingSpot;
import com.scaler.lld.machinecoding.parkinglot.models.VehicleType;

import java.util.Optional;

public interface SpotAssignmentStrategy {

    Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate);

}
