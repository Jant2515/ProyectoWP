/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Grafica;
import com.proyecto.entity.TipoG;
import com.proyecto.service.IGraficaService;
import com.proyecto.service.ITipoGService;
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
public class GraficaController {
    
    @Autowired
    private IGraficaService graficaService;
    
    @Autowired
    private ITipoGService tipoGService;
    
    @GetMapping("/grafica")
    public String index (Model model){
        List<Grafica> listaGrafica = graficaService.getAllGrafica();
        model.addAttribute("titulo","Tabla Graficas");
        model.addAttribute("graficas",listaGrafica);
        return "graficas";
    }
    
    @GetMapping("/graficaN")
    public String crearGrafica (Model model){
        List<TipoG> listaTipoG = tipoGService.listTipoG();
        model.addAttribute("grafica",new Grafica());
        model.addAttribute("tipog",listaTipoG);
        return "crear";
    }
    
    @PostMapping("/saveGrafica")
    public String guardarGrafica (@ModelAttribute Grafica grafica){
        graficaService.saveGrafica(grafica);
        return "redirect:/grafica";
    }
    
    @GetMapping("/deleteGrafica/{id}") //eliminar elemento
    public String eliminarGrafica (@PathVariable("id") Long idGrafica) {
        graficaService.delete(idGrafica);
        return "redirect:/grafica";
    }
}
