package com.CAlmendro.Especialidad.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CAlmendro.Especialidad.Especialidad;
import com.CAlmendro.Especialidad.Repos.EspecialidadRepository;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	private EspecialidadRepository repository;
 
	@Override
	public Especialidad saveEspecialidad(Especialidad especialidad) {
		return repository.save(especialidad);
	}

	@Override
	public Especialidad updateEspecialidad(Especialidad especialidad) {
		return repository.save(especialidad);
	}

	@Override
	public void deleteEspecialidad(Especialidad especialidad) {
		repository.delete(especialidad);
	}

	@Override
	public Especialidad getEspecialidadById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public List<Especialidad> getAllEspecialidad() {
		return repository.findAll();
	}
 
}
