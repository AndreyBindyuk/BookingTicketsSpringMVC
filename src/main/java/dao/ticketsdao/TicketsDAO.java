package dao.ticketsdao;

import entity.Ticket;
import exception.TicketsException;

import java.util.List;

public interface TicketsDAO {
    public List<Ticket> getFreeSeatsByFilmId(String filmTitle);

    public int bookingTickets(int seat);

    public int ticketsCancellations(int seat);
}
