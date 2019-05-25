package com.minhaz.services;

import java.util.List;
import com.minhaz.model.User;

public interface UserService {
	public void save(User user);
	public void get(int id);
	public List<User> userList();
	public void update(int id,User user);
	public void delete(int id);
}
