/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package team.b.csc.airlinereservationsystem.Flight;

/**
 *
 * @author dev 
 */
public interface Flight_Interface {
   
public boolean checkAvailability();   //  Check the availability of seats.
public void bookTicket(String PassangerTicket); // Reserve a seat for a passenger.
public void getFlightDetails(int FlightNumber); // Retrieve flight information.

}
