package com.lizana.mscalzado.application.service;


import com.lizana.mscalzado.application.mapper.StudentDtoMapper;
import com.lizana.mscalzado.application.mapper.StudentRequestMapper;
import com.lizana.mscalzado.application.usecases.StudentService;
import com.lizana.mscalzado.domain.model.Student;
import com.lizana.mscalzado.domain.model.dto.StudentDto;
import com.lizana.mscalzado.domain.port.StudentPersistencePort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentManagementService implements StudentService {


    private final StudentPersistencePort studentPersistencePort;
    private final StudentRequestMapper studentRequestMapper;
    private final StudentDtoMapper studentDtoMapper;

    public StudentManagementService(final StudentPersistencePort studentPersistencePort,
                                    final StudentRequestMapper studentRequestMapper,
                                    final StudentDtoMapper studentDtoMapper) {
        this.studentPersistencePort = studentPersistencePort;
        this.studentRequestMapper = studentRequestMapper;
        this.studentDtoMapper = studentDtoMapper;
    }


    @Override
    public List<StudentDto> getAllStudent() {

        List<StudentDto> studentDtoList = new ArrayList<>();
        List<Student> studentList = studentPersistencePort.getAll();
        for (Student student : studentList) {
            studentDtoList.add(studentDtoMapper.toDto(student));
        }
        return studentDtoList;
    }
}
