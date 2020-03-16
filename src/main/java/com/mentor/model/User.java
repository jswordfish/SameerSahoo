package com.mentor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="user")
public class User {

         @Id
         @Column(name = "user_id")
         private int userId ;

         @Column(name = "user_name")
         private String userName ;
         
         @Column(name = "password")
         private String password ;
         
         @Column(name = "first_name")
         private String firstName ;
         
         @Column(name = "last_name")
         private String lastName ;
         
         @Column(name="contact_number")
         private int contactNumber ;
         
         @Column(name = "role")
         private String role ;
         
         @Column(name = "linkedin_url")
         private String linkedinURL ;
         
         @Column(name = "experience")
         private int experience ;
         
         @Column(name = "active")
         private boolean active =false;
         
         @Column(name = "confirmed_signUp")
         private boolean confirmedSignUp = false;

         @Column(name = "reset_password")
         private boolean resetPassword =false;

         @JsonFormat(pattern="MM-dd-yyyy")
         @Column(name = "reset_password_date")
         private Date resetPasswordDate;

	     public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(int contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getLinkedinURL() {
			return linkedinURL;
		}
		public void setLinkedinURL(String linkedinURL) {
			this.linkedinURL = linkedinURL;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public boolean isConfirmedSignUp() {
			return confirmedSignUp;
		}
		public void setConfirmedSignUp(boolean confirmedSignUp) {
			this.confirmedSignUp = confirmedSignUp;
		}
		public boolean isResetPassword() {
			return resetPassword;
		}
		public void setResetPassword(boolean resetPassword) {
			this.resetPassword = resetPassword;
		}
		public Date getResetPasswordDate() {
			return resetPasswordDate;
		}
		public void setResetPasswordDate(Date resetPasswordDate) {
			this.resetPasswordDate = resetPasswordDate;
		}
}
