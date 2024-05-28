package com.lizana.mscalzado.domain.model.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentDto {

    private String id;
    private String name;
    private String lastName;
    private String status;
    private int age;
}
