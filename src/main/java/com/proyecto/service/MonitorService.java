/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Monitor;
import com.proyecto.repository.MonitorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
@Service
public class MonitorService implements IMonitorService{
    
    @Autowired
    private MonitorRepository monitorRepository;
    
    @Override
    public List<Monitor> getAllMonitor() {
        return (List<Monitor>)monitorRepository.findAll();
    }

    @Override
    public Monitor getMonitorById(long id) {
        return monitorRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMonitor(Monitor monitor) {
        monitorRepository.save(monitor);
    }

    @Override
    public void delete(long id) {
        monitorRepository.deleteById(id);
    }
}

