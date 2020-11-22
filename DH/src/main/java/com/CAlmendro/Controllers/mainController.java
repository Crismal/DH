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

import com.CAlmendro.Hospital.Hospital;
import com.CAlmendro.Hospital.Service.HospitalService;

@Controller
public class mainController {

	@Autowired
	HospitalService hospitalService;

	@GetMapping("index")
	public String metodoMain(ModelMap modelMap) {

		List<Hospital> lista = hospitalService.getAllHospitals();

		modelMap.addAttribute("hospitales", lista);

		return "Hospital/index";
	}

	@PostMapping("/formularioHospital")
	public String agregarhospital(ModelMap modelMap) {

		modelMap.addAttribute("hospital", new Hospital());

		return "Hospital/formhospital";
	}

	@RequestMapping("/guardarHospital")
	public String agregarHospital(@ModelAttribute("hospital") Hospital hospital, ModelMap modelMap) {

		hospitalService.saveHospital(hospital);

		return "redirect:index";
	}

	@GetMapping("/formularioHospital/{id}")
	public String editarHospital(@PathVariable long id, ModelMap modelMap) {

		Hospital hospital = hospitalService.getHospitalById(id);

		modelMap.addAttribute("hospital", hospital);

		return "Hospital/formhospital";
	}

	@GetMapping("/EliminarHospital/{id}")
	public String eliminarHospital(@PathVariable long id, ModelMap modelMap) {

		Hospital hospital = hospitalService.getHospitalById(id);

		hospitalService.deleteHospital(hospital);

		return "redirect:/index";
	}

}
