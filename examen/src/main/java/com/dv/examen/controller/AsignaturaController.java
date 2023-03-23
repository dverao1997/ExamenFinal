package com.dv.examen.controller;

import com.dv.examen.model.Asignatura;
import com.dv.examen.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asignatura")
public class AsignaturaController {

    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Asignatura>> listarAsignatura(){
        return new ResponseEntity<>(asignaturaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Asignatura> crear(@RequestBody Asignatura a){
        return new ResponseEntity<>(asignaturaService.save(a),HttpStatus.CREATED);
    }

    @PutMapping("/up/{id}")
    public ResponseEntity<Asignatura> act(@PathVariable Long id,@RequestBody Asignatura a){
        Asignatura asig=asignaturaService.findById(id);
        if(asignaturaService==null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            try{
                asig.setNombre(a.getNombre());
                asig.setN_horas(a.getN_horas());
                asig.setN_horas_practicas(a.getN_horas_practicas());
                asig.setN_horas_autonomas(a.getN_horas_autonomas());
                return  new ResponseEntity<>(asignaturaService.save(asig),HttpStatus.OK);
            }catch (DataAccessException e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/el/{id}")
    public ResponseEntity<Asignatura> eliminar(@PathVariable Long id){
        asignaturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
