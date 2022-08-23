/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.repository;

import com.proyecto.entity.Persona;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author josea
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
    
    Optional<Persona> findByEmail(String email);
    
    Persona findByNombre(String nombre);

    public void deleteById(long id);

    public Object findById(long id);
}
