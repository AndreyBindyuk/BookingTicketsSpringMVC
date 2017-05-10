package dao.ticketsdao.impl;

import dao.ticketsdao.TicketsDAO;
import entity.Ticket;
import exception.TicketsException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.*;

public class TicketsDAOImpl implements TicketsDAO {
    private static final Map<Integer, Ticket> ticketsMap = new HashMap<Integer, Ticket>();
    private JdbcTemplate jdbcTemplate;

    public TicketsDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    static {
        initMap();
    }

    private static void initMap() {
        Ticket ticket = new Ticket("red", 1, 1000, "Harry Potter and the Philosopher's Stone", false);
        Ticket ticket1 = new Ticket("red", 2, 1000, "Harry Potter and the Philosopher's Stone", false);
        Ticket ticket2 = new Ticket("blue", 3, 1000, "Harry Potter and the Chamber of Secrets", false);
        Ticket ticket3 = new Ticket("blue", 4, 1000, "Harry Potter and the Chamber of Secrets", false);
        Ticket ticket4 = new Ticket("blue", 5, 1000, "Harry Potter and the Chamber of Secrets", false);
        ticketsMap.put(ticket.getSeat(), ticket);
        ticketsMap.put(ticket1.getSeat(), ticket1);
        ticketsMap.put(ticket2.getSeat(), ticket2);
        ticketsMap.put(ticket3.getSeat(), ticket3);
        ticketsMap.put(ticket4.getSeat(), ticket4);
    }

    @Override
    public List<Ticket> getFreeSeatsByFilmId(String filmTitle) {
        List<Ticket> returnTicketsList = new ArrayList<Ticket>();
        Collection<Ticket> tickets = ticketsMap.values();
        for (Ticket ticket : tickets) {
            if (ticket.getFilmTitle().equals(filmTitle) && !ticket.isBooked()) {
                returnTicketsList.add(ticket);
            }
        }
        return returnTicketsList;
    }

    @Override
    public boolean bookingTickets(int seatNumber) throws TicketsException {
        Ticket ticket = ticketsMap.get(seatNumber);
        if (ticket == null) {
            throw new TicketsException("seat number is incorrect");
        }
        ticket.setBooked(true);
        return true;
    }

    @Override
    public boolean ticketsCancellations(int seatNumber) throws TicketsException {
        Ticket ticket = ticketsMap.get(seatNumber);
        if (ticket == null) {
            throw new TicketsException("seat number is incorrect");
        }
        ticket.setBooked(false);
        return true;
    }
}
