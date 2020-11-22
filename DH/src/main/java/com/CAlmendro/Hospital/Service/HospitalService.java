package com.CAlmendro.Hospital.Service;

import java.util.List;

import com.CAlmendro.Hospital.Hospital;
 

public interface HospitalService {

	Hospital saveHospital(Hospital hospital);

	Hospital updateHospital(Hospital hospital);

	void deleteHospital(Hospital hospital);

	Hospital getHospitalById(Long id);

	List<Hospital> getAllHospitals();
	
}
