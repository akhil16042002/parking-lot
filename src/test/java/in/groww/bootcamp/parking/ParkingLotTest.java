package in.groww.bootcamp.parking;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void expectTokenWhenVehicleIsParked() {
        ParkingLot parkingLot = new ParkingLot(10);
        Optional<Token> optionalToken = parkingLot.park(anyVehicle());
        assertTrue(optionalToken.isPresent());
    }

    @Test
    void expectNoTokenWhenVehicleIsParkedAndCapacityIsFull() {
        ParkingLot parkingLot = new ParkingLot(3);
        parkingLot.park(anyVehicle());
        parkingLot.park(anyVehicle());
        parkingLot.park(anyVehicle());
        Optional<Token> optionalToken = parkingLot.park(anyVehicle());
        assertTrue(optionalToken.isEmpty());
    }

    @Test
    void expectVehicleWhenTokenIsGiven() {
        ParkingLot parkingLot = new ParkingLot(10);
        Optional<Token> optionalToken = parkingLot.park(anyVehicle());
        assertTrue(optionalToken.isPresent());
        Optional<Vehicle> vehicle = parkingLot.unPark(optionalToken.get());
        assertTrue(vehicle.isPresent());
    }

    private Vehicle anyVehicle() {
        return new Vehicle("Skoda Kushaq", "KA05ND0987");
    }
}
