package in.groww.bootcamp.parking;

import org.springframework.lang.Nullable;

record VehicleResponse(boolean hasFailed, @Nullable String errorReason, @Nullable Vehicle vehicle) {
    static VehicleResponse success(Vehicle vehicle) {
        return new VehicleResponse(false, null, vehicle);
    }

    static VehicleResponse failed() {
        return new VehicleResponse(true, "Vehicle not found", null);
    }
}
