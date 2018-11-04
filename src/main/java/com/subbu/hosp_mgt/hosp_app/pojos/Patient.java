package com.subbu.hosp_mgt.hosp_app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private String paddr;
	private Date pdate;
	private String ppno;
	
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getPpno() {
		return ppno;
	}
	public void setPpno(String ppno) {
		this.ppno = ppno;
	}
	
	
	
}
