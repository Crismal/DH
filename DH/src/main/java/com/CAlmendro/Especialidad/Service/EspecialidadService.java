package com.CAlmendro.Especialidad.Service;

import java.util.List;

import com.CAlmendro.Especialidad.Especialidad;

public interface EspecialidadService {

	Especialidad saveEspecialidad(Especialidad especialidad);

	Especialidad updateEspecialidad(Especialidad especialidad);

	void deleteEspecialidad(Especialidad especialidad);

	Especialidad getEspecialidadById(Long id);

	List<Especialidad> getAllEspecialidad();
	
}
