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

import com.mentor.Dao.UserServiceDaoImpl;
import com.mentor.model.Mentor;
import com.mentor.model.TrainingDetails;
import com.mentor.model.User;


@RestController
public class UserRestController {
	@Autowired 
	UserServiceDaoImpl userservicedao;
	
	@PostMapping(value = "/createProfile")
	public ResponseEntity<?> createProfile(@RequestBody User user) {
		return null;
		// TODO Auto-generated method stub

	}
    @GetMapping("/viewMentor/{mentorId}")
    public ResponseEntity<?>  viewMentor(@PathVariable ("mentorId") int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}
@GetMapping("/viewMentor/{technology}")
public ResponseEntity<?>  searchMentor(@PathVariable ("technology") String technology) {
		// TODO Auto-generated method stub
		return null;
	}

@PostMapping(value = "/selectMentor")
public ResponseEntity<?>  selectMentor(@PathVariable ("mentorId")int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}
@PutMapping("{userId}/sendProposal/{mentorId}")
public ResponseEntity<?> sendProposal(int userId, int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}
@PutMapping("assignRating/{rating}")
public ResponseEntity<?> assignRating(@PathVariable ("rating")int rating) {
		// TODO Auto-generated method stub
		return null;
	}
@GetMapping("/viewTrainings/{status}")
public ResponseEntity<?>  viewTrainings(@PathVariable ("status")String status) {
		// TODO Auto-generated method stub
		return null;
	}
}
