package com.subbu.hosp_mgt.hosp_app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {
	@Id
	@GeneratedValue
	private Integer mid;
	private String mname;
	private String mpurpose;
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpurpose() {
		return mpurpose;
	}
	public void setMpurpose(String mpurpose) {
		this.mpurpose = mpurpose;
	}
	
}
