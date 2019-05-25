package com.minhaz.dao;

import java.util.List;

import com.minhaz.model.User;

public interface UserDAO {
	public void save(User user);
	public void update(int id,User user);
	public void delete(int id);
	List<User> userList();
}
