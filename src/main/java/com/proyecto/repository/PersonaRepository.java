/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.repository;

import com.proyecto.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author josea
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    Persona findByNombre (String nombre);
}
