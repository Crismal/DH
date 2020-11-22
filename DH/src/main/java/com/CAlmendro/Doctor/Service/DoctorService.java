package com.CAlmendro.Doctor.Service;

import java.util.List;

import com.CAlmendro.Doctor.Doctor;

public interface DoctorService {
 
	Doctor saveDoctor(Doctor doctor);

	Doctor updateDoctor(Doctor doctor);

	void deleteDoctor(Doctor doctor);

	Doctor getDoctorById(Long id);

	List<Doctor> getAllDoctors();

	List<Doctor> getAllDoctors_idHospital(Long idHospital);

	void setIdHospital(Long idHospital);

	Long getIdHospital();
	
}
