package in.groww.bootcamp.parking;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import static java.time.LocalDateTime.now;

class ParkingLot {
    private final int capacity;
    HashMap<UUID, Vehicle> vehicleByTokenId;

    ParkingLot(int capacity) {
        this.capacity = capacity;
        this.vehicleByTokenId = new HashMap<>();
    }

    Optional<Token> park(Vehicle vehicle) {
        if (vehicleByTokenId.size() >= capacity) {
            return Optional.empty();
        }
        Token token = new Token(UUID.randomUUID(), vehicle, now());
        vehicleByTokenId.put(token.id(), vehicle);
        return Optional.of(token);
    }

    Optional<Vehicle> unPark(UUID tokenId) {
        Vehicle removedVehicle = vehicleByTokenId.remove(tokenId);
        return Optional.ofNullable(removedVehicle);
    }
}
