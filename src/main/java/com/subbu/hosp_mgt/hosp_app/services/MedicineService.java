package com.subbu.hosp_mgt.hosp_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.hosp_mgt.hosp_app.daos.MedicineDao;
import com.subbu.hosp_mgt.hosp_app.pojos.Medicine;
@Service
public class MedicineService {
	@Autowired
	private MedicineDao dao;

	public void save(Medicine m) {
		dao.save(m);
	}

}
