package com.lizana.mscalzado.application.mapper;


import com.lizana.mscalzado.domain.model.Student;
import com.lizana.mscalzado.domain.model.dto.request.StudentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentRequestMapper {


    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "status", target = "status")
    Student toDomain(StudentRequest request);
}




