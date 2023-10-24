/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team.b.csc.org.airlinereservationsystem.Passangers;

/**
 *
 * @author dev
 */
public class Passanger implements Passanger_Interface {
    private String passengerName; // Name of the passenger.
    private String passengerAge;  // Age of the passenger.
    private String ticketNumber;  // Unique identifier for each passenger's ticket.
    
    @Override
    public void makeReservation() {
    
    }

    @Override
    public void cancelReservation() {

    }

    @Override
    public String getTicketDetails(String PassTicket) {
           // Some Information Retrival From the Database 
        return null;

    }
    
}
