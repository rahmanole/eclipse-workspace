package com.minhaz.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhaz.dao.UserDAO;
import com.minhaz.model.User;

@Service
@Transactional
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDAO  userDao;
	
	@Transactional
	public void save(User user) {
		userDao.save(user);
	}

	public void get(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<User> userList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(int id, User user) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		
	}


}
