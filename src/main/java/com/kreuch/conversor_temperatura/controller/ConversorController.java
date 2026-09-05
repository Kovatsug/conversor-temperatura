package com.kreuch.conversor_temperatura.controller;

import com.kreuch.conversor_temperatura.dto.ConversorRequest;
import com.kreuch.conversor_temperatura.dto.ConversorResponse;
import com.kreuch.conversor_temperatura.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    private final ConversorService service;

    @Autowired
    public ConversorController(ConversorService service) {
        this.service = service;
    }

    @PostMapping("/temperaturas/converter")
    public ConversorResponse converter(@RequestBody ConversorRequest request){
        return service.converter(request);
    }
}
