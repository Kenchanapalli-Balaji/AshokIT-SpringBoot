package com.ashokIT.rest;

import com.ashokIT.entities.Ticket;
import com.ashokIT.request.Passenger;
import com.ashokIT.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketRestController
{
    @Autowired
    public TicketService ticketService;

    @PostMapping(value="/ticket", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger)
    {
        return new ResponseEntity<>(ticketService.bookTicket(passenger), HttpStatus.CREATED);
    }
    @GetMapping(value="/ticket/{ticketNum}",produces = "application/json")
    public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNum") Integer ticketNum)
    {
       Ticket t= ticketService.getTicket(ticketNum);
       return new ResponseEntity<>(t,HttpStatus.OK);
    }
}
