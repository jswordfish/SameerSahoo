package com.mentor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TrainingDetails")
public class TrainingDetails {
    @Id
    @Column(name="training_details_id")
    private int trainingDetailsId;

    @Column(name = "status")
    private String status;
    
    @Column(name = "progress")
    private int progress;
    
    @Column(name = "fees")
    private float fees;
    
    @Column(name = "commission_amount")
    private float commissionAmount;
    
    @Column(name = "rating")
    private int rating=0;
    
    @JsonFormat(pattern="MM-dd-yyyy")
    @Column(name = "start_date")
    private Date startDate;
    
    @JsonFormat(pattern="MM-dd-yyyy")
    @Column(name = "end_date")
    private Date endDate;
    
    @JsonFormat(pattern="HH:mm:ss")
    @Column(name = "start_time")
    private Date startTime;
    
    @JsonFormat(pattern="HH:mm:ss")
    @Column(name = "end_time")
    private Date endTime;
    
    @Column(name = "amount_received")
    private float amountReceived;
    
    @Column(name = "user_id")
    private int userId;
    
    @Column(name = "mentor_id")
    private int mentorId;

    @Column(name = "skill_id")
    private int skillId;
    
	public int getTrainingDetailsId() {
		return trainingDetailsId;
	}
	public void setTrainingDetailsId(int trainingDetailsId) {
		this.trainingDetailsId = trainingDetailsId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public float getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public float getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
}
