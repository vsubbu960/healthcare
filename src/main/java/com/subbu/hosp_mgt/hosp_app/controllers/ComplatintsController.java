package com.subbu.hosp_mgt.hosp_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.hosp_mgt.hosp_app.pojos.Complaints;
import com.subbu.hosp_mgt.hosp_app.services.ComplaintsService;

@RestController
@RequestMapping("/complaints")
public class ComplatintsController {
	@Autowired
	private ComplaintsService serv;
	@PostMapping("/save")
	public void save(@RequestBody Complaints c) {
		serv.save(c);
	}
}
