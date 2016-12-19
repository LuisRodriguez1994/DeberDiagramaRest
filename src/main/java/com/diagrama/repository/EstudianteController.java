/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @Luis Rodríguez
 */
package com.diagrama.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.diagrama.repository.EstudianteRepository;

@RestController
public class EstudianteController {

	@Autowired
	private EstudianteRepository estudianteRepository; 
	
}

