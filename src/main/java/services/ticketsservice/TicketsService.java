package services.ticketsservice;

import entity.Ticket;
import exception.TicketsException;
import org.springframework.stereotype.Component;

import java.util.List;

public interface TicketsService {

    public List<Ticket> getFreeSeatsByFilmId(String filmTitle) throws TicketsException;

    public String bookingTickets(int seatNumber) throws TicketsException;

    public String ticketsCancellations(int seatNumber) throws TicketsException;
}
