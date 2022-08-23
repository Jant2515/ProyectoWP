/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josea
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    Optional<Persona> findById(Long id);
    public Persona getPersonaById (long id);
    public void savePersona(Persona persona);
    public void delete (long id);
    public Persona findByNombre (String Nombre);
}
