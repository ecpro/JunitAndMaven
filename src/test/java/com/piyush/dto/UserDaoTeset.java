package com.piyush.dto;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import com.piyush.admin.util.IDGenerator;
import com.piyush.model.User;

import static org.powermock.api.mockito.PowerMockito.*;
import static junit.framework.Assert.*;
import org.powermock.core.classloader.annotations.PrepareForTest;

/**
 * Powermock with mockito requires two additional dependencies powermock api for mockito and powermock module for junit
 * @author eccspro
 *
 */


// since it runs with powermock
@RunWith(PowerMockRunner.class)
// to mock static method inside the IDGenerator Class
@PrepareForTest(IDGenerator.class)
public class UserDaoTeset {
	
	private UserDao userDao;

	@Before
	public void setUp() throws Exception {
		
		userDao = new UserDao();
	}

	@Test
	public void test() {
		
		mockStatic(IDGenerator.class);
		when(IDGenerator.generateID()).thenReturn(4);
		int result = userDao.create(new User());
		assertEquals(4, result);
		verifyStatic();
		
	}

}
