/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team.b.csc.airlinereservationsystem.Flight;

import java.util.Date;

/**
 *
 * @author dev
 */
public class Flight implements Flight_Interface {

    private int flightNumber;   // Unique identifier for each flight.
    private String airlineName; // Name of the airline operating the flight.
    private String sourceAirport;  //Departure airport uses airportCode
    private String destinationAirport; // Arrival airport uses airport Name 
    private Date departureDateTime; // Date and time of departure.
    private Date arrivalDateTime; // Date and time of arrival.
    private int availableSeats; //     Number of available seats on the flight.
    
    
    
    @Override
    public boolean checkAvailability() {
        return true;  //check Availability of Seats
    }

    @Override
    public void bookTicket(String PassangerTicket) {

    }

    @Override
    public void getFlightDetails(int FlightNumber) {

    }

}
