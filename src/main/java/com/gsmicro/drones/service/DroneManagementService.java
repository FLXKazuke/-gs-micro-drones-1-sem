package com.gsmicro.drones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsmicro.drones.dto.CreateDroneManagementDto;
import com.gsmicro.drones.model.DroneManagement;
import com.gsmicro.drones.repository.DroneManagementRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DroneManagementService {

	@Autowired()
	private DroneManagementRepository droneManagementRepository;

	public DroneManagement findById(Long id) {
		return this.droneManagementRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Inventory not found"));
	}

	public List<DroneManagement> findAll() {
		return this.droneManagementRepository.findAll();
	}

	public DroneManagement create(DroneManagement droneManagement) {
		return this.droneManagementRepository.save(droneManagement);
	}

	public DroneManagement update(DroneManagement droneManagement) {
		return this.droneManagementRepository.save(droneManagement);
	}

	public String delete(Long id) {
		try {
			DroneManagement dataToDelete = this.findById(id);
			this.droneManagementRepository.delete(dataToDelete);
			return "Drone deletado com sucesso";
		} catch (Exception e) {
			return "Erro ao deletar drone";
		}
	}
}
