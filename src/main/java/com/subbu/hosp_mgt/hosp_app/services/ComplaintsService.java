package com.subbu.hosp_mgt.hosp_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.hosp_mgt.hosp_app.daos.ComplaintsDao;
import com.subbu.hosp_mgt.hosp_app.pojos.Complaints;
import com.subbu.hosp_mgt.hosp_app.pojos.Medication;

@Service
public class ComplaintsService {
	@Autowired
	private ComplaintsDao dao;
	public void save(Complaints c) {
		List<Medication> me=c.getMedications();
		for (Medication medication : me) {
			medication.setComplaints(c);
		}
		dao.save(c);
	}
}
