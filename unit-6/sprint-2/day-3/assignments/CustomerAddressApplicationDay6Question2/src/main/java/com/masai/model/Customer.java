package com.masai.model;

import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String mobileNumber;
	private String email;
	

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state",column = @Column(name = "homeAdderss_state")),
		@AttributeOverride(name = "city",column = @Column(name = "homeAdderss_city")),
		@AttributeOverride(name = "pincode",column = @Column(name = "homeAdderss_pincode")),
	})
	private Address home;
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state",column = @Column(name = "officeAddress_state")),
		@AttributeOverride(name = "city",column = @Column(name = "officeAddress_city")),
		@AttributeOverride(name = "pincode",column = @Column(name = "officeAddress_pincode")),
	})
	private Address office;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Address getOffice() {
		return office;
	}
	public void setOffice(Address office) {
		this.office = office;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, email, home, mobileNumber, name, office);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return cid == other.cid && Objects.equals(email, other.email) && Objects.equals(home, other.home)
				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(name, other.name)
				&& Objects.equals(office, other.office);
	}

	
}
