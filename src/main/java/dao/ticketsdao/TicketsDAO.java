package dao.ticketsdao;

import exception.TicketsException;

import java.util.List;

public interface TicketsDAO {
    public List getFreeSeatsByFilmId(String filmTitle);

    public boolean bookingTickets(int seat) throws TicketsException;

    public boolean ticketsCancellations(int seat) throws TicketsException;
}
