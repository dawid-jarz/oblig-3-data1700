package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class ticketController {
    @Autowired
    private ticketRepo rep;
    @PostMapping("/save")
    public void saveTicket(tickets inTicket) {
        rep.saveTicket(inTicket);
    }

    @GetMapping("/getAll")
    public List<tickets> getAllTickets() {
        return rep.getAllTickets();
    }
    @GetMapping("/deleteAll")
    public void deleteAll(){
        rep.deleteAllTickets();
    }
}
