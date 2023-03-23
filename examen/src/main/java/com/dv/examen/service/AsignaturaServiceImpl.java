package com.dv.examen.service;

import com.dv.examen.model.Asignatura;
import com.dv.examen.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura,Long> implements AsignaturaService{
    @Autowired
    AsignaturaRepository asignaturaRepository;
    @Override
    public CrudRepository<Asignatura, Long> getDao() {
        return asignaturaRepository;
    }
}
