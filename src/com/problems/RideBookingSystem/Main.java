package com.problems.RideBookingSystem;

import com.problems.RideBookingSystem.enums.DriverPreference;
import com.problems.RideBookingSystem.enums.PaymentMethod;
import com.problems.RideBookingSystem.enums.RideType;
import com.problems.RideBookingSystem.model.RideRequest;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        RideRequest request = new RideRequest.Builder(
                "user1",
                "Delhi",
                "Gurgaon"
        )
                .rideType(RideType.SEDAN)
                .surgePricing(1.5)
                .paymentMethod(PaymentMethod.CARD)
                .couponCode("NEW50")
                .scheduleRide(LocalDateTime.now().plusHours(2))
                .driverPreference(DriverPreference.TOP_RATED)
                .shareRide(true)
                .build();

        System.out.println(request);
    }
}
