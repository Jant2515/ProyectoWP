/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Grafica;
import com.proyecto.repository.GraficaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
@Service
public class GraficaService implements IGraficaService{
    
    @Autowired
    private GraficaRepository graficaRepository;
    
    @Override
    public List<Grafica> getAllGrafica() {
        return (List<Grafica>)graficaRepository.findAll();
    }

    @Override
    public Grafica getGraficaById(long id) {
        return graficaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveGrafica(Grafica grafica) {
        graficaRepository.save(grafica);
    }

    @Override
    public void delete(long id) {
        graficaRepository.deleteById(id);
    }
    
    @Override
    public Grafica findByNombre(String nombre){
        return graficaRepository.findByNombre(nombre);
    }
}

