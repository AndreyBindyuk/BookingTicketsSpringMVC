package dao.ticketsdao.impl;

import dao.ticketsdao.TicketsDAO;
import entity.Ticket;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Transactional
@Repository
public class TicketsDAOImpl implements TicketsDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ticket> getFreeSeatsByFilmId(String filmTitle) {
        return entityManager.createNamedQuery("get_tickets_by_condition", Ticket.class)
                .setParameter("filmTitle",filmTitle).getResultList();
    }

    @Override
    public boolean bookingTickets(int seatNumber) {
        try {
            Ticket ticket = entityManager.find(Ticket.class, seatNumber);
            ticket.setBooked(true);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }

    @Override
    public boolean ticketsCancellations(int seatNumber) {
        try {
            Ticket ticket = entityManager.find(Ticket.class, seatNumber);
            ticket.setBooked(false);
            return true;
        } catch (HibernateException e) {
            return false;
        }

    }
}
