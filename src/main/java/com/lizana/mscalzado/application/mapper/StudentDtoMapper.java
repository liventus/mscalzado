package com.lizana.mscalzado.application.mapper;



import com.lizana.mscalzado.domain.model.Student;
import com.lizana.mscalzado.domain.model.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentDtoMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "age", target = "age")
    StudentDto toDto(Student domain);
}
