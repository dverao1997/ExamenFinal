package com.dv.examen.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "periodo")
public class Periodo {
    private String periodo;
    private Integer year;
}
