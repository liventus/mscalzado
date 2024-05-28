package com.lizana.mscalzado.infraestructure.rest.controller;


import com.lizana.mscalzado.application.usecases.StudentService;
import com.lizana.mscalzado.domain.model.dto.StudentDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/shoes")
public class ShoesController {


    private final StudentService studentService;

    public ShoesController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<StudentDto> getAll() {
        return studentService.getAllStudent();
    }


}
