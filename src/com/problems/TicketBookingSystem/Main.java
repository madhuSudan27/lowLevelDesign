package com.problems.TicketBookingSystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking.Builder("madhu1", "dhurandher","PVR","3PM",
                List.of(1,2)).build();

        // printing entire object is not a good approach
        System.out.println(booking);
    }
}
