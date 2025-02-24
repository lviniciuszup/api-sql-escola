package com.exemplo.escola.services;

import com.exemplo.escola.model.Alunos;
import com.exemplo.escola.repository.AlunosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunosService {
    private final AlunosRepository alunosRepository;

    public AlunosService(AlunosRepository alunosRepository){
        this.alunosRepository = alunosRepository;
    }
    public List<Alunos> listAllAlunos(){
        return alunosRepository.findAll().stream()
                .map(alunos -> new Alunos(
                        alunos.getNome(),
                        alunos.getIdade()
                )).collect(Collectors.toList());


    }

}