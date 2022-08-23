/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Computadora;
import com.proyecto.entity.Procesador;
import com.proyecto.repository.ProcesadorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
@Service
public class ProcesadorService implements IProcesadorService{
    
    @Autowired
    private ProcesadorRepository procesadorRepository;
    
    @Override
    public List<Procesador> getAllProcesador() {
        return (List<Procesador>)procesadorRepository.findAll();
    }
    @Override
    public Optional<Procesador> get(Long id) {
        return procesadorRepository.findById(id);
    }

    @Override
    public Procesador getProcesadorById(long id) {
        return procesadorRepository.findById(id).orElse(null);
    }

    @Override
    public void saveProcesador(Procesador procesador) {
        procesadorRepository.save(procesador);
    }

    @Override
    public void delete(long id) {
        procesadorRepository.deleteById(id);
    }
}

