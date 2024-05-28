package com.lizana.mscalzado.infraestructure.adapter.mapper;


import com.lizana.mscalzado.domain.model.Student;
import com.lizana.mscalzado.infraestructure.adapter.entity.StudentEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentDboMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "status", target = "status")
    StudentEntity toDbo(Student domain);

    @InheritInverseConfiguration
    Student toDomain(StudentEntity entity);
}