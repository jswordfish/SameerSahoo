package com.mentor.Dao;

import java.util.List;

import com.mentor.model.Mentor;
import com.mentor.model.TrainingDetails;
import com.mentor.model.User;



public interface UserServiceDao {
	 public void createProfile (User user);
	 Mentor viewMentor (int mentorId);
	 List<Mentor> searchMentor(String technology);
	 Mentor selectMentor(int mentorId);
     boolean sendProposal(int userId,int mentorId);
     boolean assignRating(int rating);
     List<TrainingDetails> viewTrainings(String status);


}
