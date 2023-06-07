package com.gsmicro.drones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsmicro.drones.model.DroneManagement;
import com.gsmicro.drones.model.FieldTelemetryData;
import com.gsmicro.drones.repository.FieldTelemetryDataRepository;

import jakarta.persistence.EntityNotFoundException;

@Service()
public class FieldTelemetryDataService {

	@Autowired()
	private FieldTelemetryDataRepository filedTelemetryDataRepository;
	
	public FieldTelemetryData findById(Long id) {
		return this.filedTelemetryDataRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Inventory not found"));
	}

	public List<FieldTelemetryData> findAll() {
		return this.filedTelemetryDataRepository.findAll();
	}
	
	public List<FieldTelemetryData> findByDroneId(Long droneId) {
		return this.filedTelemetryDataRepository.findByDroneId(droneId);
	}

	public FieldTelemetryData create(FieldTelemetryData fieldTelemetryData) {
		return this.filedTelemetryDataRepository.save(fieldTelemetryData);
	}

	public FieldTelemetryData update(FieldTelemetryData fieldTelemetryData) {
		return this.filedTelemetryDataRepository.save(fieldTelemetryData);
	}

	public String delete(Long id) {
		try {
			FieldTelemetryData dataToDelete = this.findById(id);
			this.filedTelemetryDataRepository.delete(dataToDelete);
			return "Análise deletada com sucesso";
		} catch (Exception e) {
			return "Erro ao deletar análise";
		}
	}
}
