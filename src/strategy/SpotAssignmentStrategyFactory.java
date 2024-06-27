package strategy;

import models.SpotAssignmentStrategyType;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotForType(
            SpotAssignmentStrategyType spotAssignmentStrategyType
    ) {
        // TODO: Add if else conditions based on diff strategy types
        return new RandomSpotAssignmentStrategy();
    }
}
