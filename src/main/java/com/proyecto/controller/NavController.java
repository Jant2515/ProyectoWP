/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Amd;
import com.proyecto.entity.Computadora;
import com.proyecto.entity.DetalleOrden;
import com.proyecto.entity.Monitor;
import com.proyecto.entity.Nvidia;
import com.proyecto.entity.Orden;
import com.proyecto.entity.Persona;
import com.proyecto.entity.Procesador;
import com.proyecto.service.IAmdService;
import com.proyecto.service.IComputadoraService;
import com.proyecto.service.IDetalleOrdenService;
import com.proyecto.service.IMonitorService;
import com.proyecto.service.INvidiaService;
import com.proyecto.service.IOrdenService;
import com.proyecto.service.IPersonaService;
import com.proyecto.service.IProcesadorService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ad
 */
@Controller
public class NavController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IOrdenService ordenService;

    @Autowired
    private IDetalleOrdenService detalleOrdenService;
    
    
    // para almacenar los detalles de la orden
    List<DetalleOrden> detalles = new ArrayList<DetalleOrden>();

    // datos de la orden
    Orden orden = new Orden();

    @GetMapping("/home")
    public String index(Model model) {
        return "home";
    }

    //COMPUTADORAS
    @Autowired
    private IComputadoraService computadoraService;

    @GetMapping("/computadoras")
    public String index2(Model model) {
        List<Computadora> listaComputadora = computadoraService.getAllComputadora();
        model.addAttribute("titulo", "Tabla Computadoras");
        model.addAttribute("computadorasdataset", listaComputadora);
        return "computadoras";
    }

    //MONITORES
    @Autowired
    private IMonitorService monitorService;

    @GetMapping("/monitores")
    public String index3(Model model) {
        List<Monitor> listaMonitor = monitorService.getAllMonitor();
        model.addAttribute("titulo", "Tabla Monitores");
        model.addAttribute("monitoresdataset", listaMonitor);
        return "monitores";
    }

    //TARJETAS
    @GetMapping("/tarjetas")
    public String index4(Model model) {
        return "tarjetas";
    }

    //NVIDIA
    @Autowired
    private INvidiaService nvidiaService;

    @GetMapping("/nvidia")
    public String index5(Model model) {
        List<Nvidia> listaNvidia = nvidiaService.getAllNvidia();
        model.addAttribute("titulo", "Tabla Nvidia");
        model.addAttribute("nvidiadataset", listaNvidia);
        return "nvidia";
    }

    //AMD
    @Autowired
    private IAmdService amdService;

    @GetMapping("/amd")
    public String index6(Model model) {
        List<Amd> listaAmd = amdService.getAllAmd();
        model.addAttribute("titulo", "Tabla Amd");
        model.addAttribute("amddataset", listaAmd);
        return "amd";
    }

    //PROCESADORES
    @Autowired
    private IProcesadorService procesadorService;

    @GetMapping("/procesadores")
    public String index7(Model model) {
        List<Procesador> listaProcesador = procesadorService.getAllProcesador();
        model.addAttribute("titulo", "Tabla Procesador");
        model.addAttribute("procesadoresdataset", listaProcesador);
        return "procesador";
    }

    @GetMapping("/ayuda")
    public String index8(Model model) {
        return "ayuda";
    }

    @GetMapping("/descuentos")
    public String index9(Model model) {
        return "descuentos";
    }

    @GetMapping("/categorias")
    public String index10(Model model) {
        return "categorias";
    }

    private final Logger log = LoggerFactory.getLogger(NavController.class);

    @GetMapping("/productovista/{id}")
    public String productoVista(@PathVariable Long id, Model model) {
        log.info("Id producto que fue enviado parametro {}", id);
        Computadora computadora = new Computadora();
        Optional<Computadora> computadoraOptional = computadoraService.get(id);
        computadora = computadoraOptional.get();

        model.addAttribute("computadora", computadora);

        return "productovista";
    }
    
    @GetMapping("/productovista2/{id}")
    public String productoVista2(@PathVariable Long id, Model model) {
        log.info("Id producto que fue enviado parametro {}", id);
        Procesador procesador = new Procesador();
        Optional<Procesador> procesadorOptional = procesadorService.get(id);
        procesador = procesadorOptional.get();

        model.addAttribute("procesador", procesador);

        return "productovista2";
    }
    
    @GetMapping("/productovista3/{id}")
    public String productoVista3(@PathVariable Long id, Model model) {
        log.info("Id producto que fue enviado parametro {}", id);
        Computadora computadora = new Computadora();
        Optional<Computadora> computadoraOptional = computadoraService.get(id);
        computadora = computadoraOptional.get();

        model.addAttribute("computadora", computadora);

        return "productovista";
    }
    
    @GetMapping("/productovista4/{id}")
    public String productoVista4(@PathVariable Long id, Model model) {
        log.info("Id producto que fue enviado parametro {}", id);
        Computadora computadora = new Computadora();
        Optional<Computadora> computadoraOptional = computadoraService.get(id);
        computadora = computadoraOptional.get();

        model.addAttribute("computadora", computadora);

        return "productovista";
    }
    
    @GetMapping("/productovista5/{id}")
    public String productoVista5(@PathVariable Long id, Model model) {
        log.info("Id producto que fue enviado parametro {}", id);
        Computadora computadora = new Computadora();
        Optional<Computadora> computadoraOptional = computadoraService.get(id);
        computadora = computadoraOptional.get();

        model.addAttribute("computadora", computadora);

        return "productovista";
    }

    @PostMapping("/cart")
    public String addCart(@RequestParam Long id, @RequestParam Integer cantidad, Model model) {
        DetalleOrden detalleOrden = new DetalleOrden();
        Computadora computadora = new Computadora();
        Procesador procesador = new Procesador();
        double sumaTotal = 0;

        Optional<Computadora> optionalProducto = computadoraService.get(id);
        log.info("Producto añadido: {}", optionalProducto.get());
        log.info("Cantidad: {}", cantidad);
        computadora = optionalProducto.get();
        
        

        detalleOrden.setCantidad(cantidad);
        detalleOrden.setPrecio(computadora.getPrecio());
        detalleOrden.setNombre(computadora.getNombre());
        detalleOrden.setTotal(computadora.getPrecio() * cantidad);
        detalleOrden.setComputadora(computadora);
        
        

        //validar que le producto no se añada 2 veces
        Long idcomputadora = computadora.getId();
        boolean ingresado = detalles.stream().anyMatch(p -> p.getComputadora().getId() == idcomputadora);
        
       
        
        if (!ingresado) {
            detalles.add(detalleOrden);
        }

        sumaTotal = detalles.stream().mapToDouble(dt -> dt.getTotal()).sum();

        orden.setTotal(sumaTotal);
        model.addAttribute("cart", detalles);
        model.addAttribute("orden", orden);

        return "carrito";
    }

    // quitar un producto del carrito
    @GetMapping("/delete/cart/{id}")
    public String deleteProductoCart(@PathVariable Integer id, Model model) {

        // lista nueva de prodcutos
        List<DetalleOrden> ordenesNueva = new ArrayList<DetalleOrden>();

        for (DetalleOrden detalleOrden : detalles) {
            if (detalleOrden.getComputadora().getId() != id) {
                ordenesNueva.add(detalleOrden);
            }
        }

        // poner la nueva lista con los productos restantes
        detalles = ordenesNueva;

        double sumaTotal = 0;
        sumaTotal = detalles.stream().mapToDouble(dt -> dt.getTotal()).sum();

        orden.setTotal(sumaTotal);
        model.addAttribute("cart", detalles);
        model.addAttribute("orden", orden);

        return "carrito";
    }

    @GetMapping("/getCart")
    public String getCart(Model model, HttpSession session) {

        model.addAttribute("cart", detalles);
        model.addAttribute("orden", orden);

        //sesion
        model.addAttribute("sesion", session.getAttribute("idpersonas"));
        return "carrito";
    }

    @GetMapping("/order")
    public String order(Model model, HttpSession session) {

        Persona persona = personaService.findById(Long.parseLong("1")).get();

        model.addAttribute("cart", detalles);
        model.addAttribute("orden", orden);
        model.addAttribute("persona", persona);

        return "muestradeorden";
    }
}
