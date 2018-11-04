package com.subbu.hosp_mgt.hosp_app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="visiting")
public class Visiting {
	@Id
	@GeneratedValue
	private Integer vid;
	private Date vdate;
	@OneToOne
	@JoinColumn(name="aid")
	private Appointment appointment;
	@ManyToOne
	@JoinColumn(name="did")
	private Doctor doctor;
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public Date getVdate() {
		return vdate;
	}
	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
}
