/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Amd;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josea
 */
public interface IAmdService {
    public List<Amd> getAllAmd();
    public Optional<Amd> get(Long id);
    public Amd getAmdById (long id);
    public void saveAmd(Amd amd);
    public void delete (long id);
}
