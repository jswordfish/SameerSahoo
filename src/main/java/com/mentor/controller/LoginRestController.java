package com.mentor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.Dao.LoginServiceDao;
import com.mentor.Dao.LoginServiceDaoImpl;
import com.mentor.model.User;

@RestController
public class LoginRestController {
@Autowired
LoginServiceDaoImpl loginservicedao;
	
    @PostMapping(value = "/signUp")
    public ResponseEntity<?>signUp(@RequestBody User user) {
		return null;
		// TODO Auto-generated method stub

	}
    @PutMapping("{userName}/signIn/{password}")
    public ResponseEntity<?>  signIn(@PathVariable ("userName")String username, @PathVariable("password")String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
