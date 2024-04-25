package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ticketRepo {

    @Autowired
    private JdbcTemplate db;

    public void saveTicket(tickets inTicket){
        String sql = "INSERT INTO tickets (movie, name, sname, quantity, email, nmb) VALUES(?,?,?,?,?,?)";
        db.update(sql, inTicket.getMovie(), inTicket.getName(), inTicket.getSname(), inTicket.getQuantity(), inTicket.getEmail(), inTicket.getNmb());
    }

    public List<tickets> getAllTickets(){
        String sql = "SELECT * FROM tickets";
        List<tickets> allTickets = db.query(sql,new BeanPropertyRowMapper<>(tickets.class));
        return allTickets;
    }

    public void deleteAllTickets(){
        String sql = "DELETE FROM tickets";
        db.update(sql);
    }
}
