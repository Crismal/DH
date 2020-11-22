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
import com.CAlmendro.Doctor.Service.DoctorService;
import com.CAlmendro.Hospital.Hospital;

@Controller
public class doctorController {

	@Autowired
	DoctorService doctorService;

	@RequestMapping("/agregarDoctor")
	public String agregarDoctor(@ModelAttribute("doctor") Doctor doctor, ModelMap modelMap) {

		doctor.setIdHospital(doctorService.getIdHospital());
		
		doctorService.saveDoctor(doctor);
		return "redirect:/ListaDoctores/" + doctorService.getIdHospital();
	}

	@GetMapping("/ListaDoctores/{idHospital}")
	public String mostrarDoctor(@PathVariable Long idHospital, ModelMap modelMap) {

		List<Doctor> doctores = doctorService.getAllDoctors_idHospital(idHospital);

		modelMap.addAttribute("doctores", doctores);

		doctorService.setIdHospital(idHospital);

		return "Doctor/listDoctor";
	}

	@PostMapping("/formularioDoctor")
	public String mostrarDoctor(ModelMap modelMap) {

		modelMap.addAttribute("doctor", new Doctor());
		return "Doctor/formDoctor";
	}

	@GetMapping("/formularioDoctor/{id}")
	public String editarDoctor(@PathVariable long id, ModelMap modelMap) {

		Doctor doctor = doctorService.getDoctorById(id);

		modelMap.addAttribute("doctor", doctor);

		return "Doctor/formDoctor";
	}

	@GetMapping("/eliminarDoctor/{id}")
	public String eliminarDoctor(@PathVariable long id, ModelMap modelMap) {

		Doctor doctor = doctorService.getDoctorById(id);

		doctorService.deleteDoctor(doctor);

		return "redirect:/ListaDoctores/" + doctorService.getIdHospital();
	}

}
