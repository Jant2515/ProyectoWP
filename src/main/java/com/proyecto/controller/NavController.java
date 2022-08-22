/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ad
 */
@Controller
public class NavController {
    @GetMapping("/home")
    public String index (Model model){
        return "home";
    }
    
    @GetMapping("/computadoras")
    public String index2 (Model model){
        return "computadoras";
    }
    
    @GetMapping("/monitores")
    public String index3 (Model model){
        return "monitores";
    }
    
    @GetMapping("/tarjetas")
    public String index4 (Model model){
        return "tarjetas";
    }
    
    @GetMapping("/nvidia")
    public String index5 (Model model){
        return "nvidia";
    }
    
    @GetMapping("/amd")
    public String index6 (Model model){
        return "amd";
    }
    
    //@GetMapping("/procesador") //ESTA DANDO ERROR NO ACEPTA /PROCESADOR
    //public String index7 (Model model){
      //  return "procesador";
    //}
    
    @GetMapping("/ayuda")
    public String index8 (Model model){
        return "ayuda";
    }
    
    @GetMapping("/descuentos")
    public String index9 (Model model){
        return "descuentos";
    }
    
    @GetMapping("/categorias")
    public String index10 (Model model){
        return "categorias";
    }
}
