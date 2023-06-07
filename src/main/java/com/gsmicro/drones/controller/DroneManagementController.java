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

import com.gsmicro.drones.model.DroneManagement;
import com.gsmicro.drones.service.DroneManagementService;


@RestController
@RequestMapping("/drones")
public class DroneManagementController {

	@Autowired()
	private DroneManagementService droneManagementService;

	@GetMapping("/{id}")
	public DroneManagement findById(@PathVariable Long id) {
		return droneManagementService.findById(id);
	}

	@GetMapping
	public List<DroneManagement> findAll() {
		return droneManagementService.findAll();
	}

	@PostMapping
	public DroneManagement create(@RequestBody DroneManagement droneManagement) {
		return droneManagementService.create(droneManagement);
	}

	@PutMapping("/update")
	public DroneManagement update(@RequestBody DroneManagement droneManagement) {
		return droneManagementService.update(droneManagement);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		return droneManagementService.delete(id);
	}
}
