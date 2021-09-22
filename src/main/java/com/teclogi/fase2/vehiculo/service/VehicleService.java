package com.teclogi.fase2.vehiculo.service;

import com.teclogi.fase2.vehiculo.model.Vehicle;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface VehicleService {
    public Vehicle createVehicle(Vehicle vehicle) throws IOException;
}
