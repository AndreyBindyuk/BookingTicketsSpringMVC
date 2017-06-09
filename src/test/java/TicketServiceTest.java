import exception.TicketsException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import services.ticketsservice.TicketsService;
import services.ticketsservice.impl.TicketsServiceImpl;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class TicketServiceTest {

    @Mock
    private
    TicketsServiceImpl ticketsService;

    @Test
    public void testShouldBookTicket() throws TicketsException {
        when(ticketsService.bookingTickets(1)).thenReturn("ticket has been booked");
        assertEquals("ticket has been booked",ticketsService.bookingTickets(1));
    }

    @Test
    public void testShouldMakeTicketCancellation() throws TicketsException {
        when(ticketsService.ticketsCancellations(1)).thenReturn("ticket has been cancelled");
        assertEquals("ticket has been cancelled",ticketsService.ticketsCancellations(1));
    }
}
