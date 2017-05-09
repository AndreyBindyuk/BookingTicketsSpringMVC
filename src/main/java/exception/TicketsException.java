package exception;

import javax.xml.ws.WebFault;

@WebFault(name = "FileFaultException",
        targetNamespace = "http://www.example.com")
public class TicketsException extends Exception {

    public TicketsException(String message) {
        super(message);
    }
}
