package com.lizana.mscalzado.application.usecases;


import com.lizana.mscalzado.domain.model.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudent();

}
