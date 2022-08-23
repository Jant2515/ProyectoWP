/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Nvidia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.repository.NvidiaRepository;

/**
 *
 * @author josea
 */
@Service
public class NvidiaService implements INvidiaService{
    
    @Autowired
    private NvidiaRepository nvidiaRepository;
    
    @Override
    public List<Nvidia> getAllNvidia() {
        return (List<Nvidia>)nvidiaRepository.findAll();
    }

    @Override
    public Nvidia getNvidiaById(long id) {
        return nvidiaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveNvidia(Nvidia nvidia) {
        nvidiaRepository.save(nvidia);
    }

    @Override
    public void delete(long id) {
        nvidiaRepository.deleteById(id);
    }
}

