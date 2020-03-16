package com.mentor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.Dao.MentorServiceDaoImpl;
import com.mentor.model.Mentor;
import com.mentor.model.User;

@RestController
public class MentorRestController {
	
	@Autowired 
	MentorServiceDaoImpl mentordao;
	
	@PostMapping(value = "/createProfile")
	public ResponseEntity<?> createProfile(@RequestBody Mentor mentor) {
		// TODO Auto-generated method stub
		return null;
	}
    
	@GetMapping("/viewMyProfile/{mentorId}")
	public ResponseEntity<?>viewMyProfile(@PathVariable ("mentorId")int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}
     
	@PutMapping("/updateProfile/{mentorId}")
	public ResponseEntity<?> updateProfile(@PathVariable ("mentorId") int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}
	@PutMapping("/deactivateProfile/{mentorId}")
	public ResponseEntity<?> deactivateProfile( @PathVariable ("mentorId") int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}
	@GetMapping("/viewProposal")
	public ResponseEntity<?>viewProposal() {
		return null;
		// TODO Auto-generated method stub

	}
	@GetMapping("/acceptProposal")
	public ResponseEntity<?> acceptProposal() {
		// TODO Auto-generated method stub
		return null;
	}
}
