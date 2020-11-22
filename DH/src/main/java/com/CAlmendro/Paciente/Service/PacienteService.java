package com.CAlmendro.Paciente.Service;

import java.util.List;

import com.CAlmendro.Doctor.Doctor;
import com.CAlmendro.Paciente.Paciente;

public interface PacienteService {

	Paciente savePaciente(Paciente Paciente);

	Paciente updatePaciente(Paciente Paciente);

	void deletePaciente(Paciente Paciente);

	Paciente getPacienteById(Long id);

	List<Paciente> getAllPacientes();

	List<Paciente> getAllPacientes_idHospital(Long idHospital);

	void setIdHospital(Long idHospital);

	Long getIdHospital();

}
