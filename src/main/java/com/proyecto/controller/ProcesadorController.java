/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Procesador;
import com.proyecto.service.IProcesadorService;
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
public class ProcesadorController {
    
    @Autowired
    private IProcesadorService procesadorService;
    
    @GetMapping("/procesador")
    public String index (Model model){
        List<Procesador> listaProcesador = procesadorService.getAllProcesador();
        model.addAttribute("titulo","Tabla Procesador");
        model.addAttribute("procesadores",listaProcesador);
        return "procesadores";
    }
    
    @GetMapping("/procesadorN")
    public String crearProcesador (Model model){
        model.addAttribute("procesador",new Procesador());
        return "crear";
    }
    
    @PostMapping("/saveProcesador")
    public String guardarProcesador (@ModelAttribute Procesador procesador){
        procesadorService.saveProcesador(procesador);
        return "redirect:/procesador";
    }
    
    @GetMapping("/deleteProcesador/{id}") //eliminar elemento
    public String eliminarProcesador (@PathVariable("id") Long idProcesador) {
        procesadorService.delete(idProcesador);
        return "redirect:/procesador";
    }
}
