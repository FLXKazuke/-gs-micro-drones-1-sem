package com.gsmicro.drones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsmicro.drones.model.DroneManagement;

@Repository()
public interface DroneManagementRepository extends JpaRepository<DroneManagement, Long> {

}
