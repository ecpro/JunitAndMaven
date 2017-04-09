package com.piyush.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.spring.dao.TicketDao;
import com.piyush.spring.dto.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketDao ticketDao;

	public int buyTicket(String name, String phone) {
		
		Ticket ticket = new Ticket();
		ticket.setName(name);
		ticket.setPhone(phone);
		int createdTicket = ticketDao.createTicket(ticket);
		return createdTicket;
	}


}
