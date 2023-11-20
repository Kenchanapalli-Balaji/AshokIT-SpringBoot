package com.ashokIT.service;

import com.ashokIT.request.Passenger;
import com.ashokIT.response.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Service
public class MakeMyTripServiceImpl implements  MakeMyTripService
{

    @Override
    public Ticket bookTicket(Passenger passenger)
    {
        String apiurl="http://51.20.52.146:8080/ticket";
        RestTemplate rt=new RestTemplate();
        //sending Post request (apiurl,requestBodyData,responseBodyType)
        ResponseEntity<Ticket> responseEntity=rt.postForEntity(apiurl,passenger, Ticket.class);
        Ticket responseBody=responseEntity.getBody();
        return  responseBody;
    }

    @Override
    public Ticket getTicket(Integer ticketNum)
    {
        String apiurl="http://51.20.52.146:8080/ticket/{ticketNUm}";
        RestTemplate rt=new RestTemplate();
       ResponseEntity<Ticket> forEntity= rt.getForEntity(apiurl, Ticket.class,ticketNum);
      Ticket t= forEntity.getBody();
      return t;
    }

    @Override
    public List<Ticket> getAllTickets()
    {
        String apiurl="http://51.20.52.146:8080/tickets";
        RestTemplate rt=new RestTemplate();
        ResponseEntity<Ticket[]> forEntity= rt.getForEntity(apiurl,Ticket[].class);
        Ticket[] body=forEntity.getBody();
        List<Ticket> tickets=Arrays.asList(body);
        return tickets;
    }
}
