/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;


import com.proyecto.entity.Computadora;
import com.proyecto.service.IComputadoraService;
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
public class ComputadoraController {
    
    @Autowired
    private IComputadoraService computadoraService;
    
    @GetMapping("/computadora")
    public String index (Model model){
        List<Computadora> listaComputadora = computadoraService.getAllComputadora();
        model.addAttribute("titulo","Tabla Computadoras");
        model.addAttribute("computadoras",listaComputadora);
        return "computadoras";
    }
    
    @GetMapping("/computadoraN")
    public String crearComputadora (Model model){
        model.addAttribute("computadora",new Computadora());
        return "crear";
    }
    
    @PostMapping("/saveComputadora")
    public String guardarComputadora (@ModelAttribute Computadora computadora){
        computadoraService.saveComputadora(computadora);
        return "redirect:/computadora";
    }
    
    @GetMapping("/deleteComputadora/{id}") //eliminar elemento
    public String eliminarComputadora (@PathVariable("id") Long idComputadora) {
        computadoraService.delete(idComputadora);
        return "redirect:/computadora";
    }
}
