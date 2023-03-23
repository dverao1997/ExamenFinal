package com.dv.examen.repository;

import com.dv.examen.model.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsignaturaRepository extends MongoRepository<Asignatura,Long> {

}
