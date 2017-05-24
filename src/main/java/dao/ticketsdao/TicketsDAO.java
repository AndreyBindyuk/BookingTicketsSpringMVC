package dao.ticketsdao;

import entity.Ticket;

import java.util.List;

public interface TicketsDAO {
    public List<Ticket> getFreeSeatsByFilmId(String filmTitle);

    public boolean bookingTickets(int seat);

    public boolean ticketsCancellations(int seat);
}
