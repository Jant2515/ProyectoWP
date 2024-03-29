/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Monitor;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josea
 */
public interface IMonitorService {
    public List<Monitor> getAllMonitor();
    public Optional<Monitor> get(Long id);
    public Monitor getMonitorById (long id);
    public void saveMonitor(Monitor monitor);
    public void delete (long id);
}
