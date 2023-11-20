package com.ashokIT.controller;

import com.ashokIT.request.Passenger;
import com.ashokIT.response.Ticket;
import com.ashokIT.service.MakeMyTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MakeMyTripController
{
    @Autowired
    public MakeMyTripService makeMyTripService;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("passenger",new Passenger());
        return "index";
    }

    @PostMapping("/ticket")
    public String handleBookTicketBtn(Passenger passenger, Model model)
    {
        Ticket ticket=makeMyTripService.bookTicket(passenger);
        model.addAttribute("ticket",ticket);
        return "view-ticket";
    }
    @GetMapping("/tickets")
    public String viewAllTickets(Model model)
    {
        List<Ticket> tickets=makeMyTripService.getAllTickets();
        model.addAttribute("tickets",tickets);
        return "All-Tickets";
    }

    @GetMapping("/search")
    public String search(Model model)
    {
       model.addAttribute("ticket",new Ticket());
        return "search";
    }

    @PostMapping("/search")
    public String searchTicket(@RequestParam("ticketNum") Integer ticketNum, Model model)
    {
        Ticket ticket=makeMyTripService.getTicket(ticketNum);
        model.addAttribute("ticket",ticket);
        return "search";
    }
}
