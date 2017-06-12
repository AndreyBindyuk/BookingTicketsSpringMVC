import dao.ticketsdao.TicketsDAO;
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

    @Test
    public void testShouldBookTicket(){
        when(ticketsDAO.bookingTickets(1)).thenReturn(true);
        assertEquals(true,ticketsDAO.bookingTickets(1));
    }

    @Test
    public void testShouldMakeTicketCancellation() {
        when(ticketsDAO.ticketsCancellations(1)).thenReturn(true);
        assertEquals(true,ticketsDAO.ticketsCancellations(1));
    }
}
