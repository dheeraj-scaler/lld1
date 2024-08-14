package com.scaler.lldbasics.parkinglot.repositories;

import com.scaler.lldbasics.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gateMap = new HashMap<>();

    public Optional<Gate> findGateById(Long gateId) {
        // This method should be responsible for fetching the
        // gate information
        if(gateMap.containsKey(gateId)) {
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }
}
