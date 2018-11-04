package com.subbu.hosp_mgt.hosp_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.hosp_mgt.hosp_app.pojos.Visiting;
import com.subbu.hosp_mgt.hosp_app.services.VisitingService;

@RestController
@RequestMapping("/visiting")
public class VisitingCotroller {
	@Autowired
	private VisitingService serv;
	@PostMapping("/save")
	public void save(@RequestBody Visiting v) {
		serv.save(v);
	}
	
}
