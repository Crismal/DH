package com.CAlmendro.Doctor.Repos;
 
import org.springframework.data.jpa.repository.JpaRepository; 

import com.CAlmendro.Doctor.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
 

}
