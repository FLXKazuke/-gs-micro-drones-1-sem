-- Script de inserção para a tabela drone_management
INSERT INTO drone_management(id, drone_model, serial_number, license_number, license_issued_date, license_expiry_date, flight_hours, cargo_capacity, battery_capacity)
VALUES (1, 'Modelo do Drone', '123456', 'LIC123', '2023-01-01', '2024-01-01', 100, 50.5, 70.5);

-- Script de inserção para a tabela field_telemetry_data
INSERT INTO field_telemetry_data(id, latitude, longitude, altitude, speed, direction, time, drone_id)
VALUES (1, 40.7128, 74.0060, 500.5, 200.5, 180, '2023-06-01 14:00:00', 1);
