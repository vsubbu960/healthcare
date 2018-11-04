package com.subbu.hosp_mgt.hosp_app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disease")
public class Disease {
	@Id
	@GeneratedValue
	private Integer deid;
	private String dename;
	private String dedesc;
	
	public Integer getDeid() {
		return deid;
	}
	public void setDeid(Integer deid) {
		this.deid = deid;
	}
	public String getDename() {
		return dename;
	}
	public void setDename(String dename) {
		this.dename = dename;
	}
	public String getDedesc() {
		return dedesc;
	}
	public void setDedesc(String dedesc) {
		this.dedesc = dedesc;
	}
	
}
