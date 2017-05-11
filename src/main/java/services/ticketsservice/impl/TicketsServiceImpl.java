package services.ticketsservice.impl;

import dao.ticketsdao.TicketsDAO;
import entity.Ticket;
import exception.TicketsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.ticketsservice.TicketsService;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketsServiceImpl implements TicketsService {
    @Autowired
    private TicketsDAO ticketsDAO;

    @Override
    public List<Ticket> getFreeSeatsByFilmId(String filmTitle) throws TicketsException {
        List<Ticket> returnTicketsList = new ArrayList<Ticket>();
        if (ticketsDAO.getFreeSeatsByFilmId(filmTitle).isEmpty()) {
            throw new TicketsException("such film is not presented");
        } else
            for (Ticket ticket : ticketsDAO.getFreeSeatsByFilmId(filmTitle)) {
                if (!ticket.isBooked()) {
                    returnTicketsList.add(ticket);
                }
            }
        return returnTicketsList;
    }

    @Override
    public String bookingTickets(int seatNumber) throws TicketsException {
        if (ticketsDAO.bookingTickets(seatNumber) == 1) {
            return "ticket has been booked";
        } else throw new TicketsException("seat number is incorrect");
    }

    @Override
    public String ticketsCancellations(int seatNumber) throws TicketsException {
        if (ticketsDAO.ticketsCancellations(seatNumber) == 1) {
            return "ticket has been cancelled";
        } else throw new TicketsException("seat number is incorrect");
    }
}
