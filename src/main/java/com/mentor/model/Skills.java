package com.mentor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Skills")
public class Skills {
    @Id
    @Column(name = "skills_id")
    private int skillsId;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "toc")
    private String toc;
    
    @Column(name = "prerequisites")
    private String prerequisites;
    
	public int getSkillsId() {
		return skillsId;
	}
	public void setSkillsId(int skillsId) {
		this.skillsId = skillsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	
}
