package com.example.project.challenge.controller;

import com.example.project.challenge.entity.Bus;
import com.example.project.challenge.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private BusService busService;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Optional<Bus> getBusById(@PathVariable Long id) {
        return busService.getBusById(id);
    }
}
