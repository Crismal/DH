package com.CAlmendro.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CAlmendro.Hospital.Hospital;
import com.CAlmendro.Hospital.Repos.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	HospitalRepository repository;

	@Override
	public Hospital saveHospital(Hospital hospital) {
		return repository.save(hospital);
	}

	@Override
	public Hospital updateHospital(Hospital hospital) {
		return repository.save(hospital);
	}

	@Override
	public void deleteHospital(Hospital hospital) {
		repository.delete(hospital);
	}

	@Override
	public Hospital getHospitalById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public List<Hospital> getAllHospitals() {
		return repository.findAll();
	}

	public HospitalRepository getRepository() {
		return repository;
	}

	public void setRepository(HospitalRepository repository) {
		this.repository = repository;
	}

}
