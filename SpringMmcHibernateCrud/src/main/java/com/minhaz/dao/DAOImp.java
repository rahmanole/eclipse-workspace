package com.minhaz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.minhaz.model.User;

@Repository
public class DAOImp implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);		
	}

	public void update(int id, User user) {
		sessionFactory.getCurrentSession().delete(user);		
		
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.byId(User.class).load(id);
		session.delete(user);
	}

	public List<User> userList() {
		// TODO Auto-generated method stub
		return null;
	}

}
