package dao.ticketsdao.impl;

import configuration.HibernateUtil;
import dao.ticketsdao.TicketsDAO;
import entity.Ticket;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.*;

public class TicketsDAOImpl implements TicketsDAO {

    @Override
    public List<Ticket> getFreeSeatsByFilmId(String filmTitle) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Ticket where filmTitle=" + filmTitle);
            return query.list();
        } finally {
            session.close();
        }
    }

    @Override
    public boolean bookingTickets(int seatNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Ticket ticket = (Ticket) session.get(Ticket.class, seatNumber);
            ticket.setBooked(true);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            return false;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean ticketsCancellations(int seatNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Ticket ticket = (Ticket) session.get(Ticket.class, seatNumber);
            ticket.setBooked(false);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            return false;
        } finally {
            session.close();
        }

    }
}
