package com.subbu.hosp_mgt.hosp_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.hosp_mgt.hosp_app.daos.DoctorDao;
import com.subbu.hosp_mgt.hosp_app.pojos.Doctor;
@Service
public class DoctorService {
	
	@Autowired
	private DoctorDao dao;

	public void save(Doctor d) {
		dao.save(d);
	}

}
