package com.piyush.spring.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.*;

import com.piyush.spring.dao.TicketDao;
import com.piyush.spring.dto.Ticket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class TicketServiceImplTest {
	
	@Mock
	private TicketDao dao;
	
	@Autowired  // to let spring create the object
	@InjectMocks  // to let mockito inject mocks into service
	TicketServiceImpl service;
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		Ticket ticket = new Ticket();
		when(dao.createTicket(ticket)).thenReturn(0);
		int result = service.buyTicket("Piyush", "7028910047");
		assertEquals(0, result);
	}

}
