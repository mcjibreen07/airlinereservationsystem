/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package team.b.csc.org.airlinereservationsystem.Passangers;

/**
 *
 * @author dev
 */
public interface Passanger_Interface {
   public void makeReservation();  //Reservation of Flight 
   public void cancelReservation(); // Cancel a reservation.
   public String getTicketDetails(String PassTicket);
}
