/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Amd;
import com.proyecto.repository.AmdRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
@Service
public class AmdService implements IAmdService{
    
    @Autowired
    private AmdRepository amdRepository;
    
    @Override
    public List<Amd> getAllAmd() {
        return (List<Amd>)amdRepository.findAll();
    }

    @Override
    public Amd getAmdById(long id) {
        return amdRepository.findById(id).orElse(null);
    }

    @Override
    public void saveAmd(Amd amd) {
        amdRepository.save(amd);
    }

    @Override
    public void delete(long id) {
        amdRepository.deleteById(id);
    }
}

