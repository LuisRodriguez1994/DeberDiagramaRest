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

import org.springframework.data.repository.CrudRepository;

import com.diagrama.domain.PeriodosLectivos;

public interface PeriodoRepository extends CrudRepository<PeriodosLectivos, Integer>{

}
