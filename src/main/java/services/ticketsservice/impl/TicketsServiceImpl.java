package services.ticketsservice.impl;

import dao.ticketsdao.TicketsDAO;
import dao.ticketsdao.impl.TicketsDAOImpl;
import exception.TicketsException;
import services.ticketsservice.TicketsService;

import java.util.List;

public class TicketsServiceImpl implements TicketsService {
    private TicketsDAO ticketsDAO = new TicketsDAOImpl();

    @Override
    public List getFreeSeatsByFilmId(String filmTitle) throws TicketsException {
        if(ticketsDAO.getFreeSeatsByFilmId(filmTitle).isEmpty()){
            throw new TicketsException("such film is not presented");
        }
        return ticketsDAO.getFreeSeatsByFilmId(filmTitle);
    }

    @Override
    public boolean bookingTickets(int seatNumber) throws TicketsException {
        return ticketsDAO.bookingTickets(seatNumber);
    }

    @Override
    public boolean ticketsCancellations(int seatNumber) throws TicketsException {
        return ticketsDAO.ticketsCancellations(seatNumber);
    }
}
