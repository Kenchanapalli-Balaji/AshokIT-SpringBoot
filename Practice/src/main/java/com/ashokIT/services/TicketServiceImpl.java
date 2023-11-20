package com.ashokIT.services;

import com.ashokIT.entities.Ticket;
import com.ashokIT.repo.TicketRepo;
import com.ashokIT.request.Passenger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService
{
    @Autowired
    public TicketRepo ticketRepo;
    @Override
    public Ticket bookTicket(Passenger passenger)
    {
        Ticket t=new Ticket();
        BeanUtils.copyProperties(passenger,t);
        t.setPrice(100.00);
        t.setTicketStatus("Confirmed");
        t=ticketRepo.save(t);
        return t;
    }

    @Override
    public Ticket getTicket(Integer ticketNum)
    {
      Optional<Ticket> t= ticketRepo.findById(ticketNum);
      if(t.isPresent())
      {
          return t.get();
      }
        return null;
    }
}
