package com.CAlmendro.Doctor.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CAlmendro.Doctor.Doctor;
import com.CAlmendro.Doctor.Repos.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository repository;

	private Long idHospital;

	@Override
	public Long getIdHospital() {
		return idHospital;
	}

	@Override
	public void setIdHospital(Long idHospital) {
		this.idHospital = idHospital;
	}

	public DoctorRepository getRepository() {
		return repository;
	}

	public void setRepository(DoctorRepository repository) {
		this.repository = repository;
	}

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return repository.save(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return repository.save(doctor);
	}

	@Override
	public void deleteDoctor(Doctor doctor) {
		repository.delete(doctor);
	}

	@Override
	public Doctor getDoctorById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return repository.findAll();
	}

	@Override
	public List<Doctor> getAllDoctors_idHospital(Long idHospital) {

		List<Doctor> lstDoctores = repository.findAll();

		List<Doctor> lstDoctoresDelHospital = new ArrayList<Doctor>();

		for (Doctor doctor : lstDoctores) {
			if (doctor.getIdHospital() == idHospital) {
				lstDoctoresDelHospital.add(doctor);
			}
		}

		return lstDoctoresDelHospital;
	}

}
