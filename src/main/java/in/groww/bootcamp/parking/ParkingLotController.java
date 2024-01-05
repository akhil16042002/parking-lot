package in.groww.bootcamp.parking;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
class ParkingLotController {
    private final ParkingLot parkingLot = new ParkingLot(3);

    @PostMapping(value = "/park")
    ResponseEntity<TokenResponse> onPark(@RequestBody Vehicle vehicle) {
        Optional<Token> optionalToken = parkingLot.park(vehicle);
        TokenResponse tokenResponse = optionalToken
                .map(TokenResponse::success)
                .orElseGet(TokenResponse::failed);
        return ResponseEntity.ok(tokenResponse);
    }

    @GetMapping(value = "/unpark")
    ResponseEntity<VehicleResponse> onUnpark(@RequestParam UUID tokenId) {
        Optional<Vehicle> optionalVehicle = parkingLot.unPark(tokenId);
        VehicleResponse vehicleResponse = optionalVehicle
                .map(VehicleResponse::success)
                .orElseGet(VehicleResponse::failed);
        return ResponseEntity.ok(vehicleResponse);
    }
}
