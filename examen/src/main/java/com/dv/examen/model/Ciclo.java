package com.dv.examen.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "ciclo")
public class Ciclo {
    private String nombre;
    private String decripcion;

    private List<Carrera> listCarrera;
}
