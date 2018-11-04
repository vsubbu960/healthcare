package com.subbu.hosp_mgt.hosp_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.hosp_mgt.hosp_app.pojos.Doctor;
import com.subbu.hosp_mgt.hosp_app.services.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService serv;
	@PostMapping("/save")
	public void save(@RequestBody Doctor d) {
		serv.save(d);
	}
	
}
