package dao.tests;

import dao.ticketsdao.TicketsDAO;
import entity.Ticket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TicketDaoTest {


    @Mock
    private
    TicketsDAO ticketsDAO;

    @Mock
    private Ticket ticket;

    @Test
    public void testShouldBookTicket(){
        when(ticketsDAO.bookingTickets(ticket.getSeat())).thenReturn(true);
        assertEquals(true,ticketsDAO.bookingTickets(ticket.getSeat()));
    }

    @Test
    public void testShouldMakeTicketCancellation() {
        when(ticketsDAO.ticketsCancellations(ticket.getSeat())).thenReturn(true);
        assertEquals(true,ticketsDAO.ticketsCancellations(ticket.getSeat()));
    }
}
