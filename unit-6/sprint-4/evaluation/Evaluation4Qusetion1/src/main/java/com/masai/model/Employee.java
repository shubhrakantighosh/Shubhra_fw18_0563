package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@NotNull(message ="Don't Enter Null.")
	@NotBlank(message = "Don't Enter Space.")
	@Size(min = 3, max = 8)
	private String empName;
	private Integer salary;
	@NotNull(message ="Don't Enter Null.")
	@NotBlank(message = "Don't Enter Space.")
	private String address;
	@Email(message = "Wrong Input")
	private String email;
	@NotNull(message ="Don't Enter Null.")
	@NotBlank(message = "Don't Enter Space.")
	private String mobile;
	
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	public Employee(@NotBlank(message = "Don't Enter Space.") @Size(min = 3, max = 8) Integer empId,
			@NotNull(message = "Don't Enter Null.") @NotBlank(message = "Don't Enter Space.") @Size(min = 3, max = 8) String empName,
			@NotNull(message = "Don't Enter Null.") @NotBlank(message = "Don't Enter Space.") Integer salary,
			@NotNull(message = "Don't Enter Null.") @NotBlank(message = "Don't Enter Space.") String address,
			@NotNull(message = "Don't Enter Null.") @NotBlank(message = "Don't Enter Space.") String email,
			@NotNull(message = "Don't Enter Null.") @NotBlank(message = "Don't Enter Space.") String mobile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}
	
	
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
}
