package in.groww.bootcamp.parking;

import org.springframework.lang.Nullable;

record TokenResponse(boolean hasFailed, @Nullable String errorReason, @Nullable Token token) {
    static TokenResponse success(Token token) {
        return new TokenResponse(false, null, token);
    }

    static TokenResponse failed() {
        return new TokenResponse(true, "Parking lot full", null);
    }
}
