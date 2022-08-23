/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Computadora;
import com.proyecto.entity.Procesador;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josea
 */
public interface IProcesadorService {
    public List<Procesador> getAllProcesador();
    public Optional<Procesador> get(Long id);
    public Procesador getProcesadorById (long id);
    public void saveProcesador(Procesador procesador);
    public void delete (long id);
}
