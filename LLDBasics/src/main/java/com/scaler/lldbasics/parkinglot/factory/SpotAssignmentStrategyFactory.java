package com.scaler.lldbasics.parkinglot.factory;

import com.scaler.lldbasics.parkinglot.models.SpotAssignmentStrategyType;
import com.scaler.lldbasics.parkinglot.strategies.CheapestSportAssignmentStrategy;
import com.scaler.lldbasics.parkinglot.strategies.RandomSpotAssignmentStrategy;
import com.scaler.lldbasics.parkinglot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotStrategy (SpotAssignmentStrategyType type) {
        if(type.equals(SpotAssignmentStrategyType.RANDOM)) {
            return new RandomSpotAssignmentStrategy();
        }
        return new CheapestSportAssignmentStrategy();
    }
}
