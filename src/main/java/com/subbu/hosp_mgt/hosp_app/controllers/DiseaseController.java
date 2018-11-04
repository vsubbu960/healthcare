package com.subbu.hosp_mgt.hosp_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.hosp_mgt.hosp_app.pojos.Disease;
import com.subbu.hosp_mgt.hosp_app.services.DiseaseService;

@RestController
@RequestMapping("/disease")
public class DiseaseController {
	@Autowired
	private DiseaseService serv;
	@PostMapping("/save")
	public void save(@RequestBody Disease d) {
		serv.save(d);
	}
	
}
