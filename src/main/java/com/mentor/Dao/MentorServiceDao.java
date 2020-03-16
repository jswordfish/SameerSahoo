package com.mentor.Dao;

import java.util.List;

import com.mentor.model.Mentor;

public interface MentorServiceDao {
	Mentor createProfile(Mentor mentor);
	Mentor viewMyProfile( int mentorId);
	Mentor updateProfile(int mentorId);
	Mentor deactivateProfile(int mentorId);
	public void viewProposal();
    boolean acceptProposal();
}
