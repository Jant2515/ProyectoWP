/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Nvidia;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josea
 */
public interface INvidiaService {
    public List<Nvidia> getAllNvidia();
    public Optional<Nvidia> get(Long id);
    public Nvidia getNvidiaById (long id);
    public void saveNvidia(Nvidia nvidia);
    public void delete (long id);
}
