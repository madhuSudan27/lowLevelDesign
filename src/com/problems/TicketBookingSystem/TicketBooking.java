package com.problems.TicketBookingSystem;


import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

public class TicketBooking {
    private final String userId;
    private final String movieName;
    private final String theatreName;
    private final String showTime;
    private final List<Integer> selectedSeat;

    private final PaymentMethod paymentMethod;
    private final Double totalPrice;
    private final boolean isFoodIncluded;
    private final List<String> foodItems;
    private final String couponCode;
    private final boolean isPremiumBooking;
    private final Integer bookingId;

    // private constructor
    private TicketBooking(Builder builder){
        this.userId = builder.userId;
        this.movieName = builder.movieName;
        this.theatreName = builder.theatreName;
        this.showTime = builder.showTime;
        this.selectedSeat = List.copyOf(builder.selectedSeat);
        this.paymentMethod = builder.paymentMethod;
        this.totalPrice = builder.totalPrice;
        this.isFoodIncluded = builder.isFoodIncluded;
        this.foodItems = builder.foodItems == null ? null : List.copyOf(builder.foodItems);
        this.couponCode = builder.couponCode;
        this.isPremiumBooking = builder.isPremiumBooking;
        this.bookingId = builder.bookingId;
    }

    public static class Builder{
        // Required
        private String userId;
        private String movieName;
        private String theatreName;
        private String showTime;
        private List<Integer> selectedSeat;

        // optional
        private PaymentMethod paymentMethod = PaymentMethod.CASH;
        private Double totalPrice;
        private boolean isFoodIncluded = false;
        private List<String> foodItems;
        private String couponCode;
        private boolean isPremiumBooking = false;
        private Integer bookingId;

        public Builder(String userId, String movieName, String theatreName, String showTime, List<Integer> selectedSeat){
            this.userId = userId;
            this.movieName = movieName;
            this.theatreName = theatreName;
            this.showTime = showTime;
            this.selectedSeat = new ArrayList<>(selectedSeat); // defensive copy
        }



        public Builder paymentMethod(PaymentMethod method){
            this.paymentMethod = method;
            return this;
        }
        public Builder totalPrice(Double totalPrice){
            this.totalPrice = totalPrice;
            return this;
        }
        public Builder includeFood( boolean isFoodIncluded){
            this.isFoodIncluded = isFoodIncluded;
            return this;
        }
        public Builder foodItems(List<String> foodItems){
            this.foodItems = new ArrayList<>(foodItems); // defencive copy
            return this;
        }

        public Builder couponCode(String couponCode){
            this.couponCode = couponCode;
            return  this;
        }

        public Builder premiumBooking(boolean isPremiumBooking){
            this.isPremiumBooking = isPremiumBooking;
            return this;
        }
        public Builder bookingId(Integer bookingId){
            this.bookingId = bookingId;
            return this;
        }


        public TicketBooking build(){
            // we can add some validation logic here

            if (selectedSeat == null || selectedSeat.isEmpty()) {
                throw new IllegalStateException("At least one seat must be selected");
            }

            if (totalPrice == null || totalPrice <= 0) {
                throw new IllegalStateException("Total price must be greater than 0");
            }

            if (isFoodIncluded && (foodItems == null || foodItems.isEmpty())) {
                throw new IllegalStateException("Food items must be added if food is included");
            }

            return new TicketBooking(this);
        }

    }

    @Override
    public String toString() {
        return "TicketBooking{" +
                "userId='" + userId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", theatreName='" + theatreName + '\'' +
                ", showTime='" + showTime + '\'' +
                ", selectedSeat=" + selectedSeat +
                ", paymentMethod=" + paymentMethod +
                ", totalPrice=" + totalPrice +
                ", isFoodIncluded=" + isFoodIncluded +
                ", foodItems=" + foodItems +
                ", couponCode='" + couponCode + '\'' +
                ", isPremiumBooking=" + isPremiumBooking +
                ", bookingId=" + bookingId +
                '}';
    }
}
