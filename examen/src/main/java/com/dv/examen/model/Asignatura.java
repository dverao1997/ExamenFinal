package com.dv.examen.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "asignatura")
public class Asignatura {

    private Long Id;
    private String nombre;
    private Integer n_horas;
    private Integer n_horas_practicas;
    private Integer n_horas_autonomas;

    private List<Profesor> listProfesor;
}
