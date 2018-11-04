package com.subbu.hosp_mgt.hosp_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.subbu.hosp_mgt.hosp_app.daos.VisitingDao;
import com.subbu.hosp_mgt.hosp_app.pojos.Visiting;

@Service
public class VisitingService {
	@Autowired
	private VisitingDao dao;
	public void save(Visiting v) {
		dao.save(v);
	}
}
