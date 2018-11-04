package com.subbu.hosp_mgt.hosp_app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue
	private Integer did;
	private String dname;
	private String dspel;
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDspel() {
		return dspel;
	}
	public void setDspel(String dspel) {
		this.dspel = dspel;
	}
	
	
}
