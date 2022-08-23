/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Computadora;
import com.proyecto.repository.ComputadoraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
@Service
public class ComputadoraService implements IComputadoraService {

    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Override
    public List<Computadora> getAllComputadora() {
        return (List<Computadora>) computadoraRepository.findAll();
    }

    @Override
    public Optional<Computadora> get(Long id) {
        return computadoraRepository.findById(id);
    }

    @Override
    public Computadora getComputadoraById(long id) {
        return computadoraRepository.findById(id).orElse(null);
    }

    @Override
    public void saveComputadora(Computadora computadora) {
        computadoraRepository.save(computadora);
    }

    @Override
    public void delete(long id) {
        computadoraRepository.deleteById(id);
    }

}
