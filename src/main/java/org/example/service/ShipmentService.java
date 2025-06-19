package org.example.service;
import org.example.module.Shipment;
import org.example.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentService(ShipmentRepository repository) {
        this.repository = repository;
    }

    public Shipment createShipment(Shipment shipment) {
        shipment.setStatus(Shipment.Status.CREATED);
        return repository.save(shipment);
    }

    public List<Shipment> getAllShipments() {
        return repository.findAll();
    }

    public Optional<Shipment> getShipmentById(Long id) {
        return repository.findById(id);
    }

    public Shipment updateStatus(Long id, Shipment.Status status) {
        Shipment shipment = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Shipment not found"));
        shipment.setStatus(status);
        return repository.save(shipment);
    }
}