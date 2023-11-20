package com.ashokIT.services;

import com.ashokIT.entities.Ticket;
import com.ashokIT.request.Passenger;

public interface TicketService
{
    public Ticket bookTicket(Passenger passenger);
    public Ticket getTicket(Integer ticketNum);
}
