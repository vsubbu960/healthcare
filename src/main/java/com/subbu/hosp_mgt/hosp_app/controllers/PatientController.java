package com.subbu.hosp_mgt.hosp_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.hosp_mgt.hosp_app.pojos.Patient;
import com.subbu.hosp_mgt.hosp_app.services.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService serv;
	@PostMapping("/save")
	public void save(@RequestBody Patient p) {
		serv.save(p);
	}
	@GetMapping("/get/{mname}")
	public List<Object[]> getPatientInfoByMedicine(@PathVariable("mname") String name){
		return serv.getPatientInfoByMedicine(name);
	}
}
