package com.piyush.dto;

import com.piyush.admin.util.IDGenerator;
import com.piyush.model.User;

public class UserDao {

	public int  create(User user) {
		int id = IDGenerator.generateID();
		// add id to user and save it to database
		return id;
	}
}
