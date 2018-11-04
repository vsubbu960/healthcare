package com.subbu.hosp_mgt.hosp_app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.subbu.hosp_mgt.hosp_app.pojos.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {

}
