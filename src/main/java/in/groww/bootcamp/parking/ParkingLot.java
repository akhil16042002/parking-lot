package in.groww.bootcamp.parking;

import java.util.HashMap;
import java.util.Optional;

class ParkingLot {
    private final int capacity;
    HashMap<Token, Vehicle> tokenToVehicle;

    ParkingLot(int capacity) {
        this.capacity = capacity;
        this.tokenToVehicle = new HashMap<>();
    }

    Optional<Token> park(Vehicle vehicle) {
        if (tokenToVehicle.size() >= capacity) {
            return Optional.empty();
        }
        Token token = new Token() {};
        tokenToVehicle.put(token, vehicle);
        return Optional.of(token);
    }

    Optional<Vehicle> unPark(Token token) {
        Vehicle removedVehicle = tokenToVehicle.remove(token);
        return Optional.of(removedVehicle);
    }
}
