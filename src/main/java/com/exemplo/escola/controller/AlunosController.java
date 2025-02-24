package com.exemplo.escola.controller;


import com.exemplo.escola.model.Alunos;
import com.exemplo.escola.services.AlunosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/alunos")
public class AlunosController {
    private final AlunosService alunosService;

    public AlunosController(AlunosService alunosService)
    {this.alunosService = alunosService;}

    @GetMapping
    public List<Alunos> listAlunos(){
        return alunosService.listAllAlunos();
    }
}
