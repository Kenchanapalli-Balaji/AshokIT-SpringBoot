package com.ashokIT.rest;

import com.ashokIT.entities.Ticket;
import com.ashokIT.request.Passenger;
import com.ashokIT.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketRestController
{
    @Autowired
    private TicketService ticketService;
    @PostMapping(value="/ticket",consumes = "application/json",produces = "application/json")
    public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger)
    {
       Ticket t= ticketService.bookTicket(passenger);
       return new ResponseEntity<>(t, HttpStatus.CREATED);
    }
    @GetMapping(value ="/ticket/{ticketNum}",produces = "application/json")
    public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNum") Integer ticketNum)
    {
       Ticket t= ticketService.getTicket(ticketNum);
       return new ResponseEntity<>(t,HttpStatus.OK);
    }
    @GetMapping(value="/tickets", produces = "application/json")
    public ResponseEntity<List<Ticket>> getAllTickets()
    {
       List<Ticket> all= ticketService.getAllTickets();
       return new ResponseEntity<>(all,HttpStatus.OK);
    }



}
