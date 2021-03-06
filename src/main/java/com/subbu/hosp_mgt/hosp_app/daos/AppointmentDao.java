package com.subbu.hosp_mgt.hosp_app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subbu.hosp_mgt.hosp_app.pojos.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
