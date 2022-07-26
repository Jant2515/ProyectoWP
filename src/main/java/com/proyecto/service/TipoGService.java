/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.TipoG;
import com.proyecto.repository.TipoGRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
@Service
public class TipoGService implements ITipoGService {

    @Autowired
    private TipoGRepository tipoGRepository;

    @Override
    public List<TipoG> listTipoG() {
        return (List<TipoG>) tipoGRepository.findAll();
    }
}
