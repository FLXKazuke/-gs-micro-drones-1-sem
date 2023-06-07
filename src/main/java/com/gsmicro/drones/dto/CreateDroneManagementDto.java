package com.gsmicro.drones.dto;

import java.util.Date;

import jakarta.persistence.Column;

public class CreateDroneManagementDto {

	private String droneModel;
	private String serialNumber;
	private String licenseNumber;
	private Date licenseIssuedDate;
	private Date licenseExpiryDate;
	private Long flightHours;
	private Double cargoCapacity;
	private Double batteryCapacity;

	public String getDroneModel() {
		return droneModel;
	}

	public void setDroneModel(String droneModel) {
		this.droneModel = droneModel;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Date getLicenseIssuedDate() {
		return licenseIssuedDate;
	}

	public void setLicenseIssuedDate(Date licenseIssuedDate) {
		this.licenseIssuedDate = licenseIssuedDate;
	}

	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}

	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public Long getFlightHours() {
		return flightHours;
	}

	public void setFlightHours(Long flightHours) {
		this.flightHours = flightHours;
	}

	public Double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(Double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public Double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

}
