package com.subbu.hosp_mgt.hosp_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.hosp_mgt.hosp_app.pojos.Medicine;
import com.subbu.hosp_mgt.hosp_app.services.MedicineService;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
	@Autowired
	private MedicineService serv;
	@PostMapping("/save")
	public void save(@RequestBody Medicine m) {
		serv.save(m);
	}
}
