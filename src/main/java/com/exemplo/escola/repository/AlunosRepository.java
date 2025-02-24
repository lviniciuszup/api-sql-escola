package com.exemplo.escola.repository;

import com.exemplo.escola.model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
