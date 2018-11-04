package com.subbu.hosp_mgt.hosp_app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medication")
public class Medication {
	@Id
	@GeneratedValue
	private Integer mdid;
	private String mdusage;
	private Integer mdduration;
	private Integer mdquan;
	@ManyToOne
	@JoinColumn(name="mid")
	private Medicine medicine;
	@ManyToOne
	@JoinColumn(name="cid")
	private Complaints complaints;
	
	public Integer getMdid() {
		return mdid;
	}
	public void setMdid(Integer mdid) {
		this.mdid = mdid;
	}
	public String getMdusage() {
		return mdusage;
	}
	public void setMdusage(String mdusage) {
		this.mdusage = mdusage;
	}
	public Integer getMdduration() {
		return mdduration;
	}
	public void setMdduration(Integer mdduration) {
		this.mdduration = mdduration;
	}
	public Integer getMdquan() {
		return mdquan;
	}
	public void setMdquan(Integer mdquan) {
		this.mdquan = mdquan;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public Complaints getComplaints() {
		return complaints;
	}
	public void setComplaints(Complaints complaints) {
		this.complaints = complaints;
	}
	
}
