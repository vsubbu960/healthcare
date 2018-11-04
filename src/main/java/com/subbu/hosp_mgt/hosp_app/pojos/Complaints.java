package com.subbu.hosp_mgt.hosp_app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="complaints")
public class Complaints {
	@Id
	@GeneratedValue
	private Integer cid;
	private String cname;
	@ManyToOne
	@JoinColumn(name="vid")
	private Visiting visiting;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="complaints")
	private List<Medication> medications;
	@ManyToMany
	@JoinTable(name="cm_ds",joinColumns= {@JoinColumn(name="cid")},inverseJoinColumns= {@JoinColumn(name="deid")})
	private List<Disease> diseases;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Visiting getVisiting() {
		return visiting;
	}
	public void setVisiting(Visiting visiting) {
		this.visiting = visiting;
	}
	public List<Medication> getMedications() {
		return medications;
	}
	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}
	public List<Disease> getDiseases() {
		return diseases;
	}
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}
	
	
}
