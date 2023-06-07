package com.gsmicro.drones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsmicro.drones.model.FieldTelemetryData;

@Repository()
public interface FieldTelemetryDataRepository extends JpaRepository<FieldTelemetryData, Long> {
	List<FieldTelemetryData> findByDroneId(Long droneId);
}

