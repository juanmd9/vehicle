package com.teclogi.fase2.vehiculo.controller;

import com.teclogi.fase2.vehiculo.model.Vehicle;
import com.teclogi.fase2.vehiculo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    /**
     * This method allows to create a vehicle from a POST request.
     * @param vehicle The information for the new vehicle.
     * @return Status and the new vehicle in case of success.
     */
    @PostMapping
    public ResponseEntity<?> createVehicle(@RequestBody Vehicle vehicle) {
        try {
            return new ResponseEntity<>(vehicleService.createVehicle(vehicle), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("AN ERROR OCCURRED, TRY AGAIN", HttpStatus.BAD_REQUEST);
        }
    }
}
