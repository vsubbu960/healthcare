package com.subbu.hosp_mgt.hosp_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.subbu.hosp_mgt.hosp_app.daos.AppointmentDao;
import com.subbu.hosp_mgt.hosp_app.pojos.Appointment;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao dao;
	public void save(Appointment a) {
		dao.save(a);
	}
}
