package com.scaler.lld.machinecoding.parkinglot.repositories;

import com.scaler.lld.machinecoding.parkinglot.models.Gate;

import java.util.Optional;

public interface IGateRepository {
    Optional<Gate> findGateById(Long gateId);
}
