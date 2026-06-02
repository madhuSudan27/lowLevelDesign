package com.problems.RideBookingSystem.model;
import com.problems.RideBookingSystem.enums.DriverPreference;
import com.problems.RideBookingSystem.enums.PaymentMethod;
import com.problems.RideBookingSystem.enums.RideType;

import java.time.LocalDateTime;

public class RideRequest {

    // Required
    private final String userId;
    private final String pickupLocation;
    private final String dropLocation;

    // Optional
    private final RideType rideType;
    private final boolean isSurgePricing;
    private final double surgeMultiplier;

    private final PaymentMethod paymentMethod;
    private final String couponCode;

    private final boolean isScheduledRide;
    private final LocalDateTime scheduledTime;

    private final DriverPreference driverPreference;
    private final boolean shareRide;

    // Private constructor
    private RideRequest(Builder builder) {
        this.userId = builder.userId;
        this.pickupLocation = builder.pickupLocation;
        this.dropLocation = builder.dropLocation;

        this.rideType = builder.rideType;
        this.isSurgePricing = builder.isSurgePricing;
        this.surgeMultiplier = builder.surgeMultiplier;

        this.paymentMethod = builder.paymentMethod;
        this.couponCode = builder.couponCode;

        this.isScheduledRide = builder.isScheduledRide;
        this.scheduledTime = builder.scheduledTime;

        this.driverPreference = builder.driverPreference;
        this.shareRide = builder.shareRide;
    }

    // Static Builder class
    public static class Builder {
        // Required
        private String userId;
        private String pickupLocation;
        private String dropLocation;

        // Optional (default values)
        private RideType rideType = RideType.MINI;
        private boolean isSurgePricing = false;
        private double surgeMultiplier = 1.0;

        private PaymentMethod paymentMethod = PaymentMethod.CASH;
        private String couponCode;

        private boolean isScheduledRide = false;
        private LocalDateTime scheduledTime;

        private DriverPreference driverPreference;
        private boolean shareRide = false;

        // Constructor for required fields
        public Builder(String userId, String pickupLocation, String dropLocation) {
            this.userId = userId;
            this.pickupLocation = pickupLocation;
            this.dropLocation = dropLocation;
        }

        public Builder rideType(RideType rideType) {
            this.rideType = rideType;
            return this;
        }

        public Builder surgePricing(double multiplier) {
            this.isSurgePricing = true;
            this.surgeMultiplier = multiplier;
            return this;
        }

        public Builder paymentMethod(PaymentMethod method) {
            this.paymentMethod = method;
            return this;
        }

        public Builder couponCode(String coupon) {
            this.couponCode = coupon;
            return this;
        }

        public Builder scheduleRide(LocalDateTime time) {
            this.isScheduledRide = true;
            this.scheduledTime = time;
            return this;
        }

        public Builder driverPreference(DriverPreference pref) {
            this.driverPreference = pref;
            return this;
        }

        public Builder shareRide(boolean share) {
            this.shareRide = share;
            return this;
        }

        // Build method with validations
        public RideRequest build() {

            // Validation 1
            if (isScheduledRide && scheduledTime == null) {
                throw new IllegalStateException("Scheduled ride must have a time");
            }

            // Validation 2
            if (isSurgePricing && surgeMultiplier <= 1.0) {
                throw new IllegalStateException("Surge multiplier must be > 1");
            }

            // Validation 3
            if (shareRide && rideType == RideType.SUV) {
                throw new IllegalStateException("SUV cannot be shared ride");
            }

            return new RideRequest(this);
        }
    }

    @Override
    public String toString() {
        return "RideRequest{" +
                "userId='" + userId + '\'' +
                ", pickup='" + pickupLocation + '\'' +
                ", drop='" + dropLocation + '\'' +
                ", rideType=" + rideType +
                ", surge=" + isSurgePricing +
                ", multiplier=" + surgeMultiplier +
                ", payment=" + paymentMethod +
                ", coupon='" + couponCode + '\'' +
                ", scheduled=" + isScheduledRide +
                ", time=" + scheduledTime +
                ", driverPref=" + driverPreference +
                ", share=" + shareRide +
                '}';
    }
}

