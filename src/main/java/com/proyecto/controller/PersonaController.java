/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Persona;
import com.proyecto.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author josea
 */
@Controller
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/persona")
    public String index (Model model){
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("personas",listaPersona);
        return "personas";
    }
    
    @GetMapping("/personaN")
    public String crearPersona (Model model){
        model.addAttribute("persona",new Persona());
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPersona (@ModelAttribute Persona persona){
        personaService.savePersona(persona);
        return "redirect:/persona";
    }
    
    @GetMapping("/editPersona/{id}")
    public String editarPersona (@PathVariable("id")Long idPersona, Model model){
        Persona persona = personaService.getPersonaById(idPersona);
        model.addAttribute("persona",persona);
        return "crear";
    }
    
    @GetMapping("/delete/{id}") //eliminar elemento
    public String eliminarPersona (@PathVariable("id") Long idPersona) {
        personaService.delete(idPersona);
        return "redirect:/persona";
    }
}
