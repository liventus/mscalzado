package com.lizana.mscalzado.infraestructure.rest.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/shoes")
public class ShoesController {


    @GetMapping
    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getAll() {
        return "service";
    }


}
