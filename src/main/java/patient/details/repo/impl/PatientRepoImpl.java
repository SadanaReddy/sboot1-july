package patient.details.repo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import patient.details.controller.PatientController;
import patient.details.model.Patient;
import patient.details.repo.PatientRepo;

@Repository
public class PatientRepoImpl implements PatientRepo{
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PatientController.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Patient> getAllPatientDetails() {
		log.info("will get the reults from database");
		//List<String> newArray = new ArrayList<>();
		List<Patient>	patientDetails = jdbcTemplate.queryForList("select * from Patient;" , Patient.class);
		log.info("patientDetails" +patientDetails);
		//newArray.add(patientDetails);
		return patientDetails;
	}

}
