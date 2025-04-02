package com.example.project.challenge.service;

import com.example.project.challenge.entity.Bus;
import com.example.project.challenge.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepository;

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Optional<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }
}
