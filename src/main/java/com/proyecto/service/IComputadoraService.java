/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Computadora;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josea
 */
public interface IComputadoraService {
    public List<Computadora> getAllComputadora();
    public Optional<Computadora> get(Long id);
    public Computadora getComputadoraById (long id);
    public void saveComputadora(Computadora computadora);
    public void delete (long id);
}
