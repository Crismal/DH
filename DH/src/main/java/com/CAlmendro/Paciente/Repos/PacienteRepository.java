package com.CAlmendro.Paciente.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CAlmendro.Paciente.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
