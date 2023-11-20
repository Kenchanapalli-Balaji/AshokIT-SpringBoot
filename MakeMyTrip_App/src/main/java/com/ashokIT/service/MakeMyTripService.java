package com.ashokIT.service;

import com.ashokIT.request.Passenger;
import com.ashokIT.response.Ticket;

import java.util.List;

public interface MakeMyTripService
{
    public Ticket bookTicket(Passenger passenger);
    public Ticket getTicket(Integer ticketNum);
    public List<Ticket> getAllTickets();
}
