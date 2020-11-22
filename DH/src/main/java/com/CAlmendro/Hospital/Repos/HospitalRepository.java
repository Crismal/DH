package com.CAlmendro.Hospital.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CAlmendro.Hospital.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {

}
