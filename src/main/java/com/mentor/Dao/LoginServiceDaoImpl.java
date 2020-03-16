package com.mentor.Dao;

import com.mentor.model.User;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceDaoImpl implements LoginServiceDao {

    @Autowired
    private SessionFactory  sessionFactory;
    public LoginServiceDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

	public void signUp(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public boolean signIn(String username, String password) {
		
		return false;
	}

		

}
