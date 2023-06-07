package com.gsmicro.drones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsmicro.drones.model.FieldTelemetryData;
import com.gsmicro.drones.service.FieldTelemetryDataService;

@RestController
@RequestMapping("/field-telemetry-data")
public class FieldTelemetryDataController {

	@Autowired()
	private FieldTelemetryDataService fieldTelemetryDataService;

	@GetMapping("/{id}")
	public FieldTelemetryData findById(@PathVariable Long id) {
		return fieldTelemetryDataService.findById(id);
	}

	@GetMapping
	public List<FieldTelemetryData> findAll() {
		return fieldTelemetryDataService.findAll();
	}

	@GetMapping("/drone/{droneId}")
	public List<FieldTelemetryData> findByDroneId(@PathVariable Long droneId) {
		return fieldTelemetryDataService.findByDroneId(droneId);
	}

	@PostMapping
	public FieldTelemetryData create(@RequestBody FieldTelemetryData fieldTelemetryData) {
		return fieldTelemetryDataService.create(fieldTelemetryData);
	}

	@PutMapping("/update")
	public FieldTelemetryData update(@RequestBody FieldTelemetryData fieldTelemetryData) {
		return fieldTelemetryDataService.update(fieldTelemetryData);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		return fieldTelemetryDataService.delete(id);
	}
}
