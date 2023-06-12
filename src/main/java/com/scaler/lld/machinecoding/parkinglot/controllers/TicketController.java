package com.scaler.lld.machinecoding.parkinglot.controllers;

import com.scaler.lld.machinecoding.parkinglot.dtos.GenerateTicketRequestDto;
import com.scaler.lld.machinecoding.parkinglot.dtos.GenerateTicketResponseDto;
import com.scaler.lld.machinecoding.parkinglot.dtos.ResponseStatus;
import com.scaler.lld.machinecoding.parkinglot.exceptions.InvalidGateException;
import com.scaler.lld.machinecoding.parkinglot.exceptions.NoAvailableSpotException;
import com.scaler.lld.machinecoding.parkinglot.models.Gate;
import com.scaler.lld.machinecoding.parkinglot.models.Ticket;
import com.scaler.lld.machinecoding.parkinglot.models.Vehicle;
import com.scaler.lld.machinecoding.parkinglot.models.VehicleType;
import com.scaler.lld.machinecoding.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


//    public  void generateTicket(Vehicle vehicle,
//                                Gate gate) {
//
//    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto request) {
        String vehicleNumber = request.getVehicleNumber();
        VehicleType vehicleType = request.getVehicleType();
        Long gateId = request.getGateId();

        Ticket ticket = new Ticket();
        GenerateTicketResponseDto response = new GenerateTicketResponseDto();

        try {
            ticket = ticketService.generateTicket(
                    gateId, vehicleType, vehicleNumber
            );
        } catch (InvalidGateException e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage("Gate ID is invalid");
            return response;
        } catch (NoAvailableSpotException e) {
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setMessage("No parking spot available");
            return response;
        }

        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicketId(ticket.getId());
        response.setOperatorName(ticket.getOperator().getName());
        response.setSpotNumber(ticket.getParkingSpot().getNumber());

        return response;
    }

}


// public void login(User user) {
//
// }