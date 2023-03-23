package com.dv.examen.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "carrera")
public class Carrera {
    private String nombre;
    private String descripcion;

    private List<Periodo> listPeriodo;
}
