package com.masai.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collegeId;
	private String collegeName;
	private String collegeAddress;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "college")
	private Set<Student>students=new HashSet<>();
	
	
	@Override
	public int hashCode() {
		return Objects.hash(collegeAddress, collegeId, collegeName, students);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		College other = (College) obj;
		return Objects.equals(collegeAddress, other.collegeAddress) && collegeId == other.collegeId
				&& Objects.equals(collegeName, other.collegeName) && Objects.equals(students, other.students);
	}
	
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
	
	
	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
				+ ", students=" + students + "]";
	}

	
}
