package com.subbu.hosp_mgt.hosp_app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue
	private Integer aid;
	private String apurpose;
	private Date adate;
	@ManyToOne
	@JoinColumn(name="pid")
	private Patient patient;
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getApurpose() {
		return apurpose;
	}
	public void setApurpose(String apurpose) {
		this.apurpose = apurpose;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
}
