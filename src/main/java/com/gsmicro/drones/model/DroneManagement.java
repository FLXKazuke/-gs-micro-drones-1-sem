package com.gsmicro.drones.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DroneManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "drone_model")
    private String droneModel;
    
    @Column(name = "serial_number")
    private String serialNumber;
    
    @Column(name = "license_number")
    private String licenseNumber;

    @Column(name = "license_issued_date")
    private Date licenseIssuedDate;

    @Column(name = "license_expiry_date")
    private Date licenseExpiryDate;
    
    @Column(name = "flight_hours")
    private Long flightHours;

    @Column(name = "cargo_capacity")
    private Double cargoCapacity;

    @Column(name = "battery_capacity")
    private Double batteryCapacity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
