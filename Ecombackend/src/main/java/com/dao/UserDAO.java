package com.dao;

import com.models.User;

public interface UserDAO {

	public void save(User user);
	public void update(User user);
}
