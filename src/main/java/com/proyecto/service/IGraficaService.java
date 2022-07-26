/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Grafica;
import java.util.List;

/**
 *
 * @author josea
 */
public interface IGraficaService {
    public List<Grafica> getAllGrafica();
    public Grafica getGraficaById (long id);
    public void saveGrafica(Grafica grafica);
    public void delete (long id);
    public Grafica findByNombre (String Nombre);
}
