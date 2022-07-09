package patient.details.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patient.details.controller.PatientController;
import patient.details.model.Patient;
import patient.details.repo.PatientRepo;
import patient.details.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PatientController.class);

	@Autowired
	private PatientRepo patientRepo;
	

	@Override
	public List<Patient> getAllPatientDetails() throws Exception {
		log.info("The request came into getAllPatientDetails service method");
		try {
			List<Patient> patientDetails= patientRepo.getAllPatientDetails();
			log.info("patient details:" + patientDetails);
			return patientDetails;
		}catch(Exception e) {
			e.printStackTrace();
            throw new Exception("No patient details are available");
		}
	}

}
