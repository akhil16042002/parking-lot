package in.groww.bootcamp.parking;

import java.time.LocalDateTime;
import java.util.UUID;

record Token(UUID id, Vehicle vehicle, LocalDateTime timestamp) {}
