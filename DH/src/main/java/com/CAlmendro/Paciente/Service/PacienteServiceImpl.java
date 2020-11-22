package com.CAlmendro.Paciente.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CAlmendro.Paciente.Paciente;
import com.CAlmendro.Paciente.Repos.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {

	public Long idHospital;

	@Autowired
	PacienteRepository repository;

	@Override
	public Paciente savePaciente(Paciente Paciente) {
		return repository.save(Paciente);
	}

	@Override
	public Paciente updatePaciente(Paciente Paciente) {
		return repository.save(Paciente);
	}

	@Override
	public void deletePaciente(Paciente Paciente) {
		repository.delete(Paciente);
	}

	@Override
	public Paciente getPacienteById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public List<Paciente> getAllPacientes() {
		return repository.findAll();
	}

	@Override
	public Long getIdHospital() {
		return idHospital;
	}

	@Override
	public void setIdHospital(Long idHospital) {
		this.idHospital = idHospital;
	}

	@Override
	public List<Paciente> getAllPacientes_idHospital(Long idHospital) {
		List<Paciente> lstPacientes = repository.findAll();

		List<Paciente> lstPacientesDelHospital = new ArrayList<Paciente>();

		for (Paciente paciente : lstPacientes) {
			if (paciente.getHospitalIdHospital() == idHospital) {
				lstPacientesDelHospital.add(paciente);
			}
		}

		return lstPacientesDelHospital;
	} 
}
