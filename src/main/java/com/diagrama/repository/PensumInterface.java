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

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.diagrama.domain.Pensum;

public interface PensumInterface extends CrudRepository<Pensum, Integer> {

	@Query(value = "select new com.tallerperiodo.dominio.Pensum(pe.pensum_id, pe.materiaid,  pe.grupoid, est) from pensum pe inner join pe.estudiante est  "
			+ "where pe.pensum_id=?1 and pe.grupoid=?2", nativeQuery=false)
	public List<Pensum> getestudiantesbyPensum(int pensum_id, int grupoid);
	
	
}
