package com.subbu.hosp_mgt.hosp_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.hosp_mgt.hosp_app.pojos.Appointment;
import com.subbu.hosp_mgt.hosp_app.services.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentCotroller {
	@Autowired
	private AppointmentService serv;
	
	@PostMapping("/save")
	public void save(@RequestBody Appointment a) {
		serv.save(a);
	}
}
