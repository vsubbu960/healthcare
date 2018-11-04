package com.subbu.hosp_mgt.hosp_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.hosp_mgt.hosp_app.daos.DiseaseDao;
import com.subbu.hosp_mgt.hosp_app.pojos.Disease;
@Service
public class DiseaseService {
	@Autowired
	private DiseaseDao dao;
	
	public void save(Disease d) {
		dao.save(d);
	}

}
