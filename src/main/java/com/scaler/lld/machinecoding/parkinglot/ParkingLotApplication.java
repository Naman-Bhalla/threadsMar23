package com.scaler.lld.machinecoding.parkinglot;

import com.scaler.lld.machinecoding.parkinglot.controllers.TicketController;
import com.scaler.lld.machinecoding.parkinglot.repositories.GateRepository;
import com.scaler.lld.machinecoding.parkinglot.repositories.ParkingLotRepository;
import com.scaler.lld.machinecoding.parkinglot.repositories.TicketRepository;
import com.scaler.lld.machinecoding.parkinglot.repositories.VehicleRepository;
import com.scaler.lld.machinecoding.parkinglot.services.TicketService;
import com.scaler.lld.machinecoding.parkinglot.strategies.spotassignmentstrategy.RandomSpotAssignmentStrategy;
import com.scaler.lld.machinecoding.parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategy;

public class ParkingLotApplication {

    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        SpotAssignmentStrategy spotAssignmentStrategy = new RandomSpotAssignmentStrategy();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                spotAssignmentStrategy,
                ticketRepository,
                parkingLotRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        System.out.println("Application has started on part :8080");
    }
}
