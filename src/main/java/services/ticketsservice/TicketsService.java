package services.ticketsservice;

import entity.Ticket;
import exception.TicketsException;

import java.util.List;

public interface TicketsService {

    public List<Ticket> getFreeSeatsByFilmId(String filmTitle) throws TicketsException;

    public boolean bookingTickets(int seatNumber) throws TicketsException;

    public boolean ticketsCancellations(int seatNumber) throws TicketsException;
}
