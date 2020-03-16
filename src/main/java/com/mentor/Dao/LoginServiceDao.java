package com.mentor.Dao;

import com.mentor.model.User;

public interface LoginServiceDao {
	public void signUp(User user);
    public boolean signIn(String username,String password);
}
