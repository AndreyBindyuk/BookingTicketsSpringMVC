package dao.ticketsdao.impl;

import dao.ticketsdao.TicketsDAO;
import entity.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class TicketsDAOImpl implements TicketsDAO {
    private JdbcTemplate jdbcTemplate;

    public TicketsDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Ticket> getFreeSeatsByFilmId(String filmTitle) {
        String sql = "SELECT * FROM TICKETS WHERE filmtitle=" + filmTitle;
        List<Ticket> tickets = jdbcTemplate.query(sql, new RowMapper<Ticket>() {
            @Override
            public Ticket mapRow(ResultSet resultSet, int i) throws SQLException {
                Ticket ticket = new Ticket();
                ticket.setSeat(resultSet.getInt("seat"));
                ticket.setHallName(resultSet.getString("hallname"));
                ticket.setPrice(resultSet.getInt("price"));
                ticket.setFilmTitle(resultSet.getString("filmtitle"));
                ticket.setBooked(resultSet.getBoolean("isbooked"));
                return ticket;
            }
        });
        return tickets;
    }

    @Override
    public int bookingTickets(int seatNumber) {
        String sql = "UPDATE TICKETS SET isbooked=true WHERE seat=" + seatNumber;
        return jdbcTemplate.update(sql);
    }

    @Override
    public int ticketsCancellations(int seatNumber) {
        String sql = "UPDATE TICKETS SET isbooked=false WHERE seat=" + seatNumber;
        return jdbcTemplate.update(sql);
    }
}
