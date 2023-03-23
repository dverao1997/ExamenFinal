package com.dv.examen.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "profesor")
public class Profesor {
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

    private List<Ciclo> listCiclo;

}
