package com.mapping.manytomany;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	@Autowired
	private VehicleRepository vehicleRepository;

	@GetMapping
	public List<Vehicle> getAllVehicles() {
		return vehicleRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Vehicle> getVehicleById(@PathVariable("id") int id) {
		return vehicleRepository.findById(id);

	}

	@PostMapping
	public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@PutMapping("/{id}")
	public Vehicle updateVehicle(@PathVariable("id") int id, @RequestBody Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@DeleteMapping("/{id}")
	public void deleteVehicle(@PathVariable("id") int id) {
		vehicleRepository.deleteById(id);
	}
}
