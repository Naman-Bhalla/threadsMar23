package com.scaler.lld.machinecoding.parkinglot.repositories;

import com.scaler.lld.machinecoding.parkinglot.models.Gate;

import java.util.Optional;

public class MySQLGateRepository implements IGateRepository {

    @Override
    public Optional<Gate> findGateById(Long gateId) {
        return Optional.empty();
    }
}
