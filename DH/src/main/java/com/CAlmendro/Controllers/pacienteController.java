package com.CAlmendro.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CAlmendro.Doctor.Doctor;
import com.CAlmendro.Paciente.Paciente;
import com.CAlmendro.Paciente.Service.PacienteService;

@Controller
public class pacienteController {

	@Autowired
	PacienteService pacienteService;

	@GetMapping("/ListaPacientes/{idHospital}")
	public String mostrarPacientes(@PathVariable Long idHospital, ModelMap modelMap) {

		List<Paciente> pacientes = pacienteService.getAllPacientes_idHospital(idHospital);

		modelMap.addAttribute("pacientes", pacientes);

		pacienteService.setIdHospital(idHospital);

		return "Paciente/listPaciente";
	}

	@PostMapping("/formularioPaciente")
	public String mostrarPaciente(ModelMap modelMap) {

		modelMap.addAttribute("paciente", new Paciente());
		return "Paciente/formPaciente";
	}

	@RequestMapping("/agregarPaciente")
	public String agregarPaciente(@ModelAttribute("paciente") Paciente paciente, ModelMap modelMap) {

		paciente.setHospitalIdHospital(pacienteService.getIdHospital());

		pacienteService.savePaciente(paciente);
		return "redirect:/ListaPacientes/" + pacienteService.getIdHospital();
	}
	

	@GetMapping("/eliminarPaciente/{id}")
	public String eliminarPaciente(@PathVariable long id, ModelMap modelMap) {

		Paciente paciente = pacienteService.getPacienteById(id);

		pacienteService.deletePaciente(paciente);

		return "redirect:/ListaPacientes/" + pacienteService.getIdHospital();
	}

}
