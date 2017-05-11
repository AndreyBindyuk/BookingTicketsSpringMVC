package controller;

import entity.Ticket;
import exception.TicketsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.ticketsservice.TicketsService;
import services.ticketsservice.impl.TicketsServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/tickets")
public class TicketsController {

    @Autowired
    private TicketsService ticketsService;

    @RequestMapping(value = "/freeTickets/", method = RequestMethod.GET)
    public List<Ticket> getFreeSeatsByFilmId(@RequestParam(value = "filmTitle") String filmTitle) throws TicketsException {
        return ticketsService.getFreeSeatsByFilmId(filmTitle);
    }

    @RequestMapping(value = "/bookingTickets/", method = RequestMethod.POST)
    public String bookingTickets(@RequestParam("seatNumber") int seatNumber) throws TicketsException {
        return ticketsService.bookingTickets(seatNumber);
    }

    @RequestMapping(value = "/ticketsCancellations/", method = RequestMethod.POST)
    public String ticketsCancellations(@RequestParam("seatNumber") int seatNumber) throws TicketsException {
        return ticketsService.ticketsCancellations(seatNumber);
    }
}
