package com.ashokIT.service;

import com.ashokIT.entities.Ticket;
import com.ashokIT.request.Passenger;

import java.util.List;

public interface TicketService
{
    public Ticket bookTicket(Passenger passenger);
    public Ticket getTicket(Integer ticketNum);
    public List<Ticket> getAllTickets();
}
