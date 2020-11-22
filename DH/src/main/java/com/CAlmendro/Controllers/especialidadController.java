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

import com.CAlmendro.Especialidad.Especialidad;
import com.CAlmendro.Especialidad.Especialidad;
import com.CAlmendro.Especialidad.Service.EspecialidadService;

@Controller
public class especialidadController {

	@Autowired
	EspecialidadService especialidadService;

	@RequestMapping("/ListaEspecialidades")
	public String mostrarListaEspecialidades(ModelMap modelMap) {

		List<Especialidad> especialidades = especialidadService.getAllEspecialidad();
		modelMap.addAttribute("especialidades", especialidades);
		return "Especialidad/listEspecialidad";
	}

	@PostMapping("/formularioEspecialidad")
	public String mostrarEspecialidad(ModelMap modelMap) {
		modelMap.addAttribute("especialidad", new Especialidad());
		return "Especialidad/formEspecialidad";
	}

	@RequestMapping("/agregarEspecialidad")
	public String agregarEspecialidad(@ModelAttribute("especialidad") Especialidad especialidad, ModelMap modelMap) {
		especialidadService.saveEspecialidad(especialidad);
		return "redirect:/ListaEspecialidades";
	}

	@GetMapping("/formularioEspecialidad/{id}")
	public String editarEspecialidad(@PathVariable long id, ModelMap modelMap) {

		Especialidad especialidad = especialidadService.getEspecialidadById(id);

		modelMap.addAttribute("especialidad", especialidad);

		return "Especialidad/formEspecialidad";
	}

	@GetMapping("/eliminarEspecialidad/{id}")
	public String eliminarEspecialidad(@PathVariable long id, ModelMap modelMap) {

		Especialidad especialidad = especialidadService.getEspecialidadById(id);

		especialidadService.deleteEspecialidad(especialidad);

		return "redirect:/ListaEspecialidades";
	}

}
