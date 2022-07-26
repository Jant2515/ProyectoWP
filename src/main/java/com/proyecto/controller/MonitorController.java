/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Monitor;
import com.proyecto.service.IMonitorService;
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
public class MonitorController {
    
    @Autowired
    private IMonitorService monitorService;
    
    @GetMapping("/monitor")
    public String index (Model model){
        List<Monitor> listaMonitor = monitorService.getAllMonitor();
        model.addAttribute("titulo","Tabla Monitores");
        model.addAttribute("monitores",listaMonitor);
        return "monitores";
    }
    
    @GetMapping("/monitorN")
    public String crearMonitor (Model model){
        model.addAttribute("monitor",new Monitor());
        return "crear";
    }
    
    @PostMapping("/saveMonitor")
    public String guardarMonitor (@ModelAttribute Monitor monitor){
        monitorService.saveMonitor(monitor);
        return "redirect:/monitor";
    }
    
    @GetMapping("/deleteMonitor/{id}") //eliminar elemento
    public String eliminarMonitor (@PathVariable("id") Long idMonitor) {
        monitorService.delete(idMonitor);
        return "redirect:/monitor";
    }
}
