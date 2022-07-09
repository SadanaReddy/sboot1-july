package patient.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import patient.details.model.Patient;
import patient.details.service.PatientService;
@Slf4j

@RestController
public class PatientController {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PatientController.class);

	@Autowired
	private PatientService patientService;

	//get all patient details
	@GetMapping("/getAllPatientDetails")
	public ResponseEntity<?> getPatientDetails() {
		log.info("enter getPatientDetails method");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {
			List<Patient> allPatientDetails = patientService.getAllPatientDetails();
			log.info("patient details:" + allPatientDetails);
			return new ResponseEntity<>(allPatientDetails,headers, HttpStatus.ACCEPTED);

		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>("error",headers, HttpStatus.GONE);
		}
	}
}
