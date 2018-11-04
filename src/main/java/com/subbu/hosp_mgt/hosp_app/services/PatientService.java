package com.subbu.hosp_mgt.hosp_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.hosp_mgt.hosp_app.daos.PatientDao;
import com.subbu.hosp_mgt.hosp_app.pojos.Patient;
@Service
public class PatientService {
	@Autowired
	private PatientDao dao;
	public void save(Patient p) {
		dao.save(p);
	}
	public List<Object[]> getPatientInfoByMedicine(String name){
		return dao.getPatientInfoByMecineName(name);
	}

}
