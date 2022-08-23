/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author josea
 */
public interface IProductoService {
    public List<Producto> getAllProducto();
    public Optional<Producto> get(Long id);
    public Producto getProductoById (long id);
    public void saveProducto(Producto producto);
    public void delete (long id);
}
