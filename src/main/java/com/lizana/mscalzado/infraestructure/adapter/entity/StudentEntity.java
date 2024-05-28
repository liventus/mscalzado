package com.lizana.mscalzado.infraestructure.adapter.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "calzado")
public class StudentEntity {

    @Id
    private String id;
    private String name;
    private String lastName;
    private String status;
    private int age;
    private LocalDateTime dateOfCreation;


}
