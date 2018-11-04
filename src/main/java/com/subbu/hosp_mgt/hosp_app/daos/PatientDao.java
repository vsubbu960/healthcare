package com.subbu.hosp_mgt.hosp_app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.subbu.hosp_mgt.hosp_app.pojos.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient, Integer>{
	@Query("select p.pname,de.dename,d.dname from Medication md join md.medicine m "
			+ "join md.complaints c "
			+ "join c.visiting v "
			+ "join v.appointment a "
			+ "join a.patient p "
			+ "join c.diseases de "
			+ "join v.doctor d where m.mname=?1")
	public List<Object[]> getPatientInfoByMecineName(String name);
	
	@Query("select p.pname from Complaints c join c.diseases de "
			+ "join c.visiting v join v.appointment ap "
			+ "join ap.patient pt where de.dename=?1")
	public List<Object[]> getPatientByDiseaseName(String name);
	
	@Query("select p.pname from Visiting v join v.doctor dt "
			+ "join v.appointment ap join ap.patient pt where dt.dname=?1")
	public List<Object[]> getPatientByDoctorName(String name);
	
	
}
